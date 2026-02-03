package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abto {
    public final ains a;
    private final WeakReference b;

    public abto(ains ainsVar, WebView webView, abtd abtdVar, WebChromeClient webChromeClient) {
        this.a = ainsVar;
        webView.setWebViewClient(abtdVar);
        if (webChromeClient != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        this.b = new WeakReference(webView);
    }

    public final Optional a() {
        return b().map(new Function() { // from class: abtk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((WebView) obj).getWebViewClient();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: abtl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                WebViewClient webViewClient = (WebViewClient) obj;
                if (webViewClient instanceof abtd) {
                    return (abtd) webViewClient;
                }
                this.a.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 1);
                throw new IllegalStateException("WebView client does not extend DittoWebViewClient");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final Optional b() {
        return Optional.ofNullable((WebView) this.b.get());
    }

    public final Optional c() {
        return b().map(new Function() { // from class: abtm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((WebView) obj).getSettings();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void d(String str) {
        ((WebView) b().orElseThrow(new Supplier() { // from class: abtf
            @Override // java.util.function.Supplier
            public final Object get() {
                this.a.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 2);
                return new IllegalStateException("Could not load Url; WebView has been destroyed");
            }
        })).loadUrl(str);
    }

    public final void e(String str, Map map) {
        ((WebView) b().orElseThrow(new Supplier() { // from class: abtg
            @Override // java.util.function.Supplier
            public final Object get() {
                this.a.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 2);
                return new IllegalStateException("Could not load Url; WebView has been destroyed");
            }
        })).loadUrl(str, map);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof abto) {
            return b().equals(((abto) obj).b());
        }
        return false;
    }

    public final void f() {
        ((WebView) b().orElseThrow(new Supplier() { // from class: abth
            @Override // java.util.function.Supplier
            public final Object get() {
                this.a.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 3);
                return new IllegalStateException("Could not set importantForAccessibility; WebView has been destroyed");
            }
        })).setImportantForAccessibility(1);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
