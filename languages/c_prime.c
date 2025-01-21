#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

#define RUN_TIME 2 // seconds
#define OUTPUT_FILE "./../output/perf_data.csv"

bool is_prime(long long int n) {
    if (n < 2) {
        return false;
    }
    for (long long int i = 2; i < n - 1; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

void save_perf_data(long long int calculations, double total_time) {
    FILE *file = fopen(OUTPUT_FILE, "a");
    if (file == NULL) {
        perror("Error opening file");
        exit(EXIT_FAILURE);
    }

    // Check if file is empty to write the header
    fseek(file, 0, SEEK_END);
    if (ftell(file) == 0) {
        fprintf(file, "language,calculation,time\n");
    }

    fprintf(file, "C,%lld,%.6f\n", calculations, total_time);
    fclose(file);
}

int main() {
    clock_t t_start = clock();
    long long int calculations = 1;
    double total_time = 0;

    while (true) {
        bool prime = is_prime(calculations);
        calculations++;
        total_time = (double)(clock() - t_start) / CLOCKS_PER_SEC;

        if (total_time > RUN_TIME) {
            break;
        }
    }

    save_perf_data(calculations, total_time);
    return 0;
}