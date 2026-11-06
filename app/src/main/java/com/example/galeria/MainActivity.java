package com.example.galeria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button Dalej;
    private Button Wstecz;

    private ImageView Zdjecie;

    private List<Integer> Zdjecia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        PokazZdjecia();

        Dalej = findViewById(R.id.button4);
        Wstecz = findViewById(R.id.button5);
        Zdjecie = findViewById(R.id.imageView3);
    }
    private void PokazZdjecia(){
        Zdjecia = new ArrayList<>();
        Zdjecia.add(R.drawable.gora1);
        Zdjecia.add(R.drawable.gora2);
        Zdjecia.add(R.drawable.gora3);
        Zdjecia.add(R.drawable.gora4);
        Zdjecia.add(R.drawable.gora5);

    }
}