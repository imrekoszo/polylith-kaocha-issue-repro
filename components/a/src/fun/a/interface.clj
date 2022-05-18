(ns fun.a.interface
  (:require [fun.b.interface :as b]))

(defn a []
  (println "Important change")
  :a)
