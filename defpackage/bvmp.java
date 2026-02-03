package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmp implements egbu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/settings/GaiaAccountCleanupInterceptor");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public bvmp(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fdjxVar;
    }

    @Override // defpackage.egbu
    public final ListenableFuture b(egbv egbvVar) {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bvmo(egbvVar, this, null));
    }
}
