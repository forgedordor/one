package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlx implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/gaia/synclet/GaiaStatusUpdaterSynclet");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fdjx e;

    public cdlx(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new cdlw(this, null));
    }
}
