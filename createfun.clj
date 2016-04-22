(= ((comp str + ) 1 2 3) "6")  
(= ((comp second reverse) '("a" 1 5 "b")) 5) 
(filter (comp not zero?) [1 2 0 0 2 1 3])
(= (map (comp - (partial + 3) (partial * 2)) [1 2 3 4 5]) '(-5 -7 -9 -11 -13))

(defn square [x] (* x x))
(defn cube [x] (* x x x))
(= (let [inc-and-square (comp square inc)] (inc-and-square 5)) 36)
(= (let [double-dec (comp dec dec)] (double-dec 10)) 8)
(= (let [square-and-cube-add (comp +  cube  square)] (square-and-cube-add 5)) 15625)
(= (let [square-and-dec (comp dec square)] (square-and-dec 10)) 99)


