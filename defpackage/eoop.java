package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoop extends eooq {
    public eoop(ListenableFuture listenableFuture, ejvr ejvrVar) {
        super(listenableFuture, ejvrVar);
    }

    @Override // defpackage.eooq
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        return ((ejvr) obj).apply(obj2);
    }

    @Override // defpackage.eooq
    public final void e(Object obj) {
        set(obj);
    }
}
