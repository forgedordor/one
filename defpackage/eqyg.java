package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyg extends eqyc {
    public eqyg(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.eqyc
    public final int a() {
        return 24;
    }

    @Override // defpackage.eqyc
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        eqxz.b(iArr2, eqxz.e(this.a, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
