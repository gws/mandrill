(ns gws.mandrill.api.webhooks
  (:refer-clojure :exclude [list update])
  (:require [gws.mandrill.api :refer [defapi]]))

(defapi list)
(defapi add)
(defapi info)
(defapi update)
(defapi delete)
