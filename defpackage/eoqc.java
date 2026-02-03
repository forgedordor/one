package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqc extends eoqe {
    final /* synthetic */ eoqf a;
    private final eooy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoqc(eoqf eoqfVar, eooy eooyVar, Executor executor) {
        super(eoqfVar, executor);
        this.a = eoqfVar;
        this.c = eooyVar;
    }

    @Override // defpackage.eory
    public final /* bridge */ /* synthetic */ Object a() {
        ListenableFuture listenableFutureA = this.c.a();
        listenableFutureA.getClass();
        return listenableFutureA;
    }

    @Override // defpackage.eory
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.eoqe
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.o((ListenableFuture) obj);
    }
}
