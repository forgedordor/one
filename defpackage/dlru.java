package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlru extends ebsj {
    public dlsq a;
    public dlsp b;

    public dlru(ebsm ebsmVar) {
        super(ebsmVar);
    }

    public final dlsp b() {
        dlsp dlspVar = this.b;
        if (dlspVar != null) {
            return dlspVar;
        }
        fdbq.c("navigator");
        return null;
    }

    public final dlsq c() {
        dlsq dlsqVar = this.a;
        if (dlsqVar != null) {
            return dlsqVar;
        }
        fdbq.c("state");
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        String str2;
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null && !fdgn.t(str, "data:text/html")) {
            dlrx dlrxVarA = c().a();
            if (dlrxVarA instanceof dlrw) {
                str2 = ((dlrw) dlrxVarA).a;
            } else {
                if (!(dlrxVarA instanceof dlrv)) {
                    throw new fctg();
                }
                str2 = null;
            }
            if (!fdbq.f(str2, str)) {
                dlsq dlsqVarC = c();
                dlrx dlrxVarA2 = c().a();
                dlrxVarA2.getClass();
                dlsqVarC.a.b(dlrxVarA2 instanceof dlrw ? new dlrw(str, ((dlrw) dlrxVarA2).b) : new dlrw(str, fcvp.a));
            }
        }
        b().b(webView.canGoBack());
        b().c(webView.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        c().b(dlrq.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        super.onPageStarted(webView, str, bitmap);
        c().b(new dlrs(0.0f));
        c().c.clear();
        c().d(null);
        c().c(null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            c().c.add(new dlry(webResourceRequest, webResourceError));
        }
    }
}
