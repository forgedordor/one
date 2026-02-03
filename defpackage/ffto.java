package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffto extends fftl implements ffwn {
    public final fftm c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final byte[] g;
    private volatile long h;
    private volatile ffss i;

    public ffto(fftn fftnVar) {
        super(true, fftnVar.a.b());
        fftm fftmVar = fftnVar.a;
        this.c = fftmVar;
        int iA = fftmVar.a();
        this.h = fftnVar.b;
        byte[] bArr = fftnVar.d;
        if (bArr == null) {
            this.d = new byte[iA];
        } else {
            if (bArr.length != iA) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.d = bArr;
        }
        byte[] bArr2 = fftnVar.e;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fftnVar.f;
        if (bArr3 == null) {
            this.f = new byte[iA];
        } else {
            if (bArr3.length != iA) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f = bArr3;
        }
        byte[] bArr4 = fftnVar.g;
        if (bArr4 == null) {
            this.g = new byte[iA];
        } else {
            if (bArr4.length != iA) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.g = bArr4;
        }
        ffss ffssVar = fftnVar.h;
        if (ffssVar != null) {
            this.i = ffssVar;
        } else {
            if (!ffua.f(fftmVar.d, fftnVar.b) || bArr3 == null || bArr == null) {
                this.i = new ffss(fftnVar.c + 1);
            } else {
                this.i = new ffss(fftmVar, fftnVar.b, bArr3, bArr);
            }
        }
        long j = fftnVar.c;
        if (j >= 0 && j != this.i.b) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final byte[] a() {
        byte[] bArrE;
        synchronized (this) {
            fftm fftmVar = this.c;
            int iA = fftmVar.a();
            int i = (fftmVar.d + 7) / 8;
            int i2 = i + iA;
            int i3 = i2 + iA;
            int i4 = i3 + iA;
            byte[] bArr = new byte[iA + i4];
            ffua.d(bArr, ffua.j(this.h, i), 0);
            ffua.d(bArr, this.d, i);
            ffua.d(bArr, this.e, i2);
            ffua.d(bArr, this.f, i3);
            ffua.d(bArr, this.g, i4);
            try {
                bArrE = ffwk.e(bArr, ffua.i(this.i));
            } catch (IOException e) {
                throw new IllegalStateException("error serializing bds state: " + e.getMessage(), e);
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
