package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqz implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/profile/synclet/ProfileRefreshSynclet");
    public final efwo b;
    public final egbf c;
    public final fcyh d;
    public final chqo e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fdjx j;

    public chqz(efwo efwoVar, egbf egbfVar, fcyh fcyhVar, fdjx fdjxVar, chqo chqoVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        efwoVar.getClass();
        egbfVar.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = efwoVar;
        this.c = egbfVar;
        this.d = fcyhVar;
        this.j = fdjxVar;
        this.e = chqoVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.j, fcyi.a, fdjz.a, new chqy(this, null));
    }
}
