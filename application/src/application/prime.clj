(defn is-prime
  ([num] (is-prime num 2))
  ([num cnt]
     (if (>= cnt (/ num 2))
         true
         (if (= 0  (rem num cnt))
             false
             (is-prime num (inc cnt))))))
(is-prime 13)
(is-prime 15)



(defn is-prime1 [num]
  (loop [num num cnt 2]
     (if (> cnt (/ num 2))
         true
         (if (= (rem num cnt) 0)
             false
             (recur num (inc cnt))))))
(is-prime1 13)
(is-prime1 15)
(is-prime 2)
