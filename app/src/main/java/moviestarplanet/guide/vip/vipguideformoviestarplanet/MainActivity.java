package moviestarplanet.guide.vip.vipguideformoviestarplanet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tips(View view) {

        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("status", 1);
        startActivity(intent);

    }

    public void guide(View view) {
        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("status", 2);
        startActivity(intent);
    }

    public void gems(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/iYo3c3"));
        startActivity(browserIntent);
    }

    public void banner(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/iYo3c3"));
        startActivity(browserIntent);
    }

}
