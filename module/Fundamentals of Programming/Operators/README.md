## ➕ Operators

> **Module Scope:**
> Operators are the **symbols of logic and math** in programming. They let you manipulate data, make comparisons, and perform calculations. This module deep-dives into how operators behave, interact, and sometimes backstab you with type coercions or precedence rules.

---

### 🎯 **Objectives**

* Understand different categories of operators and their use cases.
* Learn how operator precedence and associativity influence expression outcomes.
* Apply compound expressions in decision-making and calculations.
* Identify and avoid operator-related pitfalls and ambiguity.

---

### 📚 **Key Categories of Operators**

#### 🔢 Arithmetic Operators

* `+`, `-`, `*`, `/`, `%`
* Integer division vs float division
* Order of operations (PEMDAS rules)

#### 🔍 Relational Operators

* `==`, `!=`, `>`, `<`, `>=`, `<=`
* Comparisons in conditional statements
* Comparing different data types (watch out!)

#### 🧠 Logical Operators

* `&&` (AND), `||` (OR), `!` (NOT)
* Truth table fundamentals
* Short-circuit behavior (performance booster or logic killer)

#### 🧮 Assignment Operators

* `=`, `+=`, `-=`, `*=`, `/=`, `%=`
* Chain assignments and compound updates

#### ⚙️ Bitwise Operators

* `&`, `|`, `^`, `~`, `<<`, `>>`
* Binary-level data manipulation
* Use cases in optimization and flags

#### 🧾 Miscellaneous Operators

* Increment/Decrement: `++`, `--`
* Conditional (Ternary): `condition ? expr1 : expr2`
* `sizeof`, address-of (`&`), dereference (`*`)

---

### 🧠 Pro Tips

* **Know your operator precedence** or be ready to debug ghost bugs.
* Brackets are free — **use them liberally** for clarity.
* Never mix data types in arithmetic unless you're **explicitly** casting.
* Watch out for **integer division** — it's a trap in many languages.

---

### 🚧 Common Pitfalls

* `a = b == c` vs `a == b == c` — this is not math class.
* Misusing post-increment vs pre-increment (`i++` vs `++i`)
* `if(a = 5)` — congrats, you just assigned, not compared.
* Bitwise vs Logical confusion: `&` ≠ `&&`, `|` ≠ `||`

---

### 🧪 Suggested Practice Problems

* **3 Psychos** – Mixing arithmetic and logical conditions
* **Debt Repay** – Complex conditions with comparison chains
* **Dollars & Cents** – Precision and rounding issues
* **Reverse a 3-digit number** – Modulus and integer division
* **Tic Tac Toe** – Nested conditions with relational and logical combos
* **Treasure Hunter** – Bitwise ops for map/data tracking

---

### 🧰 Tools and Resources

* [Operator Precedence Table (C++)](https://en.cppreference.com/w/cpp/language/operator_precedence)
* [Python Docs on Expressions](https://docs.python.org/3/reference/expressions.html)
* Interactive debuggers like [repl.it](https://replit.com/) or [Godbolt Compiler Explorer](https://godbolt.org/)

---

### 🔚 Summary

Operators may seem basic, but the devil is in the details. Mastering them means fewer logic bugs, cleaner conditions, and more elegant code. It’s not about knowing the symbols — it’s about knowing when, how, and **why** to use them.

