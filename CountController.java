package count;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

    private static final String template = "counts, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/count")
    public Count counts(@RequestParam(value="text", defaultValue="") String text) {
        return new Count(counter.incrementAndGet(),
                            String.format(template, text));
    }
}