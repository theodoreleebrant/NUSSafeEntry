package com.example.utownentrypass;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void foodclique (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-200414013C-305446-KIMLYCSNUS-SE");
    }

    public void fairprice (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-200002019C-224153-XPNUS-SE");
    }

    public void hwangs (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-198803627E-398612-NUSHWANGSUTOWN-SE");
    }

    public void cheers (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-200002019C-964881-CUTOWN-SE");
    }

    public void subway (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-200601894K-389423-SUBSUTPTELTD-SE");
    }

    public void udon (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-198801832Z-326000-UDONDONBARNUS-SE");
    }

    public void sapore (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-199104762M-899728-MEGADEVELOPMENTTRADINGPTE-SE");
    }

    public void finefoods (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-201727818R-54922-FINEFOODNUSUTOWN-SE");
    }

    public void octobox (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-201221903G-316997-OCTOBOXUTOWN-SE");
    }

    public void waacow (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-201607038E-508457-WAACOWNUS-SE");
    }

    public void hongkong (View view) {
        goToUrl ( "https://temperaturepass.ndi-api.gov.sg/login/PROD-201016533D-974505-NUS2359BYLIJI-SE");
    }

    public void supersnacks(View view) {
        goToUrl("https://temperaturepass.ndi-api.gov.sg/login/PROD-T07LL0796L-657942-NUSSUPERSNACKSUTOWN-SE");
    }
}

