package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> moviesList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        moviesList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        TextView tvGenre = rowView.findViewById(R.id.tvGenre);
        ImageView ivRate = rowView.findViewById(R.id.ivRate);

        Movie currentItem = moviesList.get(position);

        if(currentItem.getRated() == "g") {
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_g);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }
        else if (currentItem.getRated() == "pg") {
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_pg);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }

        else if (currentItem.getRated() == "pg13") {
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_pg13);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }

        else if (currentItem.getRated() == "m18") {
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_m18);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }

        else if (currentItem.getRated() == "nc16") {
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_nc16);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }

        else{
            tvTitle.setText(currentItem.getTitle());
            ivRate.setImageResource(R.drawable.rating_r21);
            tvGenre.setText(currentItem.getGenre());
            tvYear.setText(currentItem.getYear());
        }


        return rowView;

    }


}
