package com.maerstek.sbx_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected Button sendButton;
    protected EditText questionText;
    protected TextView chatWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.sendButton);
        questionText = findViewById(R.id.questionField);
        chatWindow = findViewById(R.id.chatWindow);

    sendButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onClickSendButton();
        }
    });
    }

    protected void onClickSendButton(){
        String text = questionText.getText().toString();
        String answer = "Ok !";

        chatWindow.append(">>> " + text + "\n");
        chatWindow.append("<<< " + answer + "\n");

        questionText.setText("");
    }
}
