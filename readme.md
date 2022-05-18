<img src="logo.png" width="30%" alt="Polylith" id="logo">

Repro case for https://github.com/imrekoszo/polylith-kaocha/issues/1

On this branch there is one change to component `a` since the stable point. When invoking `clojure -M:poly test :project` I would expect it
to run tests for `a`, `d`, and `p` only.
