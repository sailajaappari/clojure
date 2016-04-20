;; defn simple function
(defn foo [a b c] (* a b c))
(foo 1 2 3)
(foo 4 5 6)

;; function with in if
(defn bar [a b & [c]]
       ( if c
           (* a b c)
           (* a b 10)))
(bar 5 6)
(bar 4 5 6)

;; overload function
(defn bar ([a b] (* a b)) ([a b c] (* a b c)))
(bar 10 20)
(bar 10 20 30)


;;function with map
(defn baz [a b & {:keys [c d] :or {c 10 d 20}}] (* a b c d))
(baz 2 3)
(baz 2 3 :c 5)
(baz 2 3 :c 5 :d 6)
