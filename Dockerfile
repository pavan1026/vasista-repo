FROM ubuntu

RUN apt-get update -y
RUN apt-get install python3-pip -y
RUN pip3 install flask

ADD app.py /
WORKDIR /


EXPOSE 5000

CMD ["python3", "app.py"]

