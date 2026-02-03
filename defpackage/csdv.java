package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdv implements ehwh {
    public static final cczv a = cdag.e(cdag.b, "spam_data_cleanup_interval_days", 7);
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public csdv(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fdjxVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new csdu(this, null));
    }
}
