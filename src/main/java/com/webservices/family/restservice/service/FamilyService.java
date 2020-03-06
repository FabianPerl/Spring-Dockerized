package com.webservices.family.restservice.service;

import com.webservices.family.restservice.model.Member;

import java.util.List;

public interface FamilyService
{
    List<Member> getAllFamilyMembers();

    void addMember (Member member);

    void removeMember (Member member);
}
