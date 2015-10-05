(defn palindrome_number? [n]
  (= (str n) (apply str (reverse (str n))))
  )

(def number_range (range 100 1000))

(defn palindrome_list [number_range] (
                          for [x number_range  y number_range :when (palindrome_number? (* x y))] (* x y)))

(apply max (palindrome_list number_range))
