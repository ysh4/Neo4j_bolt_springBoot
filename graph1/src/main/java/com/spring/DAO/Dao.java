package com.spring.DAO;

import com.spring.GraphApplication;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;

public class Dao {
    public void Request() {
        Driver driver= GraphDatabase.driver("bolt://neo4j:Welcome@1@localhost:11006");

        Session session= driver.session();
        session.run("create (:vyshnavi)");
        session.close();
    }

}
