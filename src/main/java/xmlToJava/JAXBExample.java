package xmlToJava;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBExample {

	public static void main(String[] args) {
		try {
			// Unmarshalling: Convert XML to Java object
			System.out.println("Unmarshalling: Convert XML to Java object");
			File file = new File("myxml.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employee employee = (Employee) jaxbUnmarshaller.unmarshal(file);
			System.out.println("Employee Name: " + employee.toString());

			System.out.println("*****************************");
			System.out.println("");
			System.out.println("");
			
			// Marshalling: Convert Java object to XML
			System.out.println("Marshalling: Convert Java object to XML");
			employee.setName("Jane Doe");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(employee, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
