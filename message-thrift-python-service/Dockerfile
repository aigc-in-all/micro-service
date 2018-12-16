FROM hub.mooc.com:8080/micro-service/python-base:latest
MAINTAINER qingbao.ho@gmail.com

ENV PYTHONPATH /
COPY message /message

ENTRYPOINT ["python", "/message/message-service.py"]