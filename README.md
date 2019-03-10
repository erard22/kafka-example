# Kafka example

A simple example using a dockerized kafka broker and a spring boot producer/consumer


```

/opt/bitnami/kafka/bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --topic erard22 --partitions 3 --replication-factor 3
/opt/bitnami/kafka/bin/kafka-topics.sh --describe --zookeeper zookeeper:2181 --topic erard22

```
