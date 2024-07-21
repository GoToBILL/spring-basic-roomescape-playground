package roomescape.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import roomescape.member.Member;
import roomescape.member.MemberRepository;

@Profile("default")
@Component
public class DataLoader implements CommandLineRunner {

    private final MemberRepository memberRepository;

    public DataLoader(final MemberRepository memberRepository) {
        // ci 추가한 겸 푸시
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(final String... args) throws Exception {
        final Member member1 = memberRepository.save(new Member("어드민", "admin@email.com", "password", "ADMIN"));
        final Member member2 = memberRepository.save(new Member("브라운", "brown@email.com", "password", "USER"));
    }
}