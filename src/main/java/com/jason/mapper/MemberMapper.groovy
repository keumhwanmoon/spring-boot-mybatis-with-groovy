package com.jason.mapper

import com.jason.domain.Member
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.SelectProvider
import org.springframework.stereotype.Repository

/**
 * Created by Jason on 2016-09-05.
 */
@Mapper
@Repository
interface MemberMapper {

    @Select(MemberSQL.FIND_MEMBERS)
    public List<Member> findMembers()

    @SelectProvider(type = MemberSQL.class, method = "findMembersByName")
    public List<Member> findMembersByName(@Param("name") String name)

    @SelectProvider(type = MemberSQL.class, method = "findMembersByName2")
    List<Member> findMembersByName2(String memberName)
}
