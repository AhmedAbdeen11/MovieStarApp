package moviestarplanet.guide.vip.vipguideformoviestarplanet;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        img = (ImageView) findViewById(R.id.details_img);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent intent = getIntent();
        int status = intent.getIntExtra("status", 0);

        if(status == 1){
            getSupportActionBar().setTitle("MSP Guide");
            img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn1_txt));
        }

        else if (status == 2){
            getSupportActionBar().setTitle("MSP Tips");
            img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.btn2_txt));
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home: finish();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

}
