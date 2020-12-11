package tk.joseywoermann.vertretungsplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Page6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        // Buttons
        Button decreasePageButton = findViewById(R.id.decreasePageButton6);
        Button increasePageButton = findViewById(R.id.increasePageButton6);

        WebView vertretungsplan_wv6 = (WebView)findViewById(R.id.vertretungsplan_wv6);
        vertretungsplan_wv6.getSettings().setJavaScriptEnabled(false);
        vertretungsplan_wv6.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_006.htm");
    }

    public void nextPage6(View view) {
        Intent mainactivity = new Intent(this, MainActivity.class);
        startActivity(mainactivity);
    }

    public void previousPage6(View view) {
        Intent page5 = new Intent(this, Page5.class);
        startActivity(page5);
    }
}
