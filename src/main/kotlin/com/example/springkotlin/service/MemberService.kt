package com.example.springkotlin.service

import com.example.springkotlin.entity.Member
import com.example.springkotlin.repository.QMemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(val qMemberRepository: QMemberRepository) {
    fun getMemberList(): List<Member> {
        return qMemberRepository.getMemberList();
    }
}