(defproject everything-will-flow "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-alpha5"]
                 [incanter/incanter-charts "1.5.6"]]
  :jvm-opts ["-Xmx10g" "-server" "-XX:+UseG1GC"])
