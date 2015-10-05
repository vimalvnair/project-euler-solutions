(defn fib_less_than [n]
  (loop [current 1 previous 0 collector []]
    (if (<= current n)
      (recur (+ current previous) current (conj collector current)) collector)
    ))

(reduce + (filter even? (fib_less_than 4000000)))
