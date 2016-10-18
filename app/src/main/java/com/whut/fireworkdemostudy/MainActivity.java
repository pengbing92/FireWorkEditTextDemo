package com.whut.fireworkdemostudy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import com.whut.view.FireworkView;

public class MainActivity extends Activity {

    private FireworkView fireworkView;
    private EditText meditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meditText = (EditText) findViewById(R.id.input);

        fireworkView = (FireworkView) findViewById(R.id.fire_work);
        fireworkView.bindEditText(meditText);

    }
}
