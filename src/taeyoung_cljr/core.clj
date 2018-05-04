(ns taeyoung-cljr.core
  (:gen-class))

(defn my-print
  "프린트 함수"
  [obj]
  (println "my-print" obj)
)

(defn -main
  "lein run을 하면 이 함수가 실행됨."
  [& args]
  (my-print "아빠!!")
  (my-print "again")
  ;(println "Hello, World!" args)
  )
 