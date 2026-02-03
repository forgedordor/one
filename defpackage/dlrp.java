package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrp extends WebChromeClient {
    public dlsq a;

    public final dlsq a() {
        dlsq dlsqVar = this.a;
        if (dlsqVar != null) {
            return dlsqVar;
        }
        fdbq.c("state");
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        super.onProgressChanged(webView, i);
        if (((dlrt) a().b.a()) instanceof dlrq) {
            return;
        }
        a().b(new dlrs(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        webView.getClass();
        super.onReceivedIcon(webView, bitmap);
        a().c(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        webView.getClass();
        super.onReceivedTitle(webView, str);
        a().d(str);
    }
}
