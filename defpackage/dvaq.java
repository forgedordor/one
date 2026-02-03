package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvaq extends eoqx {
    private dvaq(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static dvaq e(ListenableFuture listenableFuture) {
        return listenableFuture instanceof dvaq ? (dvaq) listenableFuture : new dvaq(listenableFuture);
    }

    public final dvaq c(Class cls, ejvr ejvrVar, Executor executor) {
        return new dvaq(eika.e(this.b, cls, ejvrVar, executor));
    }

    public final dvaq d(Class cls, eooz eoozVar, Executor executor) {
        return new dvaq(eika.f(this.b, cls, eoozVar, executor));
    }

    public final dvaq f(ejvr ejvrVar, Executor executor) {
        return new dvaq(eika.j(this.b, ejvrVar, executor));
    }

    public final dvaq g(eooz eoozVar, Executor executor) {
        return new dvaq(eika.k(this.b, eoozVar, executor));
    }
}
