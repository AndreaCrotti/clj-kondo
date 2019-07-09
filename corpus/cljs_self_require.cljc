(ns cljs-self-require
  #?(:cljs (:require-macros [cljs-self-require :refer [foo bar]])))

(defmacro foo [x]
  `(do (println ~x) (println ~x)))

#?(:clj (defmacro bar [x]
          `(do (println ~x) (println ~x))))

(foo 1)
(bar 1)
