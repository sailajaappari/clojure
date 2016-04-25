(defn hello
  ([] (str "Hello world"))
  ([a] (str "Hello " a))
  ([a & more] (str "Hello group " 
              (apply str (interpose "," (concat (list a) more))) )))

(hello)
(hello "India")
(hello "James" "Jack" "John")
