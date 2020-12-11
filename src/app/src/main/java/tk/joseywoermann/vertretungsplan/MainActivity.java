package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton1);
        Button increasePageButton = findViewById(R.id.increasePageButton1);
        /*
        increasePageButton.setOnClickListener(this);
        decreasePageButton.setOnClickListener(this);
        */
        //updateWebviewUrl(1);


        WebView vertretungsplan_wv1 = (WebView)findViewById(R.id.vertretungsplan_wv1);
        vertretungsplan_wv1.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv1.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm");
    }

    /** Called when the user taps the Send button */
    public void nextPage1(View view) {
        // Do something in response to button
        Intent page2 = new Intent(this, Page2.class);
        startActivity(page2);
    }
}

        /*
        String page1 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        String page2 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";
        String page3 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm";
        String page4 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm";
        String page5 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm";
        */