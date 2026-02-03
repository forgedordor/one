package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffte {
    public final fftg a;
    public final ffsz b;
    public byte[] c;
    private byte[] d;

    public ffte(fftg fftgVar) {
        this.a = fftgVar;
        int i = fftgVar.a;
        this.b = new ffsz(fftgVar.c, i);
        this.d = new byte[i];
        this.c = new byte[i];
    }

    private final byte[] d(byte[] bArr, int i, fftd fftdVar) {
        int length = bArr.length;
        int i2 = this.a.a;
        if (length != i2) {
            throw new IllegalArgumentException(a.e(i2, "startHash needs to be ", "bytes"));
        }
        fftdVar.a();
        if (i > 15) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return bArr;
        }
        int i3 = i - 1;
        byte[] bArrD = d(bArr, i3, fftdVar);
        fftc fftcVar = new fftc();
        fftcVar.e = fftdVar.d;
        fftcVar.f = fftdVar.e;
        fftcVar.a = fftdVar.a;
        fftcVar.b = fftdVar.b;
        fftcVar.c = i3;
        fftcVar.g = 0;
        fftd fftdVar2 = new fftd(fftcVar);
        ffsz ffszVar = this.b;
        byte[] bArrA = ffszVar.a(this.c, fftdVar2.a());
        fftc fftcVar2 = new fftc();
        fftcVar2.e = fftdVar2.d;
        fftcVar2.f = fftdVar2.e;
        fftcVar2.a = fftdVar2.a;
        fftcVar2.b = fftdVar2.b;
        fftcVar2.c = fftdVar2.c;
        fftcVar2.g = 1;
        byte[] bArrA2 = ffszVar.a(this.c, new fftd(fftcVar2).a());
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) (bArrD[i4] ^ bArrA2[i4]);
        }
        int length2 = bArrA.length;
        int i5 = ffszVar.a;
        if (length2 != i5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i2 == i5) {
            return ffszVar.b(0, bArrA, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    final ffth a(fftd fftdVar) {
        fftg fftgVar = this.a;
        int i = fftgVar.b;
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            fftc fftcVar = new fftc();
            fftcVar.e = fftdVar.d;
            fftcVar.f = fftdVar.e;
            fftcVar.a = fftdVar.a;
            fftcVar.b = i2;
            fftcVar.c = fftdVar.c;
            fftcVar.g = fftdVar.f;
            fftdVar = new fftd(fftcVar);
            if (i2 >= i) {
                throw new IllegalArgumentException("index out of bounds");
            }
            bArr[i2] = d(this.b.a(this.d, ffua.j(i2, 32)), 15, fftdVar);
        }
        return new ffth(fftgVar, bArr);
    }

    final void b(byte[] bArr, byte[] bArr2) {
        fftg fftgVar = this.a;
        int length = bArr.length;
        int i = fftgVar.a;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2.length != i) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.d = bArr;
        this.c = bArr2;
    }

    protected final byte[] c(byte[] bArr, fftd fftdVar) {
        fftc fftcVar = new fftc();
        fftcVar.e = fftdVar.d;
        fftcVar.f = fftdVar.e;
        fftcVar.a = fftdVar.a;
        return this.b.a(bArr, new fftd(fftcVar).a());
    }
}
