(ns prequel.core
  (:gen-class)
  )
(require '[clj-yaml.core :as yaml])



(defn parse-given)
  (defn parse-object)
  (defn parse-SQL)
  (defn parse-KVP)
  (defn parse-function)
  (defn parse-TEST)
  


(defn -main
  "I don't do a whole lot ... yet."
  [fname]
  (when (nil? fname)
        (println "USAGE: lein run path_to_yaml"))
  (println (yaml/parse-string (slurp fname))))
  
