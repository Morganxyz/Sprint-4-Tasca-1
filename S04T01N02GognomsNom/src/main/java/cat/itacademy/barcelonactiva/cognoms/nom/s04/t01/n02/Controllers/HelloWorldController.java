package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.Controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    @ResponseBody
    public String saluda(@RequestParam(defaultValue = "Unknown") String nom) {
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }

    @GetMapping ({"/HelloWorld2","/HelloWorld2/{nom}"})
    @ResponseBody
    public String saluda2(@PathVariable(required = false) String nom) {
        return " Hola, " + nom + ". Estàs executant un projecte Gradle";

    }
}
