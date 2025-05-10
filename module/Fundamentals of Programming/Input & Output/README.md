## 📥 Input & Output

> **Module Scope:**
> This section focuses on how a program interacts with the external world — taking input from the user or other systems and displaying output in a clear, formatted way. While it may seem basic, mastering I/O is crucial for clean coding and competitive programming setups.

---

### 🎯 **Objectives**

* Learn how to accept user input and display output in various formats.
* Understand character encoding (e.g., ASCII).
* Format output precisely (newlines, tabs, precision, etc.).
* Lay the groundwork for parsing and data manipulation.

---

### 📚 **Key Topics**

#### 🧾 Basic Output

* `print()`, `printf()`, `cout` — syntax and use
* Adding newline (`\n`) and tab (`\t`) characters
* Combining static and dynamic content in output

#### ⌨️ Basic Input

* `scanf()`, `cin`, `input()` — taking integers, floats, chars, strings
* Reading single-word vs full-line inputs
* Handling multiple inputs in a single line

#### 🔤 ASCII Values

* Mapping characters to ASCII codes
* Converting between characters and integers
* Practical usage: encryption basics, char classification

#### 💡 Formatting Output

* Controlling decimal precision
* Field width, padding, and alignment
* Tabulated data output (great for debugging and UI)

---

### 🧠 Pro Tips

* Be **precise with format specifiers**. `%d`, `%f`, `%c`, `%s` — one wrong move and you're debugging a ghost.
* Don’t forget input buffer issues (especially in C/C++) when mixing `scanf()`/`cin` with `gets()`/`getline()`.
* String I/O can vary drastically between languages; know your language's quirks.

---

### 🚧 Common Pitfalls

* Forgetting newline/tab characters in output — can lead to failed test cases in coding platforms.
* Using the wrong format specifier (e.g., `%d` for float).
* Not trimming or cleaning input — messy output = wrong answer.
* Reading leftover newline (`\n`) after `scanf()` or `cin`.

---

### 🛠️ Practice Problems to Reinforce

* Say Hello, World!
* Hello World with Tab
* Hello World with Newline
* ASCII Values - I & II
* Round Off a Float
* Student Details Formatter

---

### ✅ Best Practices

* Always validate user input if you're simulating real-world apps.
* Follow consistent formatting for outputs (especially in competitive programming).
* Use functions/utilities to encapsulate I/O logic once it gets messy.

---

### 🧪 Suggested Tools

* **C/C++:** Turbo C++ (not recommended), GCC with VS Code or CodeBlocks
* **Python:** IDLE, Thonny, or VS Code
* **Online:** [HackerRank](https://hackerrank.com), [Codeforces](https://codeforces.com), [LeetCode](https://leetcode.com)
