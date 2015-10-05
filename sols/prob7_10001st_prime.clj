(defn prime? [n]
  (let [limit (int (/ n (Math/sqrt n)))]
    (loop [x 2]
      (if (and (zero? (rem n x)) (not= n 2)) false
          (if (> x limit) true (recur (inc x)))))))

(defn nth-prime [n]
  (loop [x 2 no-of-primes 0]
    (if (prime? x)
      (if (= (inc no-of-primes) n) x (recur (inc x) (inc no-of-primes)))
      (recur (inc x) no-of-primes))))

(nth-prime 10001)
