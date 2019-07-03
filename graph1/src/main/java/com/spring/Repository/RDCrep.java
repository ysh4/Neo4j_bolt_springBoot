package com.spring.Repository;

import com.spring.entity.RDC;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RDCrep extends Neo4jRepository<RDC,Long> {


}
