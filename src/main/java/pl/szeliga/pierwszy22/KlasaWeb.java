package pl.szeliga.pierwszy22;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KlasaWeb {

    @GetMapping("/klasa")
    public String  hello(){

        return "tu ja zoska";
    }
}
