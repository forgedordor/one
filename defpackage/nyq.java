package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyq implements nyf {
    private nox c;
    private boolean d;
    private int f;
    private int g;
    private final String a = "video/mp2t";
    private final mfr b = new mfr(10);
    private long e = -9223372036854775807L;

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) {
        mee.g(this.c);
        if (this.d) {
            int iA = mfrVar.a();
            int i = this.g;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = mfrVar.a;
                int i2 = mfrVar.b;
                mfr mfrVar2 = this.b;
                System.arraycopy(bArr, i2, mfrVar2.a, this.g, iMin);
                if (this.g + iMin == 10) {
                    mfrVar2.K(0);
                    if (mfrVar2.j() != 73 || mfrVar2.j() != 68 || mfrVar2.j() != 51) {
                        mff.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        mfrVar2.L(3);
                        this.f = mfrVar2.i() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f - this.g);
            this.c.m(mfrVar, iMin2);
            this.g += iMin2;
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        nox noxVarP = nnuVar.p(nzqVar.a(), 5);
        this.c = noxVarP;
        mat matVar = new mat();
        matVar.a = nzqVar.b();
        matVar.a(this.a);
        matVar.c("application/id3");
        noxVarP.i(new mau(matVar));
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        int i;
        mee.g(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            mee.c(this.e != -9223372036854775807L);
            this.c.o(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = j;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.d = false;
        this.e = -9223372036854775807L;
    }
}
