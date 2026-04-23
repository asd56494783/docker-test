package com.example.dockertest.member;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MemberDataSeeder implements CommandLineRunner {

    private final MemberRepository memberRepository;

    public MemberDataSeeder(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(String... args) {
        if (memberRepository.count() > 0) {
            return;
        }

        memberRepository.save(new Member("Amy Chen", "amy.chen@example.com", "GOLD", true));
        memberRepository.save(new Member("Brian Lin", "brian.lin@example.com", "SILVER", true));
        memberRepository.save(new Member("Cindy Wang", "cindy.wang@example.com", "BASIC", false));
    }
}
