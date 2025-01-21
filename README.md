# programming-language-performance
## Project Goal

The goal of this project is to compare the performance of different programming languages by implementing the same algorithm in each language and measuring their execution times.

## Compilation Instructions

### C
```sh
gcc ./languages/c_prime.c -o ./compiled/c_prime.o && ./compiled/c_prime.o
```

### C ()
```sh
gcc ./languages/c_prime.c -O3 ./compiled/c_prime.o && ./compiled/c_prime.o
```

### Java
```sh
javac ./languages/JavaPrime.java -d ./compiled && java -cp ./compiled/JavaPrime
```

### Python
No compilation needed. Run directly with:
```sh
python program.py
```

### JavaScript (Node.js)
No compilation needed. Run directly with:
```sh
node program.js
```
