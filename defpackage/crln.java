package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crln implements crlk {
    public static final cczv a = cdag.f(cdag.b, "smarts_hats_suggestions_usage_time_window_millis", TimeUnit.DAYS.toMillis(3));
    public static final cczv b = cdag.e(cdag.b, "smarts_hats_minimum_suggestions_required", 3);
    public final cogw c;
    private final fdjx d;
    private final fcsu e;
    private final fcsu f;
    private final cqce g;

    public crln(fdjx fdjxVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.c = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = cqce.g("Bugle", "SmartSuggestionSettingsImpl");
    }

    @Override // defpackage.crlk
    public final eiju a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new crlm(this, null));
    }

    @Override // defpackage.crlk
    public final boolean b() {
        if (!e()) {
            return false;
        }
        fcsu fcsuVar = this.f;
        return ((crqx) fcsuVar.b()).n() || ((crqx) fcsuVar.b()).g() || ((crqx) fcsuVar.b()).m() || ((crqx) fcsuVar.b()).o();
    }

    @Override // defpackage.crlk
    public final boolean c() {
        return d() && ((Boolean) crbf.d.e()).booleanValue();
    }

    @Override // defpackage.crlk
    public final boolean d() {
        return e() && ((crqx) this.f.b()).n();
    }

    @Override // defpackage.crlk
    public final boolean e() {
        fcsu fcsuVar = this.e;
        boolean zIsEmpty = ((crej) fcsuVar.b()).a().a.isEmpty();
        boolean zIsEmpty2 = ((crej) fcsuVar.b()).a().b.isEmpty();
        cqce cqceVar = this.g;
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.B("Reply suggestions enabled", !zIsEmpty);
        cqbdVarD.r();
        cqbd cqbdVarD2 = cqceVar.d();
        cqbdVarD2.B("Continuation suggestions enabled", !zIsEmpty2);
        cqbdVarD2.r();
        return (zIsEmpty && zIsEmpty2) ? false : true;
    }

    @Override // defpackage.crlk
    public final int f() {
        boolean zE = e();
        boolean zB = b();
        if (zE) {
            return zB ? 4 : 3;
        }
        return 2;
    }
}
