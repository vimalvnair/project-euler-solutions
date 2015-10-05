(defn smallest-number-with-multiple-in-range [divisor-range]
  (let [no-of-divisors  (count divisor-range)
        incrementor (last divisor-range)]
    (loop [n incrementor]
      (if (= no-of-divisors (count (for [x divisor-range :while (zero? (rem n x))] (rem n x) )))
        n (recur (+ n incrementor))))))

(time (smallest-number-with-multiple-in-range (range 1 21)))
