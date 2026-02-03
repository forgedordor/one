package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fffe implements fffz {
    public final fffz b;

    public fffe(fffz fffzVar) {
        this.b = fffzVar;
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.b.a();
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.fffz, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    @Override // defpackage.fffz
    public void hO(ffez ffezVar, long j) {
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
