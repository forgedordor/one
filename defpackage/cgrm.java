package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrm implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/synclet/NotificationStateSynclet");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public cgrm(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new cgrl(this, null));
    }
}
