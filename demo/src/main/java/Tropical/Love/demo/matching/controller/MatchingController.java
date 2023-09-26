package Tropical.Love.demo.matching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchingController {
    @GetMapping("/match")
    public String match(){
        return "/match/1";
    }

}
