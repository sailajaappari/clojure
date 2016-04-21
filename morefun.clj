(map (fn [x] 
       (* x 10)) [1 2 3 4 5])
(reduce (fn [x y]
             (* x y)) [1 2 3 4 5])

(filter (fn [x]
          (< x 30)) [10 20 30 40 50])
(map (fn [x]
          (< x 30)) [10 20 30 40 50])
(filter (fn [x y]
             (* x y)) [1 2 3 4 5])
