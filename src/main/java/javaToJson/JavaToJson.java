package javaToJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john.doe@example.com");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert Java object to JSON string
            String jsonString = objectMapper.writeValueAsString(person);
            System.out.println("output: \n"+jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
