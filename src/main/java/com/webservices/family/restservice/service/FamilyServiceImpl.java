package com.webservices.family.restservice.service;

import com.webservices.family.restservice.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class FamilyServiceImpl implements FamilyService
{
    private List<Member> allFamilyMembers;

    @Autowired
    public FamilyServiceImpl() {
        this.allFamilyMembers = new ArrayList<>();
    }

    @Override
    public List<Member> getAllFamilyMembers()
    {
        return Collections.unmodifiableList(this.allFamilyMembers);
    }

    @Override
    public void addMember(final Member member) {
        allFamilyMembers.add(member);
    }

    @Override
    public void removeMember(final Member member) {
        allFamilyMembers.remove(member);
    }
}
