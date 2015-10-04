(defn mul_3_or_5 [n]
  (or (zero? (rem n 3)) (zero? (rem n 5))))

(defn sum_of_muls [refiner n]
  (reduce + (filter refiner (range 1 n))))

(sum_of_muls mul_3_or_5 1000)
