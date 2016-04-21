(map (fn [x] 
       (* x 10)) [1 2 3 4 5])
(reduce (fn [x y]
             (* x y)) [1 2 3 4 5])

(filter (fn [x]
          (< x 30)) [10 20 30 40 50])
(map (fn [x]
          (< x 30)) [10 20 30 40 50])

(filter (fn [[k v]]
            (even? k)) {1 "a", 2 "b", 3 "c", 4 "d"})
(filter (fn [x]
            (= (count x) 1)) ["a" "ab" "b" "bc" "c" "abc" "cdef"])
