package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton2);
        Button increasePageButton = findViewById(R.id.increasePageButton2);
        /*
        increasePageButton.setOnClickListener(this);
        decreasePageButton.setOnClickListener(this);
        */
        //updateWebviewUrl(1);


        WebView vertretungsplan_wv2 = (WebView)findViewById(R.id.vertretungsplan_wv2);
        vertretungsplan_wv2.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv2.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm");
    }

    /** Called when the user taps the Send button */
    public void nextPage2(View view) {
        // Do something in response to button
        Intent page3 = new Intent(this, Page3.class);
        startActivity(page3);
    }

    /** Called when the user taps the Send button */
    public void previousPage2(View view) {
        // Do something in response to button
        Intent mainactivity = new Intent(this, MainActivity.class);
        startActivity(mainactivity);
    }
}
