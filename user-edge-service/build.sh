#!/usr/bin/env bash

mvn package

docker build -t user-edge-service:latest .

docker push hub.mooc.com:8080/micro-service/user-edge-service:latest