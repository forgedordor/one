package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpq {
    public final ListenableFuture a;

    public egpq(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public static egpq a(ListenableFuture listenableFuture) {
        return new egpq(eooq.f(listenableFuture, new ejvr() { // from class: egpp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (evuh) obj);
            }
        }, eoqg.a));
    }

    public static egpq b(ListenableFuture listenableFuture) {
        return new egpq(eooq.f(listenableFuture, new ejvt(null), eoqg.a));
    }
}
