 (defn is-small [num]
        (if (< num 100)
           "small"
           "large")) 
(is-small 50)
(is-small 150)

;; max of number 
(defn max [m n]
    (if (< m n)
       (do (print "n is larger")
            :n)
       (do (print "m is larger")
            :m)) )
(max 25 35)
(max 25 15)

;; Even or odd using functions
(defn eod [x]
      (if (= (mod x 2) 0)
          (println "even")
          (println "odd")) )
(eod 10)
(eod 15)

