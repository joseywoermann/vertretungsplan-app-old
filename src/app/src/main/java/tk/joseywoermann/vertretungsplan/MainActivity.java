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


        WebView vertretungsplan_wv1 = (WebView)findViewById(R.id.vertretungsplan_wv1);
        vertretungsplan_wv1.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv1.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm");
    }

    public void nextPage1(View view) {
        Intent page2 = new Intent(this, Page2.class);
        startActivity(page2);
    }

    public void previousPage1(View view) {
        Intent page6 = new Intent(this, Page6.class);
        startActivity(page6);
    }
}