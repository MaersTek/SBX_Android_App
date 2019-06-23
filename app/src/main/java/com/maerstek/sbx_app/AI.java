package com.maerstek.sbx_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AI {

    public static String getAnswer(String user_question) {

        HashMap<String, String> database = new HashMap<String, String>() {{
            put("hello", "Dodou");
            put("wassup", "norm!");
            put("go to hell", "Kiss my shiny metal ass !");
        }};

        user_question = user_question.toLowerCase();

        List<String> answers = new ArrayList<>();

        for (String database_question : database.keySet()) {
            if (user_question.contains(database_question)) {
                answers.add(database.get(database_question));
            }
        }

        if (answers.isEmpty()) {
            answers.add("OK");
        }

        return String.join(",", answers);
    }
}
