package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlsi implements fdau {
    final /* synthetic */ fdap a;
    final /* synthetic */ fdap b;
    final /* synthetic */ dlrp c;
    final /* synthetic */ dlru d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dlsq f;
    final /* synthetic */ dlsp g;
    final /* synthetic */ hox h;

    public dlsi(fdap fdapVar, fdap fdapVar2, dlrp dlrpVar, dlru dlruVar, boolean z, dlsq dlsqVar, dlsp dlspVar, hox hoxVar) {
        this.a = fdapVar;
        this.b = fdapVar2;
        this.c = dlrpVar;
        this.d = dlruVar;
        this.e = z;
        this.f = dlsqVar;
        this.g = dlspVar;
        this.h = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(-1224400529);
            final fdap fdapVar = this.a;
            boolean zD = hmlVar.D(fdapVar);
            final fdap fdapVar2 = this.b;
            boolean zD2 = zD | hmlVar.D(fdapVar2);
            boolean z = (iIntValue & 14) == 4;
            final dlrp dlrpVar = this.c;
            boolean zF = hmlVar.F(dlrpVar) | zD2 | z;
            final dlru dlruVar = this.d;
            boolean zF2 = zF | hmlVar.F(dlruVar);
            final hox hoxVar = this.h;
            Object objF = hmlVar.f();
            if (zF2 || objF == hmk.a) {
                Object obj4 = new fdap() { // from class: dlsg
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        Context context = (Context) obj5;
                        context.getClass();
                        WebView webView = (WebView) fdapVar.invoke(context);
                        fdapVar2.invoke(webView);
                        long j = edkVar.a;
                        webView.setLayoutParams(new ViewGroup.LayoutParams(true != kil.k(j) ? -2 : -1, true == kil.j(j) ? -1 : -2));
                        webView.setWebChromeClient(dlrpVar);
                        webView.setWebViewClient(dlruVar);
                        WebSettings settings = webView.getSettings();
                        settings.getClass();
                        settings.setJavaScriptEnabled(true);
                        settings.setMediaPlaybackRequiresUserGesture(false);
                        hoxVar.b(webView);
                        return webView;
                    }
                };
                hmlVar.y(obj4);
                objF = obj4;
            }
            fdap fdapVar3 = (fdap) objF;
            hmlVar.o();
            hmlVar.v(-1746271574);
            final boolean z2 = this.e;
            boolean zE = hmlVar.E(z2);
            final dlsq dlsqVar = this.f;
            boolean zD3 = zE | hmlVar.D(dlsqVar);
            final dlsp dlspVar = this.g;
            boolean zD4 = zD3 | hmlVar.D(dlspVar);
            Object objF2 = hmlVar.f();
            if (zD4 || objF2 == hmk.a) {
                objF2 = new fdap() { // from class: dlsh
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        WebView webView = (WebView) obj5;
                        webView.getClass();
                        if (z2) {
                            return fctx.a;
                        }
                        dlrx dlrxVarA = dlsqVar.a();
                        if (dlrxVarA instanceof dlrw) {
                            dlrw dlrwVar = (dlrw) dlrxVarA;
                            String str = dlrwVar.a;
                            if (str.length() > 0 && !fdbq.f(str, webView.getUrl())) {
                                webView.loadUrl(str, fcwa.m(dlrwVar.b));
                            }
                        } else {
                            if (!(dlrxVarA instanceof dlrv)) {
                                throw new fctg();
                            }
                            webView.loadDataWithBaseURL(null, ((dlrv) dlrxVarA).a, null, "utf-8", null);
                        }
                        dlsp dlspVar2 = dlspVar;
                        dlspVar2.b(webView.canGoBack());
                        dlspVar2.c(webView.canGoForward());
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            kli.b(fdapVar3, null, (fdap) objF2, hmlVar, 0, 2);
        }
        return fctx.a;
    }
}
