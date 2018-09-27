package com.rpassaropezua.securityApi;

import static spark.Spark.*;
import com.rpassaropezua.securityApi.handlers.SecurityHandlers;

public class Main {
    public static void main(String[] args) {
        Main runApp = new Main();
        runApp.init();
    }

    public void init() {
        get("/login", SecurityHandlers::login);
        post("/register", SecurityHandlers::register);
    }
}
