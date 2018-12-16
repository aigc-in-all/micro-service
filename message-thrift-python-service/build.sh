#!/usr/bin/env bash

docker build -t message-service:latest .

docker push hub.mooc.com:8080/micro-service/message-service:latest