(defn sum-of-squares [number-range]
  (reduce + (map #(* % %) number-range)))

(defn square-of-sum [number-range]
  (let [sum (reduce + number-range)]
    (* sum sum)))

(- (square-of-sum (range 1 101)) (sum-of-squares (range 1 101)))
