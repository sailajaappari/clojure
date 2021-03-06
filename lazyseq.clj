(= (take 5 (iterate inc 1)) '(1 2 3 4 5))
(= (take 5 (iterate dec 5)) '(5 4 3 2 1))
(= (drop 5 (range 10)) '(5 6 7 8 9))
(= (repeat 5 "a") '("a" "a" "a" "a" "a"))
(= (repeat 4 1) '(1 1 1 1))
(= (take 5 (range 10)) '(0 1 2 3 4))
(= (take 3 (repeat "a")) '("a" "a" "a"))
(= (take 5 (iterate (fn [x] x) :foo)) (repeat 5 :foo))
