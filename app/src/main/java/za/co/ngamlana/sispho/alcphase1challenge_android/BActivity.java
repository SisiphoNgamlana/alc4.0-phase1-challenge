package za.co.ngamlana.sispho.alcphase1challenge_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class BActivity extends AppCompatActivity {

    private static final String TAG = BActivity.class.getSimpleName();
    private static final String URL_ABOUT_ALC = "https://andela.com/alc/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        WebView aboutAlcWebView = findViewById(R.id.web_view_about_alc);
        aboutAlcWebView.getSettings().setJavaScriptEnabled(true);
        aboutAlcWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return true;
            }
        });
        aboutAlcWebView.loadUrl(URL_ABOUT_ALC);
        Log.d(TAG, "WebView initiated");
    }
}
