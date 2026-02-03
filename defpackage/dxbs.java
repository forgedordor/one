package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dxbs extends WebViewClient {
    private long a = 0;
    private final ejwi b;

    public dxbs(ejwi ejwiVar) {
        this.b = ejwiVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ejwi ejwiVar = this.b;
        if (ejwiVar.g()) {
            new Date().getTime();
            ((dwyf) ejwiVar.c()).a();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a = new Date().getTime();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ejwi ejwiVar = this.b;
        if (ejwiVar.g()) {
            ((dwyf) ejwiVar.c()).a();
        }
    }
}
