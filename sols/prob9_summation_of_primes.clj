(defn prime? [n]
  (let [limit (int (/ n (Math/sqrt n)))]
    (loop [x 2]
      (if (and (zero? (rem n x)) (not= n 2)) false
          (if (> x limit) true (recur (inc x)))))))

(defn primes-below [n]
  (loop [x 2 primes []]
    (if (and (prime? x) (< x n))
      (recur (inc x) (conj primes x))
      (if (< x n) (recur (inc x) (conj primes 0)) primes))))

(time (println (reduce + (primes-below 2000000))))
