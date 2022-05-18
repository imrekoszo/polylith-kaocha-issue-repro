(ns fun.d.core
  (:require [fun.a.interface :as a]
            [fun.b.interface :as b]
            [fun.c.interface :as c]))

(defn stuff []
  [(a/a) (b/b) (c/c)])

(defn -main []
  (println "Extremely useful software lmfao" (stuff)))
