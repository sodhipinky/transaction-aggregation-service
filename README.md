# Transaction Aggregation Service

## 🎯 Objective

Build a backend service that processes transaction data from an external provider and prepares it for internal use.

---

## 📥 Input (External Data)

You will receive a list of transactions from a third-party provider.

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
{ id: "t3", userId: "u2", amount: 300, currency: "EUR", timestamp: 1700000200 }
]

---

## 🎯 Requirements

Implement a method:

getUserTransactionSummary()

This method should:

### 1. Convert External Model → Internal Model

Rename fields and structure appropriately.

---

### 2. Aggregate Transactions Per User

For each user:

- Calculate total transaction amount
- Count number of transactions

---

### 3. Filter Recent Transactions

Only include transactions from the last 1 hour.

---

### 4. Add Caching

- Cache the computed summary for 60 seconds
- If cache is valid, return cached result

---

## 📤 Output

Return a list of user summaries:

- userId
- totalAmount
- transactionCount

Example:

[
{ userId: "u1", totalAmount: 300, transactionCount: 2 },
{ userId: "u2", totalAmount: 300, transactionCount: 1 }
]

---

## 🧠 Key Concepts Being Tested

- Data aggregation
- HashMap usage
- Time filtering
- Caching
- Clean service design

---

## 🔥 Follow-Up Scenarios (Think About These)

- What if transactions are very large in volume?
- How would you handle real-time streaming data?
- How would you scale this across multiple instances?