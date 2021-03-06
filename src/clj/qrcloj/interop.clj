(ns qrcloj.interop)


(defn int-to-str [n b] (Integer/toString n b))
(defn str-to-int
  ([s] (Integer/parseInt s))
  ([s b] (Integer/parseInt s b)))

(def char-to-ascii int)

(defn abs [n]
  (if (neg? n)
    (* -1 n)
    n))

