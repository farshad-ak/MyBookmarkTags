package online.farshad.bookmarktag;

/**
 * Created by farshad on 4/16/2018.
 */

import org.springframework.boot.autoconfigure.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


}