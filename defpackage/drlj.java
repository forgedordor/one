package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlj implements Runnable {
    private final drlo a;
    private final drlr b;
    private final Executor c;
    private final ejvr d;

    public drlj(drlo drloVar, drlr drlrVar, Executor executor, ejvr ejvrVar) {
        this.a = drloVar;
        this.b = drlrVar;
        this.c = executor;
        this.d = ejvrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.apply(toString());
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.a(this.a);
        ejwfVarB.a(this.b);
        ejwfVarB.a(this.c);
        return ejwfVarB.toString();
    }
}
