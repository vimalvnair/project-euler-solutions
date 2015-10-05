(defn palindrome-number? [n]
  (= (str n) (apply str (reverse (str n)))))

(def number-range (range 100 1000))

(defn palindrome-list [number-range]
  (for [x number-range  y number-range :when (palindrome-number? (* x y))]
    (* x y)))

(apply max (palindrome-list number-range))
