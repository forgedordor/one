package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejla implements ejky {
    private final Object a;
    private final ejlb b;

    public ejla(Object obj, ejlb ejlbVar) {
        this.a = obj;
        this.b = ejlbVar;
    }

    @Override // defpackage.ejky
    public final Object a() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.d();
    }
}
