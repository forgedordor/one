package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pps {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    private static final boolean c = true;
    private static final WeakHashMap d = new WeakHashMap();

    public static pra a(WebView webView) {
        if (!pqx.i.d() || !c) {
            return new pra(c(webView));
        }
        WeakHashMap weakHashMap = d;
        pra praVar = (pra) weakHashMap.get(webView);
        if (praVar != null) {
            return praVar;
        }
        pra praVar2 = new pra(c(webView));
        weakHashMap.put(webView, praVar2);
        return praVar2;
    }

    public static void b(WebView webView, String str, Set set, ppr pprVar) {
        if (!pqx.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pra praVarA = a(webView);
        praVarA.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new fghn(new pqp(pprVar)));
    }

    private static WebViewProviderBoundaryInterface c(WebView webView) {
        return pqz.a.b(webView);
    }
}
