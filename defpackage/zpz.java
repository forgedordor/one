package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpz implements aalp {
    private final fcsu a;

    public zpz(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        awgn awgnVar = (awgn) this.a.b();
        if (awgnVar.f != null) {
            awgnVar.a();
            awgnVar.f = null;
        }
    }
}
