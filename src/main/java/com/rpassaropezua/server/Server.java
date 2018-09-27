package com.rpassaropezua.server;

import com.rpassaropezua.server.Objects.Account;
import spark.Request;

public class Server {
    public Account getAccount() {
        return null;
    }

    public static void registerNewAccount(Request req) {
        System.out.println(req.body());
    }
}
