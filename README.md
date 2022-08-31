# demo-app

##Create kafka topic
kafka-topics.bat --create --topic app-topic --bootstrap-server localhost:9092

##Run the project using following command:
java -jar demo-app.jar --server.port=89
