# RSA Cryptography System (Console UI)

A university-level Java terminal application demonstrating the mathematical foundation and practical implementation of the RSA Cryptographic Algorithm. This project features custom-built methods for key generation, encryption, and decryption using modular arithmetic without relying on external cryptography libraries.

---

## Features

* **Mathematical Key Generation:**
    * **Modulus Generation:** Computes the RSA modulus (n) and Euler's totient (phi) dynamically from predefined static prime inputs (p and q).
    * **Public Exponent (e):** Evaluates the smallest coprime integer relative to phi using a custom-built Greatest Common Divisor (GCD) subroutine.
    * **Private Exponent (d):** Solves the modular multiplicative inverse using mathematical tracking loop algorithms.
* **Text Encryption:** Transforms raw alphanumeric string inputs into a localized integer matrix, securely mapping each index via modular exponentiation calculations before casting back to readable ciphertext format.
* **Text Decryption:** Restores original plaintext structures directly from encrypted character sets using private key math signatures.

---

## Getting Started

Follow these steps to set up and run the project locally on your machine.

### Prerequisites

Ensure you have the following installed:
1. **Java Development Kit (JDK):** Version 8 or higher.
2. **Terminal/IDE:** Any command-line interface or integrated development environment like IntelliJ IDEA or Eclipse.

---

### Installation & Setup

#### 1. Codebase Initialization
The project resides entirely within a single unified source file containing both the computational crypto engine and user execution loops.

```bash
# Clone the repository
git clone [https://github.com/dev-moniem/RSA-Cryptography-Java.git](https://github.com/dev-moniem/RSA-Cryptography-Java.git)

# Navigate into the project folder
cd RSA-Cryptography-Java