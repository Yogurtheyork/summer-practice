package controller;

import crawler.KeelungSightsCrawler;
import model.Sight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class controller {

    @GetMapping("test")
    public Sight testSight(){
        Sight sight = new Sight();
        sight.setSightName("This is a test Sight");
        return sight;
    }


}
