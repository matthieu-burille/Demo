package fr.miage.communityws.model.repository;

import fr.miage.communityws.model.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member,String> {
}
