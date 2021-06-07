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


;; create vectors
(defn examples-create-vectors []
  (println (create-simple-vector))
  (println (create-more-complex-vector))
  (println (create-a-vector))
  (print-count "complex" (create-more-complex-vector))
  (print-count "simple" (create-a-vector))
  (println "create an empty vector" (vector))
  )

;; manipulate vector first, rest, nth
(defn example-manipulate-vector []
  (println "The first element of vector is...." (first (create-simple-vector)))
  (println "The rest of vector is...." (rest (create-simple-vector)))
  (println "Return 3th value (index start at zero)..." (nth ["a1" "b2" "c3" "d4" "e5"] 2))
  )

;; growing vectors
(defn example-growing-vector []
  (println "Conjunction for one vector (add element to the end..." (conj ["a" "b"] "c"))
  ;; cons return a sequence
  (println "Construction for one vector (add element at the first position..." (cons "a" ["b" "c"]))
  )

(defn main-vector []
  (examples-create-vectors)
  (example-manipulate-vector)
  (example-growing-vector)
  )

;; (rest ["a" "b" "c"]) retourne une sequence et non pas un vector
;; sequence = sort of generic collection

;; List
(def simple-list '("zero" "one" "two" "three"))

(defn main-list []
  (println "The first list" '(1 2 3))
  (println "A more complex list" '(1 "a text follow by a boolean value" true " and a float number" 3.1416))
  (println "Count for simple list" (count simple-list))
  (println "First of simple list" (first simple-list))
  (println "Rest of simple list" (rest simple-list))
  (println "Nth 2 of simple list" (nth simple-list 2))
  (println "Conj on simple list" (conj simple-list "minus_one"))
  )

;; hash map

(def FirstHashMap {"LastName" "Anthony" "Name" "Cassaigne" "Sport" "Footing"})
(def KeyWordHashMap {:lastname "Anthony" :name "Cassaigne" :sport "footing"})

(defn first-hash-map []
  (println FirstHashMap))


(defn how-to-get-value-v1 []
  (println (get FirstHashMap "LastName")))

(defn how-to-get-value-v2 []
  (println (FirstHashMap "LastName")))

(defn hash-map-with-keyword-v1 []
  (println "Lastname from v1:" (KeyWordHashMap :lastname)))

(defn hash-map-with-keyword-v2 []
  (println "Lastname from v2:" (:lastname KeyWordHashMap)))

(defn create-new-hash-map []
  (println "New map" (assoc KeyWordHashMap :hobby "reading"))
  (println "New map 2" (assoc KeyWordHashMap :pet "cats & dogs" :hobby "reading")))

(defn remove-some-key-from-hash-map []
  (println "New map less key" (dissoc KeyWordHashMap :sport)))

(defn remove-all-keys-from-map []
  (println "Empty after removing all keys" (dissoc KeyWordHashMap :sport :lastname :name)))

(defn get-all-keys-from-map []
  (println "All keys from map......:" (keys KeyWordHashMap)))

(defn get-all-values-from-map []
  (println "All values from map....:" (vals KeyWordHashMap)))

(defn count-from-map []
  (println "Count element in map...:" (count KeyWordHashMap)))

(defn first-element-of-map []
  (println "First element of map without warranty (map is not ordered)....:" (first KeyWordHashMap)))

;; main map

(defn main-hash-map []
  (first-hash-map)
  (how-to-get-value-v1)
  (how-to-get-value-v2)
  (hash-map-with-keyword-v1)
  (hash-map-with-keyword-v2)
  (create-new-hash-map)
  (remove-some-key-from-hash-map)
  (remove-all-keys-from-map)
  (get-all-keys-from-map)
  (get-all-values-from-map)
  (count-from-map)
  (first-element-of-map))


;; sets
;; in a set all values are unique value

(def my-colors-set #{:red :blue :yellow})

(defn set-contain-a-value []
  (if (contains? my-colors-set :blue)
    (println "Blue is in this set" my-colors-set)
    (println "Blue is not present in this set!"))
  )

(defn question-set-response-true []
  (println "Yellow is it in the color set?" (contains? my-colors-set :yellow)))

(defn question-set-response-false []
  (println "Orange is it in the color set?" (contains? my-colors-set :orange)))

(defn return-blue-value-from-color-set []
  (println "I'm lookfing for :blue =>" (my-colors-set :blue)))

(defn return-blue-value-from-color-set-2 []
  (println "I'm lookfing for (v2) :blue =>" (:blue my-colors-set)))

(defn return-nil-value-from-color-set []
  (println "I'm lookfing for :orange =>" ( my-colors-set :orange)))

(defn return-nil-value-from-color-set-2 []
  (println "I'm lookfing for (v2) :orange =>" (:orange my-colors-set)))

(defn add-orange-to-new-colors-set []
  (println "More colors to set" (conj my-colors-set :orange)))

(defn remove-red-from-color-set []
  (println "Fewer colors set" (disj my-colors-set :red)))

(defn main-set []
  (set-contain-a-value)
  (question-set-response-true)
  (question-set-response-false)
  (return-blue-value-from-color-set)
  (return-blue-value-from-color-set-2)
  (return-nil-value-from-color-set)
  (return-nil-value-from-color-set-2)
  (add-orange-to-new-colors-set)
  (remove-red-from-color-set)
  )



;; MAIN
(defn -main
  [& args]
  (println args)
  (main-hello)
  (main-vector)
  (main-list)
  (main-hash-map)
  (main-set)
  )
