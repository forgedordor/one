package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhpe implements dhoz {
    public final dhpd a;
    private final dhoz b;

    public dhpe(dhpd dhpdVar, dhoz dhozVar) {
        this.a = dhpdVar;
        this.b = dhozVar;
    }

    @Override // defpackage.dhoz
    public final dhpa a(dhuu dhuuVar) {
        return this.b.a(dhuuVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
