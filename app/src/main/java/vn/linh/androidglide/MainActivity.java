package vn.linh.androidglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view);

        String url = "https://tribesofcreation.files.wordpress.com/2010/03/grand_universe_by_antifan_real1.jpg";

        Glide.with(this).load(url).into(imageView);
    }
}
