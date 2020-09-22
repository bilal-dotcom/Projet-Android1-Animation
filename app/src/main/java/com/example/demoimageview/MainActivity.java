package com.example.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img= (ImageView)findViewById(R.id.img);

    }

    public void onSpin(View view) {

        img.animate().rotation(360f).setDuration(2000);
    }

    public void onGrow(View view) {

        img.animate()
                .scaleXBy(1.2f)
                .scaleXBy(1.2f)
                .setDuration(2000);
    }

    public void onTeleport(View view) {

        img.animate().alpha(0).setDuration(2000);
    }

    public void onReset(View view) {

         img.setImageResource(R.drawable.drag1);
         img.animate().scaleY(1f).scaleX(1f).alpha(1f);
    }
}
