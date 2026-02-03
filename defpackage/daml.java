package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daml implements ddix {
    @Override // defpackage.ddix
    public final void a(ddkb ddkbVar) {
        if (cqca.q("EmptyExampleIterator", 4)) {
            cqca.i("EmptyExampleIterator", "next() called");
        }
        ddkbVar.b(null, null);
    }

    @Override // defpackage.ddix
    public final void b() {
        if (cqca.q("EmptyExampleIterator", 4)) {
            cqca.i("EmptyExampleIterator", "request() called");
        }
    }

    @Override // defpackage.ddix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (cqca.q("EmptyExampleIterator", 4)) {
            cqca.i("EmptyExampleIterator", "close() called");
        }
    }
}
