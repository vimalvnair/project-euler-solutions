(defn prime? [n]
  (let [limit (int (/ n (Math/sqrt n)))]
    (loop [x 2]
      (if (and (zero? (rem n x)) (not= n 2)) false
          (if (> x limit) true (recur (inc x)))))))

(defn prime-factors-of [n]
  (loop [number n x 2 factors []]
    (if (and (zero? (rem number x)) (prime? x))
      (recur (/ number x) 2 (conj factors x))
      (if (not= number 1) (recur number (inc x) (conj factors 0)) factors))))

(apply max (prime-factors-of 600851475143))
