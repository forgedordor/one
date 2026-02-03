package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aicx implements ehwh {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/restore/synclet/MessagesDeferredCloudRestoreSynclet");
    public final fcsu a;
    public final ahzu b;
    private final fdjx d;

    public aicx(ahzv ahzvVar, fdjx fdjxVar, fcsu fcsuVar) {
        ahzvVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.d = fdjxVar;
        this.a = fcsuVar;
        this.b = ahzvVar.a(c, null, null);
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new aicw(this, null));
    }
}
