package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chkx implements egbu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesAccountCleanupInterceptor");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public chkx(fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar2;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.egbu
    public final ListenableFuture b(egbv egbvVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new chkw(egbvVar, this, null));
    }
}
