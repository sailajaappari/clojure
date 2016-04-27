
(defn gen-map 
  ([nums] (gen-map (rest nums) {} (first nums) (count nums) 0))
  ([nums m fn cnt i]
   (if (= cnt 0)
       m
       (gen-map (rest nums) (assoc m fn i) (first nums) (dec cnt) (inc i)))))
(defn find-index [v val]
  (get (gen-map v) val))

(find-index [10 20 15 7 8 24] 15)
(find-index [10 15 20 5] 25)
