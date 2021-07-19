package com.farmerfriend.FSecurity_CProd_Pest_Irrigation.Food_Security;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.farmerfriend.Constants;
import com.farmerfriend.R;
import com.farmerfriend.Video_Success_Stories.Videos.Webview;

public class WebVieW extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_vie_w);

        webView = (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(new WebVieW.WebClientBrowser());

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        webView.loadUrl(Constants.Url);

    }

    private class WebClientBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
