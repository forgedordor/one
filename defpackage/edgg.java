package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgg implements edgd {
    private static final String f = Locale.US.getLanguage();
    public final fbqm a;
    public final edgb b;
    public final ejwi c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public ejwi e = ejud.a;
    private final eosc g;
    private final edgh h;

    public edgg(fbqm fbqmVar, eosc eoscVar, edgb edgbVar, ejwi ejwiVar, edgh edghVar) {
        this.a = fbqmVar;
        this.g = eoscVar;
        this.b = edgbVar;
        this.c = ejwiVar;
        this.h = edghVar;
    }

    public static fbrg c() {
        fbrg fbrgVar = new fbrg();
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        fbqw fbqwVar = new fbqw("Accept-Language", fbqxVar);
        Locale locale = Locale.getDefault();
        String language = TextUtils.isEmpty(locale.getLanguage()) ? f : locale.getLanguage();
        if (!TextUtils.isEmpty(locale.getCountry())) {
            language = language + "-" + locale.getCountry();
        }
        fbrgVar.h(fbqwVar, language);
        return fbrgVar;
    }

    @Override // defpackage.edgd
    public final synchronized ListenableFuture a() {
        if (this.c.g()) {
            return eork.m(new Callable() { // from class: edge
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    edgg edggVar = this.a;
                    etun etunVar = (etun) etuo.a(edggVar.a).k(fbgv.d(), TimeUnit.SECONDS);
                    if (edggVar.d.compareAndSet(true, false) && edggVar.e.g()) {
                        edggVar.b.a((String) edggVar.e.c());
                        edggVar.e = ejud.a;
                    }
                    if (!edggVar.e.g()) {
                        edgb edgbVar = edggVar.b;
                        edggVar.e = ejwi.j(dbmq.d(edgbVar.a, (Account) edggVar.c.c(), edgbVar.b));
                    }
                    return (etun) ((etun) etunVar.i(new fbtx(ejbe.d(new ejas((String) edggVar.e.c(), null))))).m(new fcrz(edgg.c()));
                }
            }, this.g);
        }
        return eooq.f(eoqt.t(drgi.a(this.h.a.a())), new ejvr() { // from class: edgf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbrg fbrgVarC = edgg.c();
                fbqx fbqxVar = fbrg.c;
                int i = fbrb.d;
                fbrgVarC.h(new fbqw("X-Goog-Spatula", fbqxVar), (String) obj);
                return (etun) ((etun) etuo.a(this.a.a).k(fbgv.d(), TimeUnit.SECONDS)).m(new fcrz(fbrgVarC));
            }
        }, this.g);
    }

    @Override // defpackage.edgd
    public final synchronized void b() {
        this.d.set(true);
    }
}
