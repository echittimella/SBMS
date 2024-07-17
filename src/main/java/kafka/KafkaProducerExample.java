package kafka;

//package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class KafkaProducerExample {

    public static void main(String[] args) {
        String topicName = "my_topic";
        String key = "key1";
        String value = "Hello, Kafka!";
//
//        // Set the producer configuration properties
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        // Create a producer
//        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
//
//        // Create a producer record
//        ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);
//
//        try {
//            // Send the record and get metadata about the sent message
//            RecordMetadata metadata = producer.send(record).get();
//            System.out.printf("Sent message to topic %s, partition %d, offset %d%n",
//                    metadata.topic(), metadata.partition(), metadata.offset());
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        } finally {
//            producer.close();
//        }
   }
}

