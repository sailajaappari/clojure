(def sum 0)
(def cnt 1)
(defn is-perfect
  ([num] (is-perfect num cnt sum))
  ([num cnt sum]
   (if (> cnt (/ num 2))
       (if (= num sum)
           true
           false)
       (if (= (rem num cnt) 0)
           (is-perfect num (inc cnt) (+ sum cnt))
           (is-perfect num (inc cnt) sum))
      )))
(is-perfect 6)
(is-perfect 100)
