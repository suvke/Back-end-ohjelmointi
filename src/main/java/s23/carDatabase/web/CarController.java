package s23.carDatabase.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
	
	@RequestMapping("main")
	@ResponseBody
	public String showMainPage() {
		return "Tämä on etusivu";
	}
	
	@RequestMapping("moi")
	@ResponseBody
	public String sayHello(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi) {
		return ("hei " + nimi);
	}
	
	@RequestMapping("moikka")
	@ResponseBody
	public String sayHello2(@RequestParam (name="nimesi", required=false, defaultValue="Muumi") String nimi, 
			@RequestParam(name="ika") int age) {
		return ("hei " + nimi + " " + age + " vuotta.");
	}
	
	//Viikkotehtävät_viikko 1
	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String greeting(@RequestParam (name="location", required=false, defaultValue="moon") String sijainti, 
			@RequestParam (name="name", required=false, defaultValue="Muumi") String nimi) {
		return "Welcome to the " + sijainti + " " + nimi + "!";
	}
	
}
