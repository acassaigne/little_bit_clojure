(ns hello-example.core
  (:gen-class))

;; Hello example
;; string...
(defn say-hello [] (println "Hello you!"))

(defn say-welcome [whom]
  (println "Welcome to"
           (str whom ".")
           )
  )

(defn average [a b] (/ (+ a b) 2.0))

(defn display-average [a b]
  (println "The average of" a "and" b "is"
           (average a b))
  )

(defn chatty-average [a b]
  (println "chatty-average function called")
  (println "** first argument" a)
  (println "** second argument" b)
  (average a b)
  )

(defn main-hello []
  (say-hello)
  (say-welcome "Anthony")
  (display-average 4 2)
  (chatty-average 4 2)
  )

;; try vector

(defn create-simple-vector []
  (vector 1 2 3))


(defn create-more-complex-vector []
  (vector "first"
          2
          true
          ["even" "another" "vector" "in" "vector"])
  )

(defn create-a-vector []
  (vector "a" "b" "c"))

(defn print-count [message v]
  (println "Length of" message "vector is...." (count v))
  )


(defn main-vector []
  (println (create-simple-vector))
  (println (create-more-complex-vector))
  (println (create-a-vector))
  (print-count "complex" (create-more-complex-vector))
  (print-count "simple" (create-a-vector))
  (println "create an empty vector" (vector))
  (println "The first element of vector is...." (first (create-simple-vector)))
  (println "The rest of vector is...." (rest (create-simple-vector)))
  )

;; main
(defn -main
  [& args]
  (println args)
  (main-hello)
  (main-vector)
  )
