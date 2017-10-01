package com.stonepyy.yppl.controllers;


import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

@Path("/test/")
public class WelcomeController {

    @Get("{friend:[a-z]+}")
    public String hello(@Param("friend") String frined) {
        return "@Hello "+frined;
    }

    @Get("user/{userId:[0-9]+}/code/{codeId:[0-9]+}")
    public String queryCode(@Param("userId") long userId, @Param("codeId") long codeId) {
        return "@userId = " + userId + " codeId = " + codeId;
    }

    @Get("user/aa")
    public String queryCode3() {
        return "@userId = aa";
    }

    @Get("user/{userId:[0-9]+}")
    public String queryCode2(@Param("userId") int userId) {
        return "@userId = " + userId;
    }

    @Get("topic/{topicId:[0-9]+}")
    public String showTopic(@Param("topicId") int topicId) {
        //显示单个主帖和它的跟贴
        return "@topic";
    }
}
