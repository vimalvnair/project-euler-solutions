;; Euclid's fromula: a = m^2 - n^2; b = 2mn; c = m^2 + n^2 where m > n
;; a + b + c = 1000 => m (m + n) = 500

(defn find-proper-m-and-n [m]
  (loop [n-range (range 1 m)]
    (if-not (empty? n-range)
      (let [mn-expr (* m (+ m (first n-range)))]
        (if (= mn-expr 500 )
          (list m (first n-range))
          (if (< mn-expr 500)
            (recur (rest n-range))))))))

(defn find-mn []
  (loop [m 2]
    (let [mn-pair (find-proper-m-and-n m)]
      (if-not (empty? mn-pair)
        mn-pair
        (recur (inc m))))))


(def mn-pair find-mn)
(def m (first (mn-pair)))
(def n (last (mn-pair)))

(def a (- (* m m) (* n n)))
(def b (* 2 m n))
(def c (+ (* m m) (* n n)))

(println (* a b c))


