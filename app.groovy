@RestController
class Application{
	
	@RequestMapping("/")
	String hello() {
		"Hello World!"
	}
}