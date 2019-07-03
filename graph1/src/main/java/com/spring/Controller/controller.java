package com.spring.Controller;

import com.spring.CQuery;
import com.spring.DAO.Dao;
import com.spring.Path.c81;
import com.spring.Path.c91;
import com.spring.Service.service;
import com.spring.entity.FC;
import org.neo4j.driver.internal.shaded.io.netty.handler.codec.json.JsonObjectDecoder;
import org.neo4j.driver.v1.Statement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private service fcser;
    private Dao dao;



       @RequestMapping("/")
       public String basic(){
        return "hey!";
    }

        @RequestMapping("/fc")
        public List<FC> getFC(){
        return fcser.findAll();}

        @RequestMapping("/fc/{fcid}/91/store/{storeid}")
        public c91 fcStoreShortest(@PathVariable("fcid") String fid, @PathVariable("storeid") String sid ){
           return fcser.fcStoreShortest(fid,sid);
        }

        @RequestMapping("fc/{fcid}/81/store/{storeid}")
        public c81 fc81store(@PathVariable("fcid") String fid, @PathVariable("storeid") String sid){
            return fcser.fc81store(fid,sid);
        }

        @GetMapping("/query")
        public int Request(){

            dao.Request();
           return 1;
        }



}
