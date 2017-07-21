package us.paradyse.support;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalFadingEdgeEnabled(false);
        webView.getSettings().setUserAgentString("Desktop");
        webView.loadUrl("https://docs.google.com/document/d/1-smjd_BtgOVy_nXq6EnKe1eiHzGhbAGgkmIEY1izmOA/pub");


    }
}
