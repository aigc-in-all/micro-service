#!/usr/bin/env bash

mvn package

docker build -t course-edge-service:latest .

docker push hub.mooc.com:8080/micro-service/course-edge-service:latest