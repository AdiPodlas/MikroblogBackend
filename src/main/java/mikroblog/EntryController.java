package mikroblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class EntryController {

    @GetMapping("/entry")
    Entry getEntry (){
        return new Entry(1, "Marti", "QWERTYUIOP", "03-12-2024", 6 );

    }

}
