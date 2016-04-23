(defn factorial [n]
  (loop [n n acc 1]
      (if (= n 0)
         acc
         (recur (dec n) (* acc n)))))
(factorial 1000N)


;; Factorial using reduce 
(defn factorial1 [n]
   (reduce * (range 1 (inc n))))
(factorial1 10)


(defn sum [n]
  (loop [n n s 0]
     (if (= n 0)
        s
        (recur (dec n) (+ s n)))))
(sum 100000)


(loop [x 10]
   (when (> x 1)
      (println x)
      (recur (- x 2))))
