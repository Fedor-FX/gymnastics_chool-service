package com.gymschool.repository;
import com.gymschool.model.Membership;
import com.gymschool.model.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, Long> {

    List<Membership> findByMembershipPlan(MembershipPlan membershipPlan);

    List<Membership> id(Long id);
}
