package vn.linh.androidglide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView2;
    String url =
            "https://www.gettyimages.ca/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view);
        imageView2 = findViewById(R.id.image_view_2);

//        loadImage();
        loadRounderImage();
    }

    private void loadImage(){
        RequestOptions requestOptions = new RequestOptions();
        RequestOptions placeholder = requestOptions.placeholder(R.drawable.ic_user_selected);
        RequestOptions s = requestOptions.override(Target.SIZE_ORIGINAL);
        Glide.with(this).setDefaultRequestOptions(placeholder).load("").into(imageView);
    }

    private void loadRounderImage(){
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(32));
        Glide.with(this)
                .load(url)
                .apply(requestOptions).into(imageView);
    }
}
