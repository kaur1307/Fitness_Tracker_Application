# Fitness_Tracker_Application

# 🏃‍♀️ Fitness Tracker

A simple Java console application that allows users to input and track their daily fitness data, including steps taken, calories burned, and active minutes. The application also calculates distance walked, weekly active minutes, calorie deficit/surplus, and determines a user's fitness level.

---

## 📌 Features

* Accepts user input for key fitness metrics
* Calculates:

  * Distance walked based on gender-specific step length
  * Weekly active minutes
  * Daily calorie deficit/surplus
  * Fitness level (Sedentary, Moderately Active, Active)
* Provides a summary of fitness data
* Includes unit tests using JUnit 5

---

## 🚀 How to Run

### Prerequisites

* Java Development Kit (JDK) 17+
* Any IDE or terminal that supports Java
* [JUnit 5](https://junit.org/junit5/) (if you want to run unit tests)

### Steps

1. Clone or download the repository
2. put the files under src folder in eclipse or any IDE of your preference

---

## 📁 Project Structure

```
src/
├── FitnessTracker.java         # Main logic for tracking fitness data
├── FitnessTrackerTest.java     # Console-based input/output interface
└── FitnessTrackerTest2.java    # Unit tests for FitnessTracker class
```
## 🧠 Fitness Level Criteria

| Fitness Level         | Criteria                                                         |
| --------------------- | ---------------------------------------------------------------- |
| **Active**            | > 150 active minutes/week **and** > 2000 calories burned/week    |
| **Moderately Active** | 75–150 active minutes/week **or** 1000–2000 calories burned/week |
| **Sedentary**         | < 75 active minutes/week **and** < 1000 calories burned/week     |

---

## ✍️ Author

**Prabhsimran Kaur**
Course: Computer Programming Diploma
Java Version: 17.0
Project Version: 1.0



