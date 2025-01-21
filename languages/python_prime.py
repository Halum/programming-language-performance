from multiprocessing.pool import RUN
from time import time
import csv
import os

RUN_TIME = 5 # seconds
OUTPUT_FILE = './../output/perf_data.csv'

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def save_perf_data(calculations, total_time):
    file_exists = os.path.isfile(OUTPUT_FILE)
    
    with open(OUTPUT_FILE, mode='a', newline='') as file:
        writer = csv.writer(file)
        if not file_exists:
            writer.writerow(['language', 'calculation', 'time'])
        writer.writerow(['python', calculations, total_time])


def main():
    t_start = time()
    calculations = 1
    total_time = 0

    while True:
        prime = is_prime(calculations)
        calculations = calculations + 1
        total_time = time() - t_start

        if total_time > RUN_TIME:
            break
    save_perf_data(calculations, total_time)
  

if __name__ == "__main__":
  main()
