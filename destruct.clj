(defn my-first [[first-thing]]
    first-thing)
(my-first ["run" "car" "bike"])

(defn fruits [[one two & more]]
   (println (str "your first fruit is : " one))
   (println (str "your second fruit is : " two))
   (println (str "the remaining fruist are : " 
            (clojure.string/join ", " more))))
(fruits ["Apple" "Banana" "Cherry" "Mango" "Orange"])


(defn destmap [{:keys [a b]}]
   (println (str "a : " a))
   (println (str "b : " b)))
(destmap {:a 20 :b 30})
(destmap {:a "apple" :b "banana"})


