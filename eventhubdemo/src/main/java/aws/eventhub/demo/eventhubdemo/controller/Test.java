/**
 * 
 */
package aws.eventhub.demo.eventhubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajiv
 *
 */

@RestController
@RequestMapping(value = "/")
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing Java");

	}
	
	@GetMapping(value="test")
	public String test() {
			return "Hello";
	}

	@PostMapping(value="test")
	public String testPost(@RequestParam(name = "name") String name) {
			return "Hello" + name;
	}
}
