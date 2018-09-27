package com.rpassaropezua.api;

import static spark.Spark.*;
import com.rpassaropezua.api.handlers.SecurityHandlers;

public class Main {
    public static void main(String[] args) {
        Main runApp = new Main();
        runApp.init();
    }

    public void init() {
        post("/login", (req, res) -> {
            return SecurityHandlers.login();
        });
    }
}
