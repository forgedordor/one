package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajkh implements ehwh {
    public final fcsu a;
    public final ajjz b;
    public final eksp c;
    private final fdjx d;

    public ajkh(fcsu fcsuVar, ajjz ajjzVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = ajjzVar;
        this.d = fdjxVar;
        this.c = eksp.c("BugleCobalt");
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ajkg(this, null));
    }
}
