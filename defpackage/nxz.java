package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxz implements nyf {
    public long a;
    private final mfq b;
    private final mfr c;
    private final String d;
    private final int e;
    private final String f;
    private String g;
    private nox h;
    private int i;
    private int j;
    private boolean k;
    private long l;
    private mau m;
    private int n;

    public nxz(String str, int i, String str2) {
        mfq mfqVar = new mfq(new byte[16]);
        this.b = mfqVar;
        this.c = new mfr(mfqVar.a);
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) {
        mee.g(this.h);
        while (mfrVar.a() > 0) {
            int i = this.i;
            if (i == 0) {
                while (mfrVar.a() > 0) {
                    if (this.k) {
                        int iJ = mfrVar.j();
                        this.k = iJ == 172;
                        if (iJ != 64) {
                            if (iJ == 65) {
                                iJ = 65;
                            }
                        }
                        this.i = 1;
                        byte[] bArr = this.c.a;
                        bArr[0] = -84;
                        bArr[1] = iJ == 65 ? (byte) 65 : (byte) 64;
                        this.j = 2;
                    } else {
                        this.k = mfrVar.j() == 172;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(mfrVar.a(), this.n - this.j);
                this.h.m(mfrVar, iMin);
                int i2 = this.j + iMin;
                this.j = i2;
                if (i2 == this.n) {
                    mee.c(this.a != -9223372036854775807L);
                    this.h.o(this.a, 1, this.n, 0, null);
                    this.a += this.l;
                    this.i = 0;
                }
            } else {
                mfr mfrVar2 = this.c;
                byte[] bArr2 = mfrVar2.a;
                int iMin2 = Math.min(mfrVar.a(), 16 - this.j);
                mfrVar.F(bArr2, this.j, iMin2);
                int i3 = this.j + iMin2;
                this.j = i3;
                if (i3 == 16) {
                    mfq mfqVar = this.b;
                    mfqVar.l(0);
                    nmv nmvVarA = nmw.a(mfqVar);
                    mau mauVar = this.m;
                    if (mauVar == null || mauVar.G != 2 || nmvVarA.a != mauVar.H || !"audio/ac4".equals(mauVar.o)) {
                        mat matVar = new mat();
                        matVar.a = this.g;
                        matVar.a(this.f);
                        matVar.c("audio/ac4");
                        matVar.E = 2;
                        matVar.F = nmvVarA.a;
                        matVar.d = this.d;
                        matVar.f = this.e;
                        mau mauVar2 = new mau(matVar);
                        this.m = mauVar2;
                        this.h.i(mauVar2);
                    }
                    this.n = nmvVarA.b;
                    this.l = (nmvVarA.c * 1000000) / this.m.H;
                    mfrVar2.K(0);
                    this.h.m(mfrVar2, 16);
                    this.i = 2;
                }
            }
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.g = nzqVar.b();
        this.h = nnuVar.p(nzqVar.a(), 1);
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
