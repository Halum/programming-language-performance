# programming-language-performance
## Project Goal

The goal of this project is to compare the performance of different programming languages by implementing the same algorithm in each language and measuring their execution times.

## Environment Setup using VSCode Dev Container

To ensure a consistent development environment, you can use a VSCode Dev Container. Follow these steps:

1. Install the [Dev - Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) extension in VSCode.
2. Reopen the project in the container by clicking on the green button in the bottom-left corner of VSCode and selecting "Reopen in Container".

## Compilation Instructions

### C
```sh
gcc ./languages/c_prime.c -o ./compiled/c_prime.o && ./compiled/c_prime.o
```

### C (Optimized Compile)
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

## Serving Visualization

To visualize the performance results, you can serve the `visualize.html` file using Python's built-in HTTP server. Follow these steps:

1. Open a terminal inside the dev container.
2. Start the HTTP server:
    ```sh
    python -m http.server
    ```
3. Open your web browser and go to `http://localhost:8000/visualize.html` to view the visualization.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.