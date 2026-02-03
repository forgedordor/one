package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxv {
    private static final cqce a = cqce.g("BugleGaia", "AccountErrorHandler");
    private final cden b;
    private final efxf c;
    private final Activity d;
    private final fcsu e;

    public abxv(cden cdenVar, efxf efxfVar, Activity activity, fcsu fcsuVar) {
        this.b = cdenVar;
        this.c = efxfVar;
        this.d = activity;
        this.e = fcsuVar;
    }

    public final void a(Throwable th) {
        eieu eieuVarK = eiiy.k("handleAccountError");
        try {
            fcsu fcsuVar = this.e;
            ((ains) fcsuVar.b()).c("Bugle.Gaia.HandleAccountError.Counts");
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Error happened when selecting account. Sign out user");
            cqbdVarE.A("From screen", this.d.getClass().getName());
            cqbdVarE.s(th);
            if (((Boolean) ((cczi) abxb.b.get()).e()).booleanValue()) {
                this.b.c(th);
            }
            ((ains) fcsuVar.b()).c("Bugle.Gaia.AccountError.SwitchToPseudonymous");
            this.c.d(ekgb.r(eghx.class));
            eieuVarK.close();
        } catch (Throwable th2) {
            try {
                eieuVarK.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
