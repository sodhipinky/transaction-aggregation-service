# Transaction Aggregation Service

## 🌍 Story / Context

You are working as a backend engineer at a fintech company similar to Wise.

Every second, your system receives thousands of transactions from different payment providers across the world. These
transactions are used to power dashboards, analytics, and customer insights.

However, the data coming from external providers is:

- Unstructured
- Noisy
- Not optimized for your internal systems

Your job is to build a service that:

- Cleans this data
- Aggregates it
- Makes it fast and usable for internal systems

---

## 🎯 Objective

Build a backend service that processes transaction data and generates a **user-level summary**.

---

## 📥 Input (External Data)

You receive transactions from an external provider.

Each transaction contains:

- transactionId (String)
- userId (String)
- amount (double)
- currency (String)
- timestamp (long)

Example:

[
{ id: "t1", userId: "u1", amount: 100, currency: "USD", timestamp: 1700000000 },
{ id: "t2", userId: "u1", amount: 200, currency: "USD", timestamp: 1700000100 },
{ id: "t3", userId: "u2", amount: 300, currency: "EUR", timestamp: 1699990000 }
]

---

## 🚧 Problem You Are Solving

The business wants to display a **real-time dashboard** showing:

👉 Total money transacted per user  
👉 Number of transactions per user

BUT:

- Only **recent transactions (last 1 hour)** should be considered
- The system must be **fast and scalable**

---

## 🎯 Requirements

Implement:

getUserTransactionSummary()

---

### ✅ 1. Convert External → Internal Model

Clean the data and convert it into a format your system understands.

---

### ✅ 2. Filter Recent Transactions

Only include transactions from the **last 1 hour**

---

### ✅ 3. Aggregate Per User

For each user:
- Calculate total transaction amount
- Count number of transactions

---

### ✅ 4. Add Caching

To improve performance:

- Cache the computed result for **60 seconds**
- If cache is valid → return cached result
- Avoid calling external provider repeatedly

---

## 📤 Output

Return:

- userId
- totalAmount
- transactionCount

Example:

[
{ userId: "u1", totalAmount: 300, transactionCount: 2 },
{ userId: "u2", totalAmount: 300, transactionCount: 1 }
]

---

## 🧠 What You Should Think About

- How to efficiently group transactions?
- How to filter by time?
- How to avoid repeated expensive computations?
- How will this behave if traffic increases?

---

## 🔥 Real-World Considerations

- What if millions of transactions come in?
- What if data comes in real-time (streaming)?
- What if multiple servers are running this service?

---

## 🏁 Goal

Think like a backend engineer building a **scalable, production-ready service**, not just solving a coding problem.