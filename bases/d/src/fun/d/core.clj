(ns fun.d.core
  (:require [fun.a.interface :as a]
            [fun.b.interface :as b]
            [fun.c.interface :as c]
            [fun.s.interface :as s]))

(defn stuff []
  [(a/a) (b/b) (c/c) (s/s 0)])

(defn -main []
  (println "Extremely useful software lmfao" (stuff)))
