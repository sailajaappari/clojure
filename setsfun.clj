(= (sorted-set 1 1 2 1 3 2 5) #{1 2 3 5})
(= (sorted-set-by > 1 1 2 3 4 5 2 3) #{5 4 3 2 1})
(= (get #{1 2 3} 4) nil)
(= (conj #{1 2} 3 4) #{1 2 3 4})
(= (disj #{} 11 12) #{})
(= (disj #{0} 123) #{1})
(= (clojure.set/union #{1 2 3} #{2 3 4} #{}) #{1 2 3 4})
(= (clojure.set/intersection #{1 2 3} #{2 3 4} ) #{2 3})
(= (clojure.set/difference #{1 2 3} #{3 4} #{2 3}) #{1})                      
(= (clojure.set/select odd? #{1 2 3 4}) #{1 3})
(= (clojure.set/subset? #{} #{1 2 3 4}) true)
(= (clojure.set/superset? #{1 2 3} #{1}) true)
(= (subseq (sorted-set 1 2 1 2 3 2 4) > 2) '(3 4))
(= (rsubseq (sorted-set 1 2 3 1 2 3 4) > 2) '(4 3))









