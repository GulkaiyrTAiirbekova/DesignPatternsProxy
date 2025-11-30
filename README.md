# DesignPatternsProxy

A Java project demonstrating the **Proxy Design Pattern**.

## Description

The Proxy pattern provides a surrogate or placeholder for another object to control access to it.  
In this project, `ProxyImage` is used to load images only when needed, demonstrating **lazy loading**.

## Project Structure

src/
└── DesignPatterns_STRUCTURAL
└── Proxy
├── Image.java // Interface
├── RealImage.java // Actual image implementation
└── ProxyImage.java // Proxy implementation
└── ProxyPatternMain.java // Demo / main class
