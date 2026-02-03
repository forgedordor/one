package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtt implements abtq {
    @Override // defpackage.abtq
    public final void a(abto abtoVar, ppk ppkVar, Uri uri) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        WebView webView = (WebView) abtoVar.b().orElseThrow(new Supplier() { // from class: abts
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Could not post a WebMessage; WebView has been destroyed");
            }
        });
        if (pps.a.equals(uri)) {
            uri = pps.b;
        }
        int i = ppkVar.c;
        ppu ppuVar = pqx.d;
        if (i == 0) {
            webView.postWebMessage(pqe.a(ppkVar), uri);
            return;
        }
        if (!ppuVar.d() || !pqn.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Looper webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        pps.a(webView).a.postMessageToMainFrame(new fghn(new pqn(ppkVar)), uri);
    }

    @Override // defpackage.abtq
    public final ppm[] b(abto abtoVar) {
        WebView webView = (WebView) abtoVar.b().orElseThrow(new Supplier() { // from class: abtr
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Could not create a WebMessage channel; WebView has been destroyed");
            }
        });
        Uri uri = pps.a;
        ppu ppuVar = pqx.a;
        return pqr.f(webView.createWebMessageChannel());
    }
}
