package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoog extends eooh {
    public eoog(ListenableFuture listenableFuture, Class cls, ejvr ejvrVar) {
        super(listenableFuture, cls, ejvrVar);
    }

    @Override // defpackage.eooh
    public final /* bridge */ /* synthetic */ Object d(Object obj, Throwable th) {
        return ((ejvr) obj).apply(th);
    }

    @Override // defpackage.eooh
    public final void e(Object obj) {
        set(obj);
    }
}
