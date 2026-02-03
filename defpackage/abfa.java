package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfa implements abka {
    public static final eksp a = eksp.c("BugleSatelliteBg");
    public final fcsu b;
    private final Context c;
    private final abpk d;
    private final abte e;
    private final abtp f;
    private WebView g;
    private abto h;

    public abfa(Context context, abpk abpkVar, fcsu fcsuVar, abte abteVar, abtp abtpVar) {
        this.c = context;
        this.d = abpkVar;
        this.b = fcsuVar;
        this.e = abteVar;
        this.f = abtpVar;
    }

    @Override // defpackage.abka
    public final abto a(Map map) {
        if (this.g != null) {
            throw new IllegalStateException("Background service WebView can only be created once.");
        }
        if (this.d.h(abou.BACKGROUND)) {
            throw new IllegalStateException("Cannot create background bridge, one already exists");
        }
        WebView webView = new WebView(this.c);
        this.g = webView;
        abtp abtpVar = this.f;
        abtd abtdVarA = this.e.a("Bugle.Satellite.Background.LoadDuration");
        abtdVarA.f();
        abto abtoVarA = abtpVar.a(webView, abtdVarA, new abez());
        this.h = abtoVarA;
        abtoVarA.c().ifPresent(new Consumer() { // from class: abey
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setUserAgentString(webSettings.getUserAgentString() + " " + new ejwc(" ").b((Iterable) this.a.b.b()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        abtoVarA.f();
        String string = abmt.b(abmt.a().appendPath("satellite_bg")).build().toString();
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundWebViewFactory", "createAndLoad", 109, "SatelliteBackgroundWebViewFactory.java")).t("Starting WebView Load on %s", string);
        abtoVarA.e(string, map);
        return abtoVarA;
    }

    @Override // defpackage.abka
    public final void b() {
        if (this.h != null) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundWebViewFactory", "destroy", 76, "SatelliteBackgroundWebViewFactory.java")).q("Unloading background service webview");
            final abto abtoVar = this.h;
            abtoVar.getClass();
            abtoVar.b().ifPresent(new Consumer() { // from class: abti
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    abtoVar.d("about:blank");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        WebView webView = this.g;
        if (webView != null) {
            webView.destroy();
        }
        this.g = null;
        this.h = null;
    }
}
