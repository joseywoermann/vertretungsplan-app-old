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

    /*private void updateWebviewUrl(int pageNumber) {
        String currentPage = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";



        String page1 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm";
        String page2 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm";
        String page3 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm";
        String page4 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm";
        String page5 = "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm";

        //String currentPage = "page1";

        WebView vertretungsplan_wv = (WebView)findViewById(R.id.vertretungsplan_wv);
        vertretungsplan_wv.getSettings().setJavaScriptEnabled(true);
        vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm");

        switch (pageNumber) {
            case 1:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm");
            case 2:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm");
            case 3:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_003.htm");
            case 4:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_004.htm");
            case 5:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_005.htm");
            default:
                vertretungsplan_wv.loadUrl("http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm");

        }



    }*/



    /*@Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.increasePageButton:
                Toast.makeText(this, "button1", Toast.LENGTH_SHORT).show();
                Intent page1Intent = new Intent(this, Page2.class);
                startActivity(page1Intent);
                break;

            case R.id.decreasePageButton:
                Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/

    /*String[] pages = {"http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_001.htm", "http://www.kreisgymnasium-halle.de/wp-content/uploads/Service/vertretungsplan/subst_002.htm"};
    int currentPage = 1;
    WebView vertretungsplan_wv = (WebView)findViewById(R.id.vertretungsplan_wv);
    public void next(View view) {
        if (currentPage != pages.length - 1){
            currentPage++;
            vertretungsplan_wv.loadUrl(pages[currentPage]);
        }
    }

    public void previous(View view) {
        if (currentPage != pages.length - 1){
            currentPage--;
            vertretungsplan_wv.loadUrl(pages[currentPage]);
        }
    }*/

