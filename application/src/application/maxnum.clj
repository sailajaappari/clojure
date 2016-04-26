(defn max-val
  ([nums]
     (max-val (rest nums) (first nums)))
  ([nums x]
     (if (empty? nums)
         x
         (max-val (rest nums) (if (> (first nums) x)
                                  (first nums)
                                   x)))))

(max-val [10 12 5 15 28 24])



(def nums [10 20 15 26 19])
(def x (first nums))
(defn max-num [nums x]
  (loop [nums nums x x]
    (if (empty? nums)
        x
        (recur (rest nums) (if (< x (first nums)) (first nums) x)))))

(max-num nums x)
