package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlc {
    public static void a(ListenableFuture listenableFuture, ejwy ejwyVar, ejwy ejwyVar2) {
        b(listenableFuture, ejwyVar, ejwyVar2, eoqg.a);
    }

    public static void b(ListenableFuture listenableFuture, ejwy ejwyVar, ejwy ejwyVar2, Executor executor) {
        eork.r(listenableFuture, new dxlb(ejwyVar, ejwyVar2), executor);
    }
}
