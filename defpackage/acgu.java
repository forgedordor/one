package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/growthkit/GrowthKitLogger");
    private final drzc b;

    public acgu(drzc drzcVar) {
        this.b = drzcVar;
    }

    public final void a(int i) {
        eieu eieuVarK = eiiy.k("GrowthKitLogger#logEventAsync");
        try {
            ListenableFuture listenableFutureA = this.b.a(i - 1);
            eieuVarK.b(listenableFutureA);
            eork.r(listenableFutureA, new acgt(), eoqg.a);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
