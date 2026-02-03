package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnh extends exwv {
    public final ejly a;
    public final ejnn b;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public ejnh(ejnn ejnnVar, ejly ejlyVar) {
        this.b = ejnnVar;
        this.a = ejlyVar;
    }

    @Override // defpackage.exwv
    protected final exwq a() {
        exwq exwqVar = this.b.c;
        return exwqVar == null ? exwq.a : exwqVar;
    }

    @Override // defpackage.exwv
    public final synchronized void b() {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.get()) {
            return;
        }
        super.b();
        atomicBoolean.set(true);
    }
}
