package jsonToJava;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	
	 public static void main(String[] args) {
	// JSON string to be parsed
	String obj = "{\"emp_name\":\"Rohan\", \"emp_id\":101, \"emp_addr\":\"Uttar Pradesh, India\"}";
	// Create an instance of ObjectMapper
	ObjectMapper objectMapper = new ObjectMapper();

	try {
	    Employee emp = objectMapper.readValue(obj, Employee.class);
	    System.out.println(emp.toString());
	} catch (Exception e) {
	    // Handle any exceptions that might occur during parsing
	    e.printStackTrace();
	}
	 }
}
