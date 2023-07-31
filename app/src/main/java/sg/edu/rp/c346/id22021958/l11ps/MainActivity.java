package sg.edu.rp.c346.id22021958.l11ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnInsert, btnShow;
    TextView tvMovie, tvGenre, tvYear, tvRating;
    EditText etMovie, etGenre, etYear;
    Spinner rating;
    ArrayList<Movie>al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsert = findViewById(R.id.buttonInsert);
        btnShow = findViewById(R.id.buttonShow);
        tvMovie = findViewById(R.id.textViewMT);
        tvGenre = findViewById(R.id.textViewGenre);
        tvYear = findViewById(R.id.textViewYear);
        tvRating = findViewById(R.id.textViewRating);
        etMovie = findViewById(R.id.EditTextMT);
        etGenre = findViewById(R.id.editTextGenre);
        etYear = findViewById(R.id.editTextYear);
        rating = findViewById(R.id.spinner);

        al = new ArrayList<>();

        btnInsert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String movieTitle = etMovie.getText().toString();
                String movieGenre = etGenre.getText().toString();
                String movieYear = etYear.getText().toString();
                String movieRating =
            }
        });
    }
}