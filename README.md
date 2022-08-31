# demo-app
-- Kafka version: 2.13-3.1.0

-- Elasticsearch version: 7.15.2

-- Spring Boot version: 2.6.7

##Create kafka topic
kafka-topics.bat --create --topic demo-app-topic --bootstrap-server localhost:9092

##Run the project using following command:
java -jar demo-app.jar --server.port=89

##Produce data to kafka
kafka-console-producer.bat --bootstrap-server localhost:9092 --topic demo-app-topic < ~project_path\demo-app\data.json

See the log of consumed message in app in ~project_path\demo-app\app.log or in shell of the running jar

Then data will be automatically saved to elasticsearch

##Check if new data is available in elasticsearch
curl http://localhost:9200/messages/_search?pretty=true