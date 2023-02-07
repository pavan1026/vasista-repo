FROM ubuntu


WORKDIR /
COPY . /
RUN apt-get  update -y
RUN apt-get install python3-pip -y
RUN pip install -r  requirements.txt



EXPOSE 5000

CMD ["python3", "app.py"]

