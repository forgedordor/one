package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqd extends eoqe {
    final /* synthetic */ eoqf a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoqd(eoqf eoqfVar, Callable callable, Executor executor) {
        super(eoqfVar, executor);
        this.a = eoqfVar;
        this.c = callable;
    }

    @Override // defpackage.eory
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.eory
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.eoqe
    public final void c(Object obj) {
        this.a.set(obj);
    }
}
