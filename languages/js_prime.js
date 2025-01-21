const fs = require('fs');

const RUN_TIME = 5; // seconds
const OUTPUT_FILE = './../output/perf_data.csv';

function isPrime(n) {
    if (n < 2) {
        return false;
    }
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}

function savePerfData(calculations, totalTime) {
    const fileExists = fs.existsSync(OUTPUT_FILE);
    const data = `${fileExists ? '' : 'language,calculation,time\n'}javascript,${calculations},${totalTime.toFixed(6)}\n`;

    fs.appendFileSync(OUTPUT_FILE, data, 'utf8');
}

function main() {
    const tStart = Date.now();
    let calculations = 1;
    let totalTime = 0;

    while (true) {
        const prime = isPrime(calculations);
        calculations++;
        totalTime = (Date.now() - tStart) / 1000;

        if (totalTime > RUN_TIME) {
            break;
        }
    }

    savePerfData(calculations, totalTime);
}

main();