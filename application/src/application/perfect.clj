
(defn is-perfect
  ([num] (is-perfect num 1 0))
  ([num cnt sum]
   (if (> cnt (/ num 2))
       (= sum num)
       (if (= (rem num cnt) 0)
          (is-perfect num (inc cnt) (+ sum cnt))
          (is-perfect num (inc cnt) sum)))))
(is-perfect 6)
(is-perfect 100)
