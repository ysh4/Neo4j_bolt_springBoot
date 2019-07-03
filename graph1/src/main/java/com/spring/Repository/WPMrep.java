package com.spring.Repository;

import com.spring.entity.WPM;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WPMrep extends Neo4jRepository<WPM,Long> {


}
