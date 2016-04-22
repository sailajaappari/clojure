(= (let [x 1 y 2] (+ x y)) 3)
(= (let [[a b] [2 3 4]] (* a b)) 6)
(for [x [0 1 2 3 4 5 6]
        :let [y (* x 3)]
        :when (even? y)] y)
(for [x (range 6)
        :let [y (* x 3)]
        :when (even? y)] y)
(for [x (range 1 5)] (* x x))
(for [x (range 1 5) y (range 6 10)] (+ x y))
(for [x (range 3) y (range 3)] [x y])
(for [x (range 3) y (range 3)
        :when (not= x y)] [x y]) 
(for [x (range 3) y (range 3)
        :while (not= x y)] [x y]) 
(for [x (range 1 6)
        :let [y (* x x)
              z (* x x x)]] [x y z])
(for [x [1 2 3] y ['a' 'b' 'c']] [x y])


