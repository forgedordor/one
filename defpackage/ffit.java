package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffit extends ffip {
    public ffit() {
        super(256);
    }

    @Override // defpackage.ffip, defpackage.ffil
    public final int a(byte[] bArr, int i) {
        h(2, 2);
        return super.a(bArr, i);
    }

    @Override // defpackage.ffip, defpackage.ffil
    public final String c() {
        return "SHA3-" + this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffit(int i) {
        super(i);
        if (i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException(a.e(i, "'bitLength' ", " not supported for SHA-3"));
        }
    }
}
