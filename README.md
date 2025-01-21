# programming-language-performance
## Project Goal

The goal of this project is to compare the performance of different programming languages by implementing the same algorithm in each language and measuring their execution times.

## Compilation Instructions

### C
```sh
gcc ./languages/c_prime.c -o ./compiled/c_prime.o && ./compiled/c_prime.o
```

### C (Optmized Compile)
```sh
gcc -O3 ./languages/c_prime.c -o ./compiled/c_prime.o && ./compiled/c_prime.o
```

### Java
```sh
javac -d compiled ./languages/JavaPrime.java && java -cp compiled JavaPrime
```

### Python
No compilation needed. Run directly with:
```sh
python ./languages/python_prime.py
```

### JavaScript (Node.js)
No compilation needed. Run directly with:
```sh
node ./languages/js_prime.js
```
