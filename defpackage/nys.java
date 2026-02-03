package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nys implements nyf {
    private final mfr a;
    private final noj b;
    private final String c;
    private final int d;
    private final String e;
    private nox f;
    private String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public nys(String str, int i, String str2) {
        mfr mfrVar = new mfr(4);
        this.a = mfrVar;
        mfrVar.a[0] = -1;
        this.b = new noj();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) {
        mee.g(this.f);
        while (mfrVar.a() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = mfrVar.a;
                int i2 = mfrVar.b;
                int i3 = mfrVar.c;
                while (true) {
                    if (i2 >= i3) {
                        mfrVar.K(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        mfrVar.K(i4);
                        this.k = false;
                        this.a.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int iMin = Math.min(mfrVar.a(), this.m - this.i);
                this.f.m(mfrVar, iMin);
                int i5 = this.i + iMin;
                this.i = i5;
                if (i5 >= this.m) {
                    mee.c(this.n != -9223372036854775807L);
                    this.f.o(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int iMin2 = Math.min(mfrVar.a(), 4 - this.i);
                mfr mfrVar2 = this.a;
                mfrVar.F(mfrVar2.a, this.i, iMin2);
                int i6 = this.i + iMin2;
                this.i = i6;
                if (i6 >= 4) {
                    mfrVar2.K(0);
                    noj nojVar = this.b;
                    if (nojVar.a(mfrVar2.e())) {
                        this.m = nojVar.c;
                        if (!this.j) {
                            this.l = (nojVar.g * 1000000) / nojVar.d;
                            mat matVar = new mat();
                            matVar.a = this.g;
                            matVar.a(this.e);
                            matVar.c(nojVar.b);
                            matVar.n = 4096;
                            matVar.E = nojVar.e;
                            matVar.F = nojVar.d;
                            matVar.d = this.c;
                            matVar.f = this.d;
                            this.f.i(new mau(matVar));
                            this.j = true;
                        }
                        mfrVar2.K(0);
                        this.f.m(mfrVar2, 4);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.g = nzqVar.b();
        this.f = nnuVar.p(nzqVar.a(), 1);
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
