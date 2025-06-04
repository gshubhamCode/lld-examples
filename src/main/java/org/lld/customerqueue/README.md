**Customer Queue LLD** project, ideal for a GitHub Java Maven repository:

---

````markdown
# Fair Customer Processing System (LLD)

This project implements a **fair customer queue handling system** where VIP and regular customers are processed based on configurable fairness rules.

Originally designed as a response to a **real LLD interview question at Intuit**, this solution demonstrates object-oriented design, concurrency readiness, and testability.

---

## ✨ Features

- 🎯 Supports configurable VIP:Regular customer processing ratios
- ✅ Thoroughly tested using JUnit 5
- 🔄 Scalable and extendable architecture

---

## 📦 Tech Stack

- **Java 17+**
- **Maven**
- **JUnit 5**

---
````

## 🚀 Getting Started

### 1. Clone the repo
```bash
git clone git@github.com:gshubhamCode/lld-examples.git
cd lld-examples
```

### 2. Build the project

```bash
mvn clean install
```

### 3. Run tests

```bash
mvn test
```

---

## 🧪 Test Strategy

Unit tests are written using **JUnit 5** in `CustomerQueueTest.java`.
The tests cover:

* All VIP or all Regular scenarios
* Mixed scenarios with various fairness ratios
* Edge cases to ensure correct dequeueing order

---

## 📖 Blog Post

Read the full design breakdown here 👉
📄 [Designing a Fair Customer Processing System](https://medium.com/@shubham18p2/designing-a-fair-customer-processing-system-a-real-lld-interview-question-at-intuit-8cfba4a45372)

---

## 🧠 Concepts Covered

* Fairness in scheduling (Weighted Round-Robin)
* Queue processing patterns
* Clean OOP design and separation of concerns
* Thread safety considerations

---

## 🙌 Contributions

Open to improvements and concurrency extensions.
Feel free to open issues or PRs!

---
