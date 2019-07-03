package com.spring.Repository;

import com.spring.entity.Store;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface STORErep extends Neo4jRepository<Store,Long> {


}
