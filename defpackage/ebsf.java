package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebsf extends WebViewClient {
    private static final eksp a = eksp.c("SaferWebViewClient");
    private final ebsm b;
    private final ebsm c;
    private boolean d = false;

    public ebsf(ebsm ebsmVar, ebsm ebsmVar2) {
        this.b = ebsmVar;
        this.c = ebsmVar2;
    }

    private static boolean b(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    private final boolean c(Uri uri) {
        boolean z = true;
        if (!ebsl.a.matcher(uri.toString()).find() && !this.c.b(uri)) {
            z = false;
        }
        if (!z) {
            ((eksl) a.n().h("com/google/android/libraries/saferwebview/AbstractSaferWebViewClient", "isResourceAllowlisted", 290, "AbstractSaferWebViewClient.java")).t("Uri '%s' is not allowed as resource", ebsl.a(uri));
        }
        return z;
    }

    public boolean d(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    protected abstract WebResourceResponse e(Uri uri);

    public final void f() {
        this.d = true;
    }

    public boolean fv(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponseE = e(webResourceRequest.getUrl());
        if (webResourceResponseE != null) {
            return webResourceResponseE;
        }
        if (this.d || c(webResourceRequest.getUrl())) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean zB = this.b.b(webResourceRequest.getUrl());
        return b(webView, zB, zB ? fv(webView, webResourceRequest) : d(webView, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseE = e(Uri.parse(str));
        if (webResourceResponseE != null) {
            return webResourceResponseE;
        }
        if (this.d || c(Uri.parse(str))) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return b(webView, this.b.b(Uri.parse(str)), false);
    }
}
