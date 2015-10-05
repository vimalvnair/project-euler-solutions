(defn mul-3-or-5 [n]
  (or (zero? (rem n 3)) (zero? (rem n 5))))

(defn sum-of-muls [refiner n]
  (reduce + (filter refiner (range 1 n))))

(sum-of-muls mul-3-or-5 1000)
