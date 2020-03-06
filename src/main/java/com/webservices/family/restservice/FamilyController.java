package com.webservices.family.restservice;

import com.webservices.family.restservice.model.Member;
import com.webservices.family.restservice.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FamilyController
{
    @Autowired
    private FamilyService familyService;

    @GetMapping("/member")
    public List<Member> getFamilyMember() {
        return familyService.getAllFamilyMembers();
    }

    @PostMapping("/addMember")
    public void addFamilyMember(@RequestBody Member member) {
        familyService.addMember(member);
    }

    @PostMapping("/removeMember")
    public void removeFamilyMember(@RequestBody Member member) {
        familyService.removeMember(member);
    }
}
