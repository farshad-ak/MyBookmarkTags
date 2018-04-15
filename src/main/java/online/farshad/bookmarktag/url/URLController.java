package online.farshad.bookmarktag.url;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by farshad on 4/16/2018.
 */
@RestController
@RequestMapping("/url")
public class URLController {
    @Autowired
    private URLRepository urlRepository;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    URL addNewUrl(@RequestParam String name
            , @RequestParam String tag) {
        URL url = new URL();
        url.setUrlName(name);
        url.setTags(tag);
        url = urlRepository.save(url);

        return url;
    }
}
