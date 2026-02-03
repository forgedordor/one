package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prc implements prb {
    final WebViewProviderFactoryBoundaryInterface a;

    public prc(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // defpackage.prb
    public final StaticsBoundaryInterface a() {
        return (StaticsBoundaryInterface) fgho.a(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // defpackage.prb
    public final WebViewProviderBoundaryInterface b(WebView webView) {
        return (WebViewProviderBoundaryInterface) fgho.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // defpackage.prb
    public final WebkitToCompatConverterBoundaryInterface c() {
        return (WebkitToCompatConverterBoundaryInterface) fgho.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }

    @Override // defpackage.prb
    public final String[] d() {
        return this.a.getSupportedFeatures();
    }
}
