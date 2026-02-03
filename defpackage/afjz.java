package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afjz implements ehwh {
    public static final cczi a = cdag.j(cdag.b, "smarts_classification_cleanup_interval_days", 7);
    public final fcsu b;
    private final fdjx c;

    public afjz(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fdjxVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        if (((Boolean) ((cczi) crbf.bD.get()).e()).booleanValue()) {
            return auvw.c(this.c, fcyi.a, fdjz.a, new afjy(this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}
