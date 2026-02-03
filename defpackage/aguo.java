package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aguo implements ehwh {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    public aguo(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new agun(this, null));
    }
}
