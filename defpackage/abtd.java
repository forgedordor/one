package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.MailTo;
import android.net.ParseException;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtd extends ebsj implements cqto {
    public Optional c;
    public eiju d;
    public final cqtq e;
    public final cqtq f;
    public final cqtq g;
    private final eigp j;
    private final aipo k;
    private final cqtq l;
    private final String m;
    private static final cqce h = cqce.g("Bugle", "DittoWebView");
    private static final ekrg i = ekrg.c("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient");
    public static final ekgb a = ekgb.u("https://messages.google.com/web/*", "https://messages-web-preprod.sandbox.google.com/web/*", "https://messages-web-staging.sandbox.google.com/web/*", "https://messages-web-autopush.sandbox.google.com/web/*");
    static final ekgb b = ekgb.s("listening_on_sat_jsb_dittotobugle", "listening_on_sat_jsb_bugletoditto");

    /* JADX WARN: Multi-variable type inference failed */
    public abtd(eigp eigpVar, aipo aipoVar, cqtp cqtpVar, String str) {
        int iIndexOf;
        ekgb ekgbVar = a;
        int i2 = ebsg.a;
        int i3 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqh it = ekgbVar.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!ejwk.c(str2) && (iIndexOf = str2.indexOf("://")) != -1) {
                int i4 = iIndexOf + 3;
                int iIndexOf2 = str2.indexOf("/", i4);
                iIndexOf2 = iIndexOf2 == -1 ? str2.indexOf("\\?", i4) : iIndexOf2;
                iIndexOf2 = iIndexOf2 == -1 ? str2.indexOf("#", i4) : iIndexOf2;
                iIndexOf2 = iIndexOf2 == -1 ? str2.length() : iIndexOf2;
                int iIndexOf3 = str2.indexOf("*");
                if (iIndexOf3 == -1 || iIndexOf3 < i4 || iIndexOf3 >= iIndexOf2) {
                    ejwi ejwiVarA = ebsi.a(str2);
                    if (ejwiVarA.g()) {
                        ekfwVar.h(ejwiVarA.c());
                    }
                }
            }
        }
        super(new ebsg(ekfwVar.g()));
        this.c = Optional.empty();
        this.l = cqtpVar.a(this);
        this.e = cqtpVar.a(this);
        this.f = cqtpVar.a(this);
        this.g = cqtpVar.a(this);
        this.j = eigpVar;
        this.k = aipoVar;
        this.m = str;
        this.d = eiju.g(kol.a(new koi() { // from class: absy
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.c = Optional.of(kogVar);
                return null;
            }
        }));
    }

    private final void g() {
        this.d = eiju.g(kol.a(new koi() { // from class: absz
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                this.a.c = Optional.of(kogVar);
                return null;
            }
        }));
    }

    public final cquc a(String str, cqtk cqtkVar) {
        return this.l.a(cqtkVar, "Subscribe to Ditto Load Start Events", str, "Unsubscribe from Ditto Load Start Events");
    }

    @Override // defpackage.ebsf
    public final boolean d(WebView webView, WebResourceRequest webResourceRequest) throws IOException {
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return false;
        }
        String string = url.toString();
        if (string != null && string.startsWith(abmt.d())) {
            webView.loadUrl(url.toString());
            return true;
        }
        if (URLUtil.isNetworkUrl(url.toString())) {
            try {
                Context context = webView.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", url);
                if (!(context instanceof Activity)) {
                    intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                }
                eiid.o(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                h.s("Did not find a browser to open link in", e);
            }
        } else {
            String string2 = url.toString();
            cqce cqceVar = cmvy.a;
            if (alwh.i(string2)) {
                try {
                    Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                    try {
                        String[] strArrSplit = MailTo.parse(url.toString()).getTo().split(",");
                        if (strArrSplit.length == 0) {
                            ((ekrd) ((ekrd) i.j()).h("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onUrlLoadBlocked", 149, "DittoWebViewClient.java")).q("No TO addresses parsed, not sending email intent");
                            return false;
                        }
                        intent2.putExtra("android.intent.extra.EMAIL", strArrSplit);
                        Context context2 = webView.getContext();
                        if (!(webView.getContext() instanceof Activity)) {
                            intent2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        }
                        eiid.o(context2, intent2);
                        return true;
                    } catch (ParseException unused) {
                        ((ekrd) ((ekrd) i.j()).h("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onUrlLoadBlocked", 145, "DittoWebViewClient.java")).q("Failed to parse mailto link");
                        return false;
                    }
                } catch (ActivityNotFoundException e2) {
                    h.s("Did not find a email app to open the email in", e2);
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String queryParameter;
        Uri uri = Uri.parse(str);
        if (str != null && ejwk.b(uri.getPath()).equals("/web/notify_satellite") && (queryParameter = uri.getQueryParameter("event")) != null && b.contains(queryParameter)) {
            eieh eiehVarC = this.j.c("receivedInterceptorSignal", "com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onLoadResource", 209);
            try {
                cqbd cqbdVarC = h.c();
                cqbdVarC.I("Received interceptor signal");
                cqbdVarC.A("signal", queryParameter);
                cqbdVarC.r();
                eieu eieuVarK = eiiy.k("Interceptor Signal Callback");
                try {
                    this.g.b(queryParameter, eieuVarK);
                    eieuVarK.close();
                    eiehVarC.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    eiehVarC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        eieh eiehVarC = this.j.c("onPageFinished", "com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onPageFinished", 189);
        try {
            if (ejwk.b(Uri.parse(str).getPath()).startsWith("/web")) {
                this.k.k(this.m);
                this.c.ifPresent(new Consumer() { // from class: abta
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ekgb ekgbVar = abtd.a;
                        ((kog) obj).b(null);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                g();
                eieu eieuVarK = eiiy.k("Ditto Load finish Callback");
                try {
                    this.e.b(null, eieuVarK);
                    eieuVarK.close();
                } finally {
                }
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        eieu eieuVarK;
        super.onPageStarted(webView, str, bitmap);
        eieh eiehVarC = this.j.c("onPageStarted", "com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onPageStarted", 169);
        try {
            if (ejwk.b(Uri.parse(str).getPath()).startsWith("/web")) {
                h.p("Detected a Ditto page load starting");
                this.k.b(this.m);
                eieuVarK = eiiy.k("Ditto Load Start Callback");
                try {
                    this.l.b(null, eieuVarK);
                    eieuVarK.close();
                } finally {
                }
            }
            if (ejwk.b(Uri.parse(str).getPath()).startsWith("/web/authentication")) {
                h.p("Ditto is on the Authentication page");
                eieuVarK = eiiy.k("Ditto Needs Authentication Callback");
                try {
                    this.f.b(null, eieuVarK);
                    eieuVarK.close();
                } finally {
                }
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        Uri url = webResourceRequest.getUrl();
        cqbd cqbdVarE = h.e();
        cqbdVarE.I("onReceivedError");
        cqbdVarE.A("urlHost", url.getHost());
        cqbdVarE.A("description", webResourceError.getDescription());
        cqbdVarE.y("code", webResourceError.getErrorCode());
        cqbdVarE.r();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (url == null || !ejwk.b(url.getPath()).startsWith("/web")) {
            return;
        }
        this.k.e(this.m);
        this.c.ifPresent(new Consumer() { // from class: abtb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekgb ekgbVar = abtd.a;
                ((kog) obj).c(new abtc(webResourceError));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g();
    }

    @Override // defpackage.cqto
    public final void fJ() {
    }

    @Override // defpackage.cqto
    public final void fK() {
    }
}
