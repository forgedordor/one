package defpackage;

import android.content.Context;
import android.webkit.CookieManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abie implements abic {
    public static final cqce a = cqce.g("Bugle", "SatelliteGaiaCookiesAuth");
    public final fcsu b;
    public final egej c;
    public final fcsu d;
    public final dbnc e;
    private final fdjx f;
    private final CookieManager g;

    public abie(Context context, fdjx fdjxVar, fcsu fcsuVar, egej egejVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        egejVar.getClass();
        fcsuVar2.getClass();
        this.f = fdjxVar;
        this.b = fcsuVar;
        this.c = egejVar;
        this.d = fcsuVar2;
        this.e = new dbnc(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.getClass();
        this.g = cookieManager;
    }

    @Override // defpackage.abic
    public final eiju a(efwo efwoVar) {
        efwoVar.getClass();
        return auvw.c(this.f, fcyi.a, fdjz.a, new abid(this, efwoVar, null));
    }

    @Override // defpackage.abic
    public final void b() {
        try {
            CookieManager cookieManager = this.g;
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            ((ains) this.b.b()).e("Bugle.Satellite.Gaia.Cookies.Remove.Result", 1);
        } catch (RuntimeException e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Unable to remove cookies due to runtime exception");
            cqbdVarE.s(e);
            ((ains) this.b.b()).e("Bugle.Satellite.Gaia.Cookies.Remove.Result", 2);
            auvh.h(((cden) this.d.b()).b(e));
        }
    }
}
