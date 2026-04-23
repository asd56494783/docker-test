package com.example.dockertest.member;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/count")
    public MemberCountResponse getMemberCount() {
        return new MemberCountResponse(memberService.countMembers());
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    public record MemberCountResponse(long count) {
    }
}
