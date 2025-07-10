import bean.Sight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {
    private static final Map<String, Sight> information = new HashMap<>();

    @GetMapping

}
