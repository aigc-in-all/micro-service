#!/usr/bin/env bash

mvn package

docker build -t course-service:latest .

docker push hub.mooc.com:8080/micro-service/course-service:latest