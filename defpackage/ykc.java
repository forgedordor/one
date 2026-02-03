package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykc implements aalp {
    public final ains a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final fdjx d;

    public ykc(ains ainsVar, fdjx fdjxVar) {
        ainsVar.getClass();
        fdjxVar.getClass();
        this.a = ainsVar;
        this.d = fdjxVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        auvw.k(this.d, null, null, new ykb(this.b.get(), this, this.c.get(), null), 3);
    }
}
