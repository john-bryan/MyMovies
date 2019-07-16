package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText etTitle;
    EditText etYear;
    EditText etGenre;
    EditText etRated;
    EditText etTheatre;
    EditText etDesc;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etTitle = findViewById(R.id.etTitle);
        etYear = findViewById(R.id.etYear);
        etGenre = findViewById(R.id.etGenre);
        etRated = findViewById(R.id.etRated);
        etTheatre = findViewById(R.id.etTheatre);
        etDesc = findViewById(R.id.etDesc);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getBaseContext(), MainActivity.class);
                intent.putExtra("title", etTitle.getText().toString());
                intent.putExtra("year", etYear.getText().toString());
                intent.putExtra("genre", etGenre.getText().toString());
                intent.putExtra("rated", etRated.getText().toString());
                intent.putExtra("theatre", etTheatre.getText().toString());
                intent.putExtra("desc", etDesc.getText().toString());
                startActivity(intent);
            }
        });

    }
}
