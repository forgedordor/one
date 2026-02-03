package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvq implements nox {
    public final nox a;
    public mau c;
    public boolean d;
    private final nvl e;
    private nvn i;
    private int f = 0;
    private int g = 0;
    private byte[] h = mgb.b;
    public final mfr b = new mfr();

    public nvq(nox noxVar, nvl nvlVar) {
        this.a = noxVar;
        this.e = nvlVar;
    }

    private final void a(int i) {
        int length = this.h.length;
        int i2 = this.g;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.h;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f, bArr2, 0, i3);
        this.f = 0;
        this.g = i3;
        this.h = bArr2;
    }

    @Override // defpackage.nox
    public final /* synthetic */ int e(mah mahVar, int i, boolean z) {
        return nov.a(this, mahVar, i, z);
    }

    @Override // defpackage.nox
    public final void i(mau mauVar) {
        String str = mauVar.o;
        mee.f(str);
        mee.a(mbw.b(str) == 3);
        if (!mauVar.equals(this.c)) {
            this.c = mauVar;
            nvl nvlVar = this.e;
            this.i = nvlVar.c(mauVar) ? nvlVar.b(mauVar) : null;
        }
        if (this.i == null) {
            this.a.i(mauVar);
            return;
        }
        nox noxVar = this.a;
        mat matVar = new mat(mauVar);
        matVar.c("application/x-media3-cues");
        matVar.j = str;
        matVar.r = Long.MAX_VALUE;
        matVar.K = this.e.a(mauVar);
        noxVar.i(new mau(matVar));
    }

    @Override // defpackage.nox
    public final /* synthetic */ void m(mfr mfrVar, int i) {
        nov.b(this, mfrVar, i);
    }

    @Override // defpackage.nox
    public final void n(mfr mfrVar, int i, int i2) {
        if (this.i == null) {
            this.a.n(mfrVar, i, i2);
            return;
        }
        a(i);
        mfrVar.F(this.h, this.g, i);
        this.g += i;
    }

    @Override // defpackage.nox
    public final void o(final long j, final int i, int i2, int i3, now nowVar) {
        if (this.i == null) {
            this.a.o(j, i, i2, i3, nowVar);
            return;
        }
        mee.b(nowVar == null, "DRM on subtitles is not supported");
        int i4 = (this.g - i3) - i2;
        try {
            this.i.b(this.h, i4, i2, nvm.a, new meo() { // from class: nvp
                @Override // defpackage.meo
                public final void a(Object obj) {
                    nvq nvqVar = this.a;
                    nut nutVar = (nut) obj;
                    mee.g(nvqVar.c);
                    byte[] bArrA = nus.a(nutVar.a, nutVar.c);
                    mfr mfrVar = nvqVar.b;
                    mfrVar.H(bArrA);
                    int length = bArrA.length;
                    nox noxVar = nvqVar.a;
                    noxVar.m(mfrVar, length);
                    long j2 = nutVar.b;
                    long j3 = j;
                    if (j2 == -9223372036854775807L) {
                        mee.c(nvqVar.c.t == Long.MAX_VALUE);
                    } else {
                        long j4 = nvqVar.c.t;
                        j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                    }
                    noxVar.o(j3, 1 | i, length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.d) {
                throw e;
            }
            mff.g("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f = i5;
        if (i5 == this.g) {
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.nox
    public final int w(mah mahVar, int i, boolean z) throws EOFException {
        if (this.i == null) {
            return this.a.w(mahVar, i, z);
        }
        a(i);
        int iA = mahVar.a(this.h, this.g, i);
        if (iA != -1) {
            this.g += iA;
            return iA;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.nox
    public final /* synthetic */ void v() {
    }
}
