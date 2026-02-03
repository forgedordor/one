package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fftq extends fftl implements ffwn {
    public final fftm c;
    private final int d;
    private final byte[] e;
    private final byte[] f;

    public fftq(fftp fftpVar) {
        super(false, fftpVar.a.b());
        fftm fftmVar = fftpVar.a;
        this.c = fftmVar;
        if (fftmVar == null) {
            throw new NullPointerException("params == null");
        }
        int iA = fftmVar.a();
        byte[] bArr = fftpVar.d;
        if (bArr != null) {
            int i = iA + iA;
            int length = bArr.length;
            if (length == i) {
                this.d = 0;
                this.e = ffua.h(bArr, 0, iA);
                this.f = ffua.h(bArr, iA, iA);
                return;
            } else {
                int i2 = iA + 4;
                if (length != i2 + iA) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.d = ffwp.a(bArr, 0);
                this.e = ffua.h(bArr, 4, iA);
                this.f = ffua.h(bArr, i2, iA);
                return;
            }
        }
        fftt ffttVar = fftmVar.b;
        if (ffttVar != null) {
            this.d = ((ffsu) ffttVar).b;
        } else {
            this.d = 0;
        }
        byte[] bArr2 = fftpVar.b;
        if (bArr2 == null) {
            this.e = new byte[iA];
        } else {
            if (bArr2.length != iA) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.e = bArr2;
        }
        byte[] bArr3 = fftpVar.c;
        if (bArr3 == null) {
            this.f = new byte[iA];
        } else {
            if (bArr3.length != iA) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f = bArr3;
        }
    }

    public final byte[] a() {
        return ffua.g(this.f);
    }

    public final byte[] b() {
        return ffua.g(this.e);
    }

    public final byte[] c() {
        byte[] bArr;
        int i = this.d;
        int iA = this.c.a();
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[iA + 4 + iA];
            ffwp.e(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[iA + iA];
        }
        ffua.d(bArr, this.e, i2);
        ffua.d(bArr, this.f, i2 + iA);
        return bArr;
    }

    @Override // defpackage.ffwn
    public final byte[] s() {
        return c();
    }
}
