package com.koreait.short_url_project_02.domain.member.member.repository;

import com.koreait.short_url_project_02.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
