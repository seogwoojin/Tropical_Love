package Tropical.Love.demo.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/members")
public class MemberController {

    @RequestMapping("/login")
    public String createForm(){
        return "members/createMemberForm";
    }


}
