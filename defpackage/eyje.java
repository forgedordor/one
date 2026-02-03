package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyje {
    private static final ejvr a = new eyja();
    private static final eooz b = new eyjb();

    static {
        eork.i(ekoj.a);
    }

    public static ListenableFuture a(ListenableFuture listenableFuture) {
        ejvr ejvrVar = a;
        eoqg eoqgVar = eoqg.a;
        return eooh.g(eooq.f(listenableFuture, ejvrVar, eoqgVar), Throwable.class, b, eoqgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eyir b(eyir eyirVar, eyiz eyizVar) {
        if (eyirVar instanceof eyiy) {
            return eyirVar.g(eyizVar);
        }
        Objects.toString(eyirVar);
        throw new IllegalArgumentException("entryPointViewOf called with non-CancellableProducer: ".concat(String.valueOf(eyirVar)));
    }

    public static eyir c(eyir eyirVar) {
        if (eyirVar instanceof eyiy) {
            return ((eyiy) eyirVar).f();
        }
        Objects.toString(eyirVar);
        throw new IllegalArgumentException("nonCancellationPropagatingViewOf called with non-CancellableProducer: ".concat(String.valueOf(eyirVar)));
    }

    public static eyir d(eyik eyikVar) {
        eyikVar.getClass();
        return new eyjc(eyikVar);
    }

    public static void e(eyir eyirVar, boolean z) {
        if (eyirVar instanceof eyiy) {
            ((eyiy) eyirVar).h(z);
        } else {
            Objects.toString(eyirVar);
            throw new IllegalArgumentException("cancel called with non-CancellableProducer: ".concat(String.valueOf(eyirVar)));
        }
    }
}
