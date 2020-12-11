package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton3);
        Button increasePageButton = findViewById(R.id.increasePageButton3);
        /*
        increasePageButton.setOnClickListener(this);
        decreasePageButton.setOnClickListener(this);
        */
        //updateWebviewUrl(1);


        WebView vertretungsplan_wv3 = (WebView)findViewById(R.id.vertretungsplan_wv3);
        vertretungsplan_wv3.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv3.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm");
    }

    /** Called when the user taps the Send button */
    public void nextPage3(View view) {
        // Do something in response to button
        Intent page4 = new Intent(this, Page4.class);
        startActivity(page4);
    }

    /** Called when the user taps the Send button */
    public void previousPage3(View view) {
        // Do something in response to button
        Intent page2 = new Intent(this, Page2.class);
        startActivity(page2);
    }
}
