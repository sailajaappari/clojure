
(defn fact [num]
  (loop [n num f 1]
        (if (= n 0)
            f
            (recur (dec n) (* num f)))))
(fact 5) 
(fact 1000N)
(fact 0)

(def f 1)
(def cnt 1)
(defn fact1
  ([num] (fact1 num cnt f))
  ([num cnt f]
   (if (> cnt num)
       f
       (fact1 num (inc cnt) (* f cnt)))))
(fact1 5)
(fact1 0)
(fact1 10N)
