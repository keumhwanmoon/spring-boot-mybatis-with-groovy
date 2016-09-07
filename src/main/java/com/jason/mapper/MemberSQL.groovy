package com.jason.mapper

import com.jason.util.QueryUtils
import org.apache.ibatis.jdbc.SQL
import org.springframework.util.StringUtils

/**
 * Created by Jason on 2016-09-05.
 */
class MemberSQL {
    public static final String FIND_MEMBERS =
            '''
            SELECT id, name FROM MEMBER
            '''

    public String findMembersByName(String memberName) {

        StringBuilder query = new StringBuilder();

        query.append('''
                    SELECT id, name FROM MEMBER
                    ''')

        if (!StringUtils.isEmpty(memberName)) {
            query.append("WHERE ")
            query.append(QueryUtils.like("name", memberName))
        }

        return query.toString()
    }

    public String findMembersByName2(String memberName) {

        SQL query = new SQL() {
            {
                SELECT("id, name");
                FROM("MEMBER");
            }
        };

        if (!StringUtils.isEmpty(memberName)) {
            query.WHERE(QueryUtils.like("name", memberName))
        }

        return query.toString()
    }
}
