package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyn implements nyf {
    private final nzh a;
    private long f;
    private String h;
    private nox i;
    private nym j;
    private boolean k;
    private boolean m;
    private final String b = "video/mp2t";
    private final boolean[] g = new boolean[3];
    private final nyw c = new nyw(7);
    private final nyw d = new nyw(8);
    private final nyw e = new nyw(6);
    private long l = -9223372036854775807L;
    private final mfr n = new mfr();

    public nyn(nzh nzhVar) {
        this.a = nzhVar;
    }

    private final void f() {
        mee.g(this.i);
        String str = mgb.a;
    }

    private final void g(long j, int i, int i2, long j2) {
        boolean z = true;
        if (this.k) {
            boolean z2 = this.j.c;
        } else {
            nyw nywVar = this.c;
            nywVar.d(i2);
            nyw nywVar2 = this.d;
            nywVar2.d(i2);
            if (this.k) {
                if (nywVar.a) {
                    mgx mgxVarI = mgy.i(nywVar.b, 3, nywVar.c);
                    this.a.e(mgxVarI.m);
                    this.j.b(mgxVarI);
                    nywVar.b();
                } else if (nywVar2.a) {
                    this.j.a(mgy.l(nywVar2.b, nywVar2.c));
                    nywVar2.b();
                }
            } else if (nywVar.a && nywVar2.a) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(nywVar.b, nywVar.c));
                arrayList.add(Arrays.copyOf(nywVar2.b, nywVar2.c));
                mgx mgxVarI2 = mgy.i(nywVar.b, 3, nywVar.c);
                mgw mgwVarL = mgy.l(nywVar2.b, nywVar2.c);
                String strD = mek.d(mgxVarI2.a, mgxVarI2.b, mgxVarI2.c);
                nox noxVar = this.i;
                mat matVar = new mat();
                matVar.a = this.h;
                matVar.a(this.b);
                matVar.c("video/avc");
                matVar.j = strD;
                matVar.t = mgxVarI2.e;
                matVar.u = mgxVarI2.f;
                matVar.C = new mag(mgxVarI2.j, mgxVarI2.k, mgxVarI2.l, null, mgxVarI2.h + 8, mgxVarI2.i + 8);
                matVar.z = mgxVarI2.g;
                matVar.p = arrayList;
                int i3 = mgxVarI2.m;
                matVar.o = i3;
                noxVar.i(new mau(matVar));
                this.k = true;
                this.a.e(i3);
                this.j.b(mgxVarI2);
                this.j.a(mgwVarL);
                nywVar.b();
                nywVar2.b();
            }
        }
        nyw nywVar3 = this.e;
        if (nywVar3.d(i2)) {
            int iE = mgy.e(nywVar3.b, nywVar3.c);
            mfr mfrVar = this.n;
            mfrVar.I(nywVar3.b, iE);
            mfrVar.K(4);
            this.a.b(j2, mfrVar);
        }
        nym nymVar = this.j;
        boolean z3 = this.k;
        if (nymVar.e == 9) {
            if (z3 && nymVar.j) {
                long j3 = nymVar.f;
                int i4 = i + ((int) (j - j3));
                long j4 = nymVar.l;
                if (j4 != -9223372036854775807L) {
                    long j5 = nymVar.k;
                    if (j3 != j5) {
                        nymVar.a.o(j4, nymVar.m ? 1 : 0, (int) (j3 - j5), i4, null);
                    }
                }
            }
            nymVar.k = nymVar.f;
            nymVar.l = nymVar.h;
            nymVar.m = false;
            nymVar.j = true;
        }
        boolean z4 = nymVar.n;
        boolean z5 = nymVar.m;
        int i5 = nymVar.e;
        if (i5 != 5 && (!z4 || i5 != 1)) {
            z = false;
        }
        boolean z6 = z5 | z;
        nymVar.m = z6;
        nymVar.e = 24;
        if (z6) {
            this.m = false;
        }
    }

    private final void h(byte[] bArr, int i, int i2) {
        if (this.k) {
            boolean z = this.j.c;
        } else {
            this.c.a(bArr, i, i2);
            this.d.a(bArr, i, i2);
        }
        this.e.a(bArr, i, i2);
        boolean z2 = this.j.g;
    }

    private final void i(long j, int i, long j2) {
        if (this.k) {
            boolean z = this.j.c;
        } else {
            this.c.c(i);
            this.d.c(i);
        }
        this.e.c(i);
        nym nymVar = this.j;
        boolean z2 = this.m;
        nymVar.e = i;
        nymVar.h = j2;
        nymVar.f = j;
        nymVar.n = z2;
        boolean z3 = nymVar.b;
        boolean z4 = nymVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r15) {
        /*
            r14 = this;
            r14.f()
            int r2 = r15.b
            int r7 = r15.c
            byte[] r8 = r15.a
            long r3 = r14.f
            int r5 = r15.a()
            long r5 = (long) r5
            long r3 = r3 + r5
            r14.f = r3
            nox r3 = r14.i
            int r4 = r15.a()
            r3.m(r15, r4)
        L1c:
            boolean[] r1 = r14.g
            int r1 = defpackage.mgy.c(r8, r2, r7, r1)
            if (r1 == r7) goto L5d
            int r3 = r1 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r1 <= 0) goto L37
            int r4 = r1 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L37
            r3 = 4
            r11 = r3
            r10 = r4
            goto L39
        L37:
            r10 = r1
            r11 = r3
        L39:
            int r1 = r10 - r2
            if (r1 <= 0) goto L40
            r14.h(r8, r2, r10)
        L40:
            int r3 = r7 - r10
            long r4 = r14.f
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r1 >= 0) goto L4a
            int r1 = -r1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            r12 = r4
            long r5 = r14.l
            r0 = r14
            r4 = r1
            r1 = r12
            r0.g(r1, r3, r4, r5)
            long r4 = r14.l
            r3 = r9
            r0.i(r1, r3, r4)
            int r2 = r10 + r11
            goto L1c
        L5d:
            r14.h(r8, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyn.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.h = nzqVar.b();
        this.i = nnuVar.p(nzqVar.a(), 2);
        this.j = new nym(this.i);
        this.a.c(nnuVar, nzqVar);
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        f();
        if (z) {
            this.a.d();
            g(this.f, 0, 0, this.l);
            i(this.f, 9, this.l);
            g(this.f, 0, 0, this.l);
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.l = j;
        int i2 = i & 2;
        this.m = (i2 != 0) | this.m;
    }

    @Override // defpackage.nyf
    public final void e() {
        this.f = 0L;
        this.m = false;
        this.l = -9223372036854775807L;
        mgy.j(this.g);
        this.c.b();
        this.d.b();
        this.e.b();
        this.a.a();
        nym nymVar = this.j;
        if (nymVar != null) {
            nymVar.c();
        }
    }
}
