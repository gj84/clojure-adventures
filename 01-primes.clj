(defn is_divisor_of_n
  "Create a function to check if a number divides n"
  [n]
  (fn [m] (= (mod n m) 0)))

(defn is_prime
  "Check if number is prime"
  [n]
  (empty? (filter (is_divisor_of_n n) (range 2 (quot n 2)))))

(println (is_prime 809))
