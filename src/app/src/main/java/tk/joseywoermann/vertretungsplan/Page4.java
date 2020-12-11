package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton4);
        Button increasePageButton = findViewById(R.id.increasePageButton4);
        /*
        increasePageButton.setOnClickListener(this);
        decreasePageButton.setOnClickListener(this);
        */
        //updateWebviewUrl(1);


        WebView vertretungsplan_wv4 = (WebView)findViewById(R.id.vertretungsplan_wv4);
        vertretungsplan_wv4.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv4.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm");
    }

    /** Called when the user taps the Send button */
    public void nextPage4(View view) {
        // Do something in response to button
        Intent page5 = new Intent(this, Page5.class);
        startActivity(page5);
    }

    /** Called when the user taps the Send button */
    public void previousPage4(View view) {
        // Do something in response to button
        Intent page3 = new Intent(this, Page3.class);
        startActivity(page3);
    }
}
