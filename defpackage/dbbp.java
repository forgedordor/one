package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.time.Duration;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbp extends WebView {
    public static final Duration a = eoob.g(3);
    public static final List b = fcva.g("https://www.youtube.com/*", "https://www.google.com/*", "https://googleads.g.doubleclick.net/*", "https://ad.doubleclick.net/*", "https://static.doubleclick.net/*", "https://jnn-pa.googleapis.com/*", "https://play.google.com/*", "https://*.gstatic.com/*", "https://*.googlevideo.com/*", "https://*.googlesyndication.com/*", "https://*.ggpht.com/*", "https://*.ytimg.com/*");
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/youtube/YouTubePlayerWebView");
    public final fdkf d;
    public final fduf e;
    public final fduf f;
    public final fduf g;
    public ppj h;
    public final fdvc i;
    public final fdvc j;
    private final fdjx k;

    /* compiled from: PG */
    public interface a {
        fdjx gA();

        void iZ();
    }

    public dbbp(Context context) {
        super(context);
        fduf fdufVarA = fdvf.a(dbbm.a);
        this.e = fdufVarA;
        this.f = fdvf.a(dbbe.a);
        fduf fdufVarA2 = fdvf.a(false);
        this.g = fdufVarA2;
        this.i = new fduh(fdufVarA);
        this.j = new fduh(fdufVarA2);
        a aVar = (a) ehli.a(getContext(), a.class);
        this.k = aVar.gA();
        aVar.iZ();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Context context2 = getContext();
        context2.getClass();
        setWebViewClient(new dbbq(context2));
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setMixedContentMode(1);
        this.d = auvw.e(kol.a(new koi() { // from class: dbba
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                Set setB = fcwm.b("https://www.google.com");
                final dbbp dbbpVar = this.a;
                pps.b(dbbpVar, "messagingChannel", setB, new ppr() { // from class: dbaz
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
                    @Override // defpackage.ppr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(defpackage.ppk r8, boolean r9, defpackage.ppj r10) throws org.json.JSONException {
                        /*
                            Method dump skipped, instructions count: 302
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbaz.a(ppk, boolean, ppj):void");
                    }
                });
                return fctx.a;
            }
        }));
        loadUrl("https://www.google.com/youtube_player.html");
    }

    public final void a(JSONObject jSONObject) {
        auvw.k(this.k, null, null, new dbbs(this, jSONObject, null), 3);
    }
}
