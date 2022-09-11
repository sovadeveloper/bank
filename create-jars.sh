#!/bin/bash
cd ./bankService/
./mvnw clean package -DskipTests
cd ..
cd ./cardService/
./mvnw clean package -DskipTests
cd ..
cd ./depositService/
./mvnw clean package -DskipTests
cd ..
cd ./gateway/
./mvnw clean package -DskipTests
cd ..
cd ./oauthClient/
./mvnw clean package -DskipTests
cd ..
cd ./policeService/
./mvnw clean package -DskipTests
cd ..
# cd ./siebel/
# ./mvnw clean install
# cd ..