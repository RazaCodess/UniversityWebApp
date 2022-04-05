package com.project.firstMvcProject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class RestHelloController {

	
	//retreiving student information from the database	
		
		@RequestMapping(value = "/stuentList", method = RequestMethod.GET)
		public Map<String, Form> formApi() {
			Map<String, Form> studentList = new HashMap<>();
			Form student1 = new Form();
			student1.setFirst_name("raza");
			student1.setAddress("37 berkeley st");
			Form student2 = new Form();
			student2.setFirst_name("Babu");
			student2.setAddress("8461 Mckenzie cir");
			Form student3 = new Form();
			student3.setFirst_name("Hakim");
			student3.setAddress("56 hakeye st");
			
			studentList.put("student1", student1);
			studentList.put("student2", student2);
			studentList.put("student3", student3);
			return studentList;
		}

//		retreiving a student from the database using a pathvariable
		
	    @RequestMapping(value = "/getStudent/{name}", method = RequestMethod.GET)
		public Form studentRetreive(@PathVariable("name") String first_name) {
			Form student = new Form();
			student.setFirst_name(first_name);
			student.setAddress("878 fayette St");
	    	return student;
		}
	    
	    @RequestMapping(value = "/update/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_XML_VALUE)
	    public ResponseEntity<Boolean> updateStudentInformation(@PathVariable("name") String first_name, @RequestBody Form student) {
	    	System.out.println("the information for" +first_name + "has been changed");
	    	System.out.println("the value of student's name has been changed from " +first_name +"to" +student.getFirst_name());
	    	HttpHeaders httpHeaders = new HttpHeaders();
	    	httpHeaders.add("key1", "value1");
	    	httpHeaders.add("key2", "value2");
	    	return new ResponseEntity<Boolean>(false, httpHeaders, HttpStatus.OK);
	    }
	    
	    
	    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Boolean> createStudent(@RequestBody Form student){
	    	HttpHeaders httpHeaders = new HttpHeaders();
	    	httpHeaders.add("location", 
	    			 ServletUriComponentsBuilder
	                .fromCurrentServletMapping()
	                .path("/getStudent/{name}")
	                .build()
	                .expand(student.getFirst_name())
	                .toUri()
	                .toString());
	    	System.out.println(httpHeaders.toString());
	    	System.out.println(ServletUriComponentsBuilder.fromCurrentServletMapping().toUriString());
	    	return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.OK);
	    }
 
	    @RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Boolean> deleteStudent (@PathVariable ("name") String name){
	    	
	    	return new ResponseEntity<Boolean>(false, HttpStatus.OK);
	    }
	    
	    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Boolean> deleteAllStudent(){
	    	return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	    }
}
