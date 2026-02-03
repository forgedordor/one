package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyp implements nyf {
    private final nzh a;
    private String b;
    private nox c;
    private nyo d;
    private boolean e;
    private long l;
    private final boolean[] f = new boolean[3];
    private final nyw g = new nyw(32);
    private final nyw h = new nyw(33);
    private final nyw i = new nyw(34);
    private final nyw j = new nyw(39);
    private final nyw k = new nyw(40);
    private long m = -9223372036854775807L;
    private final mfr n = new mfr();

    public nyp(nzh nzhVar) {
        this.a = nzhVar;
    }

    private final void f() {
        mee.g(this.c);
        String str = mgb.a;
    }

    private final void g(long j, int i, int i2, long j2) {
        nyo nyoVar = this.d;
        boolean z = this.e;
        if (nyoVar.i && nyoVar.f) {
            nyoVar.l = nyoVar.b;
            nyoVar.i = false;
        } else if (nyoVar.g || nyoVar.f) {
            if (z && nyoVar.h) {
                nyoVar.a(i + ((int) (j - nyoVar.a)));
            }
            nyoVar.j = nyoVar.a;
            nyoVar.k = nyoVar.d;
            nyoVar.l = nyoVar.b;
            nyoVar.h = true;
        }
        if (!this.e) {
            nyw nywVar = this.g;
            nywVar.d(i2);
            nyw nywVar2 = this.h;
            nywVar2.d(i2);
            nyw nywVar3 = this.i;
            nywVar3.d(i2);
            if (nywVar.a && nywVar2.a && nywVar3.a) {
                String str = this.b;
                int i3 = nywVar.c;
                byte[] bArr = new byte[nywVar2.c + i3 + nywVar3.c];
                System.arraycopy(nywVar.b, 0, bArr, 0, i3);
                System.arraycopy(nywVar2.b, 0, bArr, nywVar.c, nywVar2.c);
                System.arraycopy(nywVar3.b, 0, bArr, nywVar.c + nywVar2.c, nywVar3.c);
                mgs mgsVarH = mgy.h(nywVar2.b, 3, nywVar2.c, null);
                mgn mgnVar = mgsVarH.b;
                String strE = mgnVar != null ? mek.e(mgnVar.a, mgnVar.b, mgnVar.c, mgnVar.d, mgnVar.e, mgnVar.f) : null;
                mat matVar = new mat();
                matVar.a = str;
                matVar.a("video/mp2t");
                matVar.c("video/hevc");
                matVar.j = strE;
                matVar.t = mgsVarH.e;
                matVar.u = mgsVarH.f;
                matVar.v = mgsVarH.g;
                matVar.w = mgsVarH.h;
                matVar.C = new mag(mgsVarH.k, mgsVarH.l, mgsVarH.m, null, mgsVarH.c + 8, mgsVarH.d + 8);
                matVar.z = mgsVarH.i;
                matVar.o = mgsVarH.j;
                matVar.D = mgsVarH.a + 1;
                matVar.p = Collections.singletonList(bArr);
                mau mauVar = new mau(matVar);
                this.c.i(mauVar);
                int i4 = mauVar.q;
                ejwl.l(i4 != -1);
                this.a.e(i4);
                this.e = true;
            }
        }
        nyw nywVar4 = this.j;
        if (nywVar4.d(i2)) {
            int iE = mgy.e(nywVar4.b, nywVar4.c);
            mfr mfrVar = this.n;
            mfrVar.I(nywVar4.b, iE);
            mfrVar.L(5);
            this.a.b(j2, mfrVar);
        }
        nyw nywVar5 = this.k;
        if (nywVar5.d(i2)) {
            int iE2 = mgy.e(nywVar5.b, nywVar5.c);
            mfr mfrVar2 = this.n;
            mfrVar2.I(nywVar5.b, iE2);
            mfrVar2.L(5);
            this.a.b(j2, mfrVar2);
        }
    }

    private final void h(byte[] bArr, int i, int i2) {
        nyo nyoVar = this.d;
        if (nyoVar.e) {
            int i3 = nyoVar.c;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                nyoVar.f = (bArr[i4] & 128) != 0;
                nyoVar.e = false;
            } else {
                nyoVar.c = i3 + (i2 - i);
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    private final void i(long j, int i, int i2, long j2) {
        nyo nyoVar = this.d;
        boolean z = this.e;
        nyoVar.f = false;
        nyoVar.g = false;
        nyoVar.d = j2;
        nyoVar.c = 0;
        nyoVar.a = j;
        if (i2 >= 32 && i2 != 40) {
            if (nyoVar.h && !nyoVar.i) {
                if (z) {
                    nyoVar.a(i);
                }
                nyoVar.h = false;
            }
            if (i2 <= 35 || i2 == 39) {
                nyoVar.g = !nyoVar.i;
                nyoVar.i = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        nyoVar.b = z2;
        nyoVar.e = z2 || i2 <= 9;
        if (!this.e) {
            this.g.c(i2);
            this.h.c(i2);
            this.i.c(i2);
        }
        this.j.c(i2);
        this.k.c(i2);
    }

    @Override // defpackage.nyf
    public final void a(mfr mfrVar) {
        f();
        while (mfrVar.a() > 0) {
            int i = mfrVar.b;
            int i2 = mfrVar.c;
            byte[] bArr = mfrVar.a;
            this.l += mfrVar.a();
            this.c.m(mfrVar, mfrVar.a());
            while (i < i2) {
                int iC = mgy.c(bArr, i, i2, this.f);
                if (iC == i2) {
                    h(bArr, i, i2);
                    return;
                }
                int i3 = bArr[iC + 3] & 126;
                int i4 = 3;
                if (iC > 0) {
                    int i5 = iC - 1;
                    if (bArr[i5] == 0) {
                        i4 = 4;
                        iC = i5;
                    }
                }
                int i6 = iC - i;
                if (i6 > 0) {
                    h(bArr, i, iC);
                }
                int i7 = i2 - iC;
                long j = this.l - i7;
                g(j, i7, i6 < 0 ? -i6 : 0, this.m);
                i(j, i7, i3 >> 1, this.m);
                i = iC + i4;
            }
        }
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.b = nzqVar.b();
        this.c = nnuVar.p(nzqVar.a(), 2);
        this.d = new nyo(this.c);
        this.a.c(nnuVar, nzqVar);
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        f();
        if (z) {
            this.a.d();
            g(this.l, 0, 0, this.m);
            i(this.l, 0, 48, this.m);
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.m = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        mgy.j(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        this.a.a();
        nyo nyoVar = this.d;
        if (nyoVar != null) {
            nyoVar.e = false;
            nyoVar.f = false;
            nyoVar.g = false;
            nyoVar.h = false;
            nyoVar.i = false;
        }
    }
}
