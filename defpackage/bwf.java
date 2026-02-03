package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwf {
    public static final ListenableFuture a(Context context) {
        ListenableFuture listenableFutureD;
        context.getClass();
        bwb bwbVar = bwg.a.b;
        synchronized (bwbVar.a) {
            listenableFutureD = bwbVar.b;
            if (listenableFutureD == null) {
                final azp azpVar = new azp(context);
                bpw bpwVarA = bpw.a(bwbVar.c);
                final fdap fdapVar = new fdap() { // from class: bvy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        return azpVar.m;
                    }
                };
                ListenableFuture listenableFutureG = bqk.g(bpwVarA, new bpr() { // from class: bvz
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.bpr
                    public final ListenableFuture a(Object obj) {
                        return fdapVar.invoke(obj);
                    }
                }, bpc.a());
                bwbVar.b = listenableFutureG;
                bqk.i(listenableFutureG, new bwa(bwbVar, azpVar, context), bpc.a());
                listenableFutureD = bqk.d(listenableFutureG);
                listenableFutureD.getClass();
            }
        }
        final fdap fdapVar2 = new fdap() { // from class: bwd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return bwg.a;
            }
        };
        return bqk.f(listenableFutureD, new akv() { // from class: bwe
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return fdapVar2.invoke(obj);
            }
        }, bpc.a());
    }
}
