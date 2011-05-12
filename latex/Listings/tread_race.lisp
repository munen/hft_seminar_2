(def visitors (ref #{}))
(defn hello 
  "Hello world function. Remembering previous calls in a transaction"
  [name]
  (dosync
      (if @visitors name
        (str "Welcome back, " name)
        (do
          (alter visitors conj name)
      (str "Hello, " name)))))
