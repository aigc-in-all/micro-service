#!/usr/bin/env bash

mvn package

docker build -t user-service:latest .
docker push hub.mooc.com:8080/micro-service/user-service:latest