package com.jason.mapper

import com.jason.domain.Member
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

/**
 * Created by Jason on 2016-09-05.
 */
@Mapper
interface MemberMapper {

    @Select(MemberSQL.FIND_MEMBERS)
    List<Member> findMembers()
}
