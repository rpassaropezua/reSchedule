package com.rpassaropezua.securityApi.handlers;


import com.rpassaropezua.server.Objects.Account;
import com.rpassaropezua.server.Server;
import spark.Request;
import spark.Response;

public class SecurityHandlers {
    public static String login(Request req, Response res) {
        Account account = new Account();
        res.body("Hello world");
        return "Hello World";
    }

    public static String register(Request req, Response res) {
        Server.registerNewAccount(req);

        return "something";
    }
}
