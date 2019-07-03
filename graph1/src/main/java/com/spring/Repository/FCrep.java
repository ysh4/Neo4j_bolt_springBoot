package com.spring.Repository;

import com.spring.Path.c81;
import com.spring.Path.c91;
import com.spring.entity.FC;
import org.neo4j.driver.v1.Statement;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface FCrep extends Neo4jRepository<FC, Long> {


    @Query("match (n:FC) return n")
    List<FC> findAll();

    @Query("//fc,store,carrier method 91\n" +
            "match (f:FC{ID:{fid}})-[m1:Map]->(r:RDC)-[m2:Map]->(s:Store{ID:{sid}})\n" +
            "with f.ID as f,r,m1.TNT+m2.TNT as tnt,s.ID as s\n" +
            "order by tnt\n" +
            "limit 1\n" +
            "with r.ID as r,tnt,f,s\n" +
            "Match (n:c91)\n" +
            "set n.FId=f\n" +
            "set n.RDC=r\n" +
            "set n.SId=s\n" +
            "set n.tnt=tnt\n" +
            "\n" +
            "return n")
    c91 fcStoreShortest(String fid, String sid);

    @Query("//fc,store,carrier method 81\n" +
            "match (f:FC{ID:{fid}})-[m1:Map]->(w:WPM)-[m2:Map]->(r:RDC)-[m3:Map]->(s:Store{ID:{sid}})\n" +
            "with f.ID as f,w.ID as w,r.ID as r,m1.TNT+m2.TNT+m3.TNT as tnt,s.ID as s\n" +
            "order by tnt\n" +
            "limit 1\n" +
            "match (n:c81)\n" +
            "set n.FId=f\n" +
            "set n.WId=w\n" +
            "set n.RId=r\n" +
            "set n.SId=s\n" +
            "set n.tnt=tnt\n" +
            "with n return n")
    c81 fc81store(String fid,String sid);

   //@Query(value = "q")
    void Request(Statement q);



}

