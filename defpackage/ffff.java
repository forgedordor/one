package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffff implements ffgb {
    public final ffgb b;

    public ffff(ffgb ffgbVar) {
        ffgbVar.getClass();
        this.b = ffgbVar;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.b.a();
    }

    @Override // defpackage.ffgb
    public long b(ffez ffezVar, long j) {
        throw null;
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
