(def s "abc 123 abe cde fgr abgh anhf")
(defn grep-search [s1]
  (re-seq #"(?i)[a]\w+" s1))
(grep-search s)
