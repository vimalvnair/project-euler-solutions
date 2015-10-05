(defn fib-less-than [n]
  (loop [current 1 previous 0 collector []]
    (if (<= current n)
      (recur (+ current previous) current (conj collector current)) collector)))

(reduce + (filter even? (fib-less-than 4000000)))
