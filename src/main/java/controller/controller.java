package controller;

import model.Sight;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {

    @GetMapping("/SightAPI/{zone}")
    public ResponseEntity<Sight> testSight(){
        Sight sight = new Sight();
        sight.setSightName("This is a test Sight");
        return ResponseEntity.status(HttpStatus.OK).body(sight);
    }


}
