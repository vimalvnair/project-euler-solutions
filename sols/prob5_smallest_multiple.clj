(defn smallest_number_with_multiple_in_range [divisor_range]
  (let [no_of_divisors  (count divisor_range)
        incrementor (last divisor_range)]
    (loop [n incrementor]
      (if (= no_of_divisors (count (for [x divisor_range :while (zero? (rem n x))] (rem n x) )))
        n (recur (+ n incrementor)))
      ))
  )

(time (smallest_number_with_multiple_in_range (range 1 21)))
