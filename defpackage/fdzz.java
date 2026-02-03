package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzz extends feab {
    public static final fdzz a = new fdzz();

    private fdzz() {
        super(feae.c, feae.d, feae.e, feae.a);
    }

    @Override // defpackage.feab, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        fdys.a(1);
        return feae.c <= 1 ? this : super.i(1);
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return "Dispatchers.Default";
    }
}
