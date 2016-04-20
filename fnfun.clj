;;simple anonymous function
(= ((fn [a b] (+ a b)) 10 15) 25)
(compare ((fn [a b] (/ a b)) 10 3) 3)

;; Simple anonymous function passed to map
(= (map (fn [x] (* x x)) (range 1 5)) '(1 4 9 16))

;;Instantly call an anonymous overload function
(= ((fn ([x] (* x x)) ([x y z] (+ x y z))) 10 20 30) 60)
(= ((fn ([x] (* x x)) ([x y z] (+ x y z))) 10) 100)

;;Define and instantly call an anonymous variadic function "nums" is a list
(= ((fn [& nums] (/ (apply + nums) (count nums))) 1 2 3 4) 5/2)

;;Define & instantly call anonymous mixed function 'nums' is a list & x is a number
(= ((fn [x & nums] (+ x (/ (apply + nums) (count nums)))) 20 1 2 3 4) 45/2)
(= (float ((fn [x & nums] (+ x (/ (apply + nums) (count nums)))) 20 1 2 3 4))  22.5)
