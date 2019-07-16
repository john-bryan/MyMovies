package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<Movie> alMovies;
    CustomAdapter caMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent receivedIntent = getIntent();
        String title = receivedIntent.getStringExtra("title");
        String year = receivedIntent.getStringExtra("year");
        String genre = receivedIntent.getStringExtra("genre");
        String rated = receivedIntent.getStringExtra("rated");
        String theatre = receivedIntent.getStringExtra("theatre");
        String desc = receivedIntent.getStringExtra("desc");

        lvMovies = findViewById(R.id.lvMovies);
        alMovies = new ArrayList<>();
        alMovies.add(new Movie(title, year, rated, genre, theatre,theatre, desc));
        alMovies.add(new Movie("Avengers", "2012", "pg13", "Fighting", "Shaw", "Shaw", "Avengers vs loki"));

        caMovies = new CustomAdapter(this, R.layout.row, alMovies);
        lvMovies.setAdapter(caMovies);
        caMovies.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.context_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.itemAdd:
                //Toast.makeText(this, "Home - selected.", Toast.LENGTH_SHORT).show();
                Intent iAdd = new Intent(getApplicationContext(),AddActivity.class);
                startActivity(iAdd);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
