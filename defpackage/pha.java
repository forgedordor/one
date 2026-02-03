package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pha implements AutoCloseable {
    public final phb a;

    public pha(phb phbVar) {
        this.a = phbVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.a.close();
    }
}
