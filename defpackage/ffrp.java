package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrp extends ffrj {
    private final ffrg c;

    public ffrp(ffrn ffrnVar, byte[] bArr) {
        super(false, ffrnVar);
        int iA = ffrnVar.a();
        int i = iA + iA;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.c = new ffrg(ffwk.g(bArr, 0, iA), ffwk.g(bArr, iA, i));
    }

    public final byte[] a() {
        ffrg ffrgVar = this.c;
        return ffwk.e(ffrgVar.a, ffrgVar.b);
    }
}
