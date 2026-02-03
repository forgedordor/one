package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftw extends fftk implements ffwn {
    public final fftu c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile ffsr h;

    public fftw(fftv fftvVar) {
        super(true, fftvVar.a.e);
        fftu fftuVar = fftvVar.a;
        this.c = fftuVar;
        int i = fftuVar.f;
        byte[] bArr = fftvVar.d;
        if (bArr == null) {
            this.d = new byte[i];
        } else {
            if (bArr.length != i) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = fftvVar.e;
        if (bArr2 == null) {
            this.e = new byte[i];
        } else {
            if (bArr2.length != i) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fftvVar.f;
        if (bArr3 == null) {
            this.f = new byte[i];
        } else {
            if (bArr3.length != i) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = fftvVar.g;
        if (bArr4 == null) {
            this.g = new byte[i];
        } else {
            if (bArr4.length != i) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        ffsr ffsrVar = fftvVar.h;
        if (ffsrVar != null) {
            this.h = ffsrVar;
        } else {
            int i2 = fftvVar.b;
            int i3 = 1 << fftuVar.c;
            if (i2 >= i3 - 2 || bArr3 == null || bArr == null) {
                this.h = new ffsr(fftuVar, i3 - 1, i2);
            } else {
                this.h = new ffsr(fftuVar, bArr3, bArr, new fftd(new fftc()), i2);
            }
        }
        int i4 = fftvVar.c;
        if (i4 >= 0 && i4 != this.h.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrE;
        synchronized (this) {
            int i = this.c.f;
            int i2 = i + 4;
            int i3 = i2 + i;
            int i4 = i3 + i;
            byte[] bArr = new byte[i + i4];
            ffwp.e(this.h.a, bArr, 0);
            ffua.d(bArr, this.d, 4);
            ffua.d(bArr, this.e, i2);
            ffua.d(bArr, this.f, i3);
            ffua.d(bArr, this.g, i4);
            try {
                bArrE = ffwk.e(bArr, ffua.i(this.h));
            } catch (IOException e) {
                throw new RuntimeException("error serializing bds state: " + e.getMessage());
            }
        }
        return bArrE;
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = a();
        }
        return bArrA;
    }
}
