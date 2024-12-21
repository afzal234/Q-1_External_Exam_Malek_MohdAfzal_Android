package com.example.q_1_external_exam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView box;
    Button upButton, downButton, leftButton, rightButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box = findViewById(R.id.box);
        upButton = findViewById(R.id.upButton);
        downButton = findViewById(R.id.downButton);
        leftButton = findViewById(R.id.leftButton);
        rightButton = findViewById(R.id.rightButton);

        upButton.setOnClickListener(v -> animateBox(R.anim.flip_up));
        downButton.setOnClickListener(v -> animateBox(R.anim.flip_down));
        leftButton.setOnClickListener(v -> animateBox(R.anim.flip_left));
        rightButton.setOnClickListener(v -> animateBox(R.anim.flip_right));
    }
    private void animateBox(int animationResource) {
        Animation animation = AnimationUtils.loadAnimation(this, animationResource);
        box.startAnimation(animation);
    }
}
