 package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.alpacino, R.drawable.angelinajolie, R.drawable.bradpitt, R.drawable.georgeclooney, R.drawable.johnnydepp,
                    R.drawable.juliaroberts, R.drawable.katewinslet, R.drawable.robertdeniro, R.drawable.tomcruse, R.drawable.tomhanks};

    String[] Names = {"Al Pacino","Angelina Jolie", "Brad Pitt", "GeorgeClooney", "Johnny Depp", "Julia Roberts", "Kate Winslet",
                "Robert De Niro","Tom Cruse", "Tom Hanks"};

    String[] Ages = {"82","47", "59","61","59","55","47","79","60","66"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView) findViewById(R.id.listView);

        CustomApter customApter=new CustomApter();

        listView.setAdapter(customApter);
    }

    class CustomApter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.cutomlayout,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textViewName);
            TextView textView_Age=(TextView)view.findViewById(R.id.textViewAge);
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(Names[i]);
            textView_Age.setText(Ages[i]);
            return view;
        }
    }
}