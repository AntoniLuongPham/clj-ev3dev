(ns clj-ev3dev.sensors.infrared
  (:require [clj-ev3dev.sensors        :as sensors]
            [clj-ev3dev.core           :as core]
            [clj-ev3dev.sensors.common :as common]))

(defn find-infrared-sensor
  ([session in-port]
   (sensors/find-sensor session "infrared" in-port))
  ([session]
   (sensors/find-sensor session "infrared" "in4")))

(defn read-proximity
  "Reads the proximity value (in range 0 - 100)
  reported by the infrared sensor. A value of 100
  corresponds to a range of approximately 70 cm."
  [session sensor]
  (common/read-value session sensor))