package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtp {
    private final fcsu a;

    public abtp(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final abto a(WebView webView, abtd abtdVar, WebChromeClient webChromeClient) {
        ains ainsVar = (ains) this.a.b();
        ainsVar.getClass();
        webView.getClass();
        return new abto(ainsVar, webView, abtdVar, webChromeClient);
    }
}
