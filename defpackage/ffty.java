package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffty extends fftk implements ffwn {
    public final fftu c;
    public final byte[] d;
    public final byte[] e;
    private final int f;

    public ffty(fftx fftxVar) {
        super(false, fftxVar.a.e);
        fftu fftuVar = fftxVar.a;
        this.c = fftuVar;
        if (fftuVar == null) {
            throw new NullPointerException("params == null");
        }
        int i = fftuVar.f;
        byte[] bArr = fftxVar.d;
        if (bArr != null) {
            int i2 = i + i;
            int length = bArr.length;
            if (length == i2) {
                this.f = 0;
                this.d = ffua.h(bArr, 0, i);
                this.e = ffua.h(bArr, i, i);
                return;
            } else {
                int i3 = i + 4;
                if (length != i3 + i) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f = ffwp.a(bArr, 0);
                this.d = ffua.h(bArr, 4, i);
                this.e = ffua.h(bArr, i3, i);
                return;
            }
        }
        fftt ffttVar = fftuVar.b;
        if (ffttVar != null) {
            this.f = ((ffsv) ffttVar).b;
        } else {
            this.f = 0;
        }
        byte[] bArr2 = fftxVar.b;
        if (bArr2 == null) {
            this.d = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.d = bArr2;
        }
        byte[] bArr3 = fftxVar.c;
        if (bArr3 == null) {
            this.e = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.e = bArr3;
        }
    }

    public final byte[] a() {
        byte[] bArr;
        int i = this.c.f;
        int i2 = this.f;
        int i3 = 0;
        if (i2 != 0) {
            bArr = new byte[i + 4 + i];
            ffwp.e(i2, bArr, 0);
            i3 = 4;
        } else {
            bArr = new byte[i + i];
        }
        ffua.d(bArr, this.d, i3);
        ffua.d(bArr, this.e, i3 + i);
        return bArr;
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        return a();
    }
}
