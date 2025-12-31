#!/bin/bash

BASE_DIR="$(cd "$(dirname "$0")/.." && pwd)" 
LOG_DIR="$BASE_DIR/logs"
LOG_FILE="$LOG_DIR/error.log"

mkdir -p "$LOG_DIR"

echo "Starting Student Record Management System..."
echo "Logs will be written to $LOG_FILE"

cd "$BASE_DIR" || exit 1
mkdir -p studentData

echo "Compiling Java files..."
javac src/*.java 2>> "$LOG_FILE"

if [ $? -ne 0 ]; then
    echo "Compilation failed."
    echo "---- $(date) : Compilation error ----" >> "$LOG_FILE"
    exit 1
fi

echo "Running Java application..."
java -cp src Main 2>> "$LOG_FILE"

if [ $? -ne 0 ]; then
    echo "Runtime error occurred."
    echo "---- $(date) : Runtime error ----" >> "$LOG_FILE"
    exit 1
fi

echo "Application finished successfully"

