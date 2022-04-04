package com.example.springkotlin.repository

import com.example.springkotlin.entity.Member
import com.example.springkotlin.entity.QMember
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

@Repository
class QMemberRepository(val entityManager: EntityManager, val jpaQueryFactory: JPAQueryFactory) {
    fun getMemberList(): List<Member> {
        val memberList : List<Member> = jpaQueryFactory.selectFrom(QMember.member).fetch()
        return memberList
    }
}