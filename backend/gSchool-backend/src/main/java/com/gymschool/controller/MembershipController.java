package com.gymschool.controller;

import com.gymschool.service.MembershipService;
import com.gymschool.model.Membership;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    private final MembershipService membershipService;

    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping
    public List<Membership> getAllMemberships() {
        return membershipService.getAllMemberships();
    }

    @GetMapping("/{id}")
    public Membership getMembershipById(@PathVariable Long id){
        return membershipService.findMembershipById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMembership(@PathVariable Long id) {
        membershipService.deleteMembership(id);
    }

    @PostMapping
    public void addMembership(@RequestBody Membership membership) {
        membershipService.saveMembership(membership);
    }

    @PutMapping
    public void updateMembership(@RequestBody Membership membership) {
        membershipService.saveMembership(membership);
    }

}

