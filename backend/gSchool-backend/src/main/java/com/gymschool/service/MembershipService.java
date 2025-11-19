package com.gymschool.service;
import com.gymschool.model.Membership;
import com.gymschool.model.MembershipPlan;
import com.gymschool.model.User;
import com.gymschool.repository.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipService {
    private final MembershipRepository membershipRepository;

    public MembershipService(MembershipRepository membershipRepository) {
        this.membershipRepository = membershipRepository;
    }
    public List<Membership> findByMembershipPlan(MembershipPlan membershipPlan) {
        return membershipRepository.findByMembershipPlan(membershipPlan);
    }

    public Membership saveMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    public void deleteMembership(Long id) {
        membershipRepository.deleteById(id);
    }

    public Membership createMembership(Membership membership){
        return membershipRepository.save(membership);
    }

    public Membership findMembershipById(Long id) {
        return membershipRepository.findById(id).orElse(null);
    }

    public Membership updateMembership(Membership membership) {
         return membershipRepository.save(membership);
    }

    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }

    void assignMembershipToUser(User user, Membership membership) {}

    boolean isExpiredMembership(Membership membership) {
        return false;
    }


}
