#!/bin/bash

echo "Starting Student Record Management System..."

cd "$(dirname "$0")/.."
mkdir -p studentData

echo "Compiling Java files..."
javac src/Main.java

if [ $? -ne 0 ]; then
	echo "Compilation failed."
	exit 1
fi

echo "Running Java application..."
java -cp src Main

