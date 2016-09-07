package com.jason.service;

import com.jason.domain.Member;
import com.jason.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jason, Moon
 * @since 2016. 9. 7.
 */
@Service
public class MemberService {

    private MemberMapper memberMapper;

    @Autowired
    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<Member> findMembers() {
        return memberMapper.findMembers();
    }

    public List<Member> findMembersByName(String memberName) {
        return memberMapper.findMembersByName(memberName);
    }

    public List<Member> findMembersByName2(String memberName) {
        return memberMapper.findMembersByName2(memberName);
    }
}
