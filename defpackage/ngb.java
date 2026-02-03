package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngb implements nox {
    private boolean B;
    public final nfw a;
    public nga c;
    public nad d;
    public int e;
    public int f;
    private final nap i;
    private final nak j;
    private mau k;
    private int s;
    private int t;
    private boolean w;
    private mau z;
    public final nfy b = new nfy();
    private int l = 1000;
    private long[] m = new long[1000];
    private long[] n = new long[1000];
    private long[] q = new long[1000];
    private int[] p = new int[1000];
    private int[] o = new int[1000];
    private now[] r = new now[1000];
    private final ngj h = new ngj(new meo() { // from class: nfx
        @Override // defpackage.meo
        public final void a(Object obj) {
            ((nfz) obj).b.a();
        }
    });
    public long g = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    private long v = Long.MIN_VALUE;
    private boolean y = true;
    private boolean x = true;
    private boolean A = true;

    protected ngb(niu niuVar, nap napVar, nak nakVar) {
        this.i = napVar;
        this.j = nakVar;
        this.a = new nfw(niuVar);
    }

    private final long A(int i) {
        long j = this.u;
        long jMax = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int iY = y(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.q[iY]);
                if ((this.p[iY] & 1) != 0) {
                    break;
                }
                iY--;
                if (iY == -1) {
                    iY = this.l - 1;
                }
            }
        }
        this.u = Math.max(j, jMax);
        this.s -= i;
        int i4 = this.e + i;
        this.e = i4;
        int i5 = this.t + i;
        this.t = i5;
        int i6 = this.l;
        if (i5 >= i6) {
            this.t = i5 - i6;
        }
        int i7 = this.f - i;
        this.f = i7;
        if (i7 < 0) {
            this.f = 0;
        }
        ngj ngjVar = this.h;
        while (true) {
            SparseArray sparseArray = ngjVar.b;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ngjVar.c.a(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = ngjVar.a;
            if (i9 > 0) {
                ngjVar.a = i9 - 1;
            }
            i2 = i8;
        }
        if (this.s != 0) {
            return this.n[this.t];
        }
        int i10 = this.t;
        if (i10 == 0) {
            i10 = this.l;
        }
        return this.n[i10 - 1] + this.o[r12];
    }

    private final synchronized void B(long j, int i, long j2, int i2, now nowVar) {
        int i3 = this.s;
        if (i3 > 0) {
            int iY = y(i3 - 1);
            mee.a(this.n[iY] + ((long) this.o[iY]) <= j2);
        }
        this.w = (536870912 & i) != 0;
        this.v = Math.max(this.v, j);
        int iY2 = y(this.s);
        this.q[iY2] = j;
        this.n[iY2] = j2;
        this.o[iY2] = i2;
        this.p[iY2] = i;
        this.r[iY2] = nowVar;
        this.m[iY2] = 0;
        ngj ngjVar = this.h;
        if (ngjVar.c() || !((nfz) ngjVar.b()).a.equals(this.z)) {
            mau mauVar = this.z;
            mee.f(mauVar);
            nao naoVarD = this.i.d(this.j, mauVar);
            int iC = c();
            nfz nfzVar = new nfz(mauVar, naoVarD);
            if (ngjVar.a == -1) {
                mee.c(ngjVar.b.size() == 0);
                ngjVar.a = 0;
            }
            SparseArray sparseArray = ngjVar.b;
            if (sparseArray.size() > 0) {
                int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                mee.a(iC >= iKeyAt);
                if (iKeyAt == iC) {
                    ngjVar.c.a(sparseArray.valueAt(sparseArray.size() - 1));
                }
            }
            sparseArray.append(iC, nfzVar);
        }
        int i4 = this.s + 1;
        this.s = i4;
        int i5 = this.l;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            now[] nowVarArr = new now[i6];
            int i7 = this.t;
            int i8 = i5 - i7;
            System.arraycopy(this.n, i7, jArr2, 0, i8);
            System.arraycopy(this.q, this.t, jArr3, 0, i8);
            System.arraycopy(this.p, this.t, iArr, 0, i8);
            System.arraycopy(this.o, this.t, iArr2, 0, i8);
            System.arraycopy(this.r, this.t, nowVarArr, 0, i8);
            System.arraycopy(this.m, this.t, jArr, 0, i8);
            int i9 = this.t;
            System.arraycopy(this.n, 0, jArr2, i8, i9);
            System.arraycopy(this.q, 0, jArr3, i8, i9);
            System.arraycopy(this.p, 0, iArr, i8, i9);
            System.arraycopy(this.o, 0, iArr2, i8, i9);
            System.arraycopy(this.r, 0, nowVarArr, i8, i9);
            System.arraycopy(this.m, 0, jArr, i8, i9);
            this.n = jArr2;
            this.q = jArr3;
            this.p = iArr;
            this.o = iArr2;
            this.r = nowVarArr;
            this.m = jArr;
            this.t = 0;
            this.l = i6;
        }
    }

    private final void C(mau mauVar, msa msaVar) {
        mau mauVar2 = this.k;
        mao maoVar = mauVar2 == null ? null : mauVar2.s;
        this.k = mauVar;
        mao maoVar2 = mauVar.s;
        nap napVar = this.i;
        msaVar.b = mauVar.b(napVar.a(mauVar));
        msaVar.a = this.d;
        if (mauVar2 == null || !Objects.equals(maoVar, maoVar2)) {
            nad nadVar = this.d;
            nak nakVar = this.j;
            nad nadVarB = napVar.b(nakVar, mauVar);
            this.d = nadVarB;
            msaVar.a = nadVarB;
            if (nadVar != null) {
                nadVar.j(nakVar);
            }
        }
    }

    private final synchronized void D() {
        this.f = 0;
        nfw nfwVar = this.a;
        nfwVar.c = nfwVar.b;
    }

    private final boolean E() {
        return this.f != this.s;
    }

    private final boolean F(int i) {
        nad nadVar = this.d;
        if (nadVar == null || nadVar.a() == 4) {
            return true;
        }
        return (this.p[i] & 1073741824) == 0 && this.d.n();
    }

    private final synchronized boolean G(mau mauVar) {
        this.y = false;
        if (Objects.equals(mauVar, this.z)) {
            return false;
        }
        ngj ngjVar = this.h;
        if (ngjVar.c() || !((nfz) ngjVar.b()).a.equals(mauVar)) {
            this.z = mauVar;
        } else {
            this.z = ((nfz) ngjVar.b()).a;
        }
        boolean z = this.A;
        mau mauVar2 = this.z;
        this.A = z & mbw.g(mauVar2.o, mauVar2.k);
        this.B = false;
        return true;
    }

    private final int x(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.q[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.p[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.l) {
                i = 0;
            }
        }
        return i3;
    }

    private final int y(int i) {
        int i2 = this.t + i;
        int i3 = this.l;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private final synchronized long z() {
        int i = this.s;
        if (i == 0) {
            return -1L;
        }
        return A(i);
    }

    public final int a() {
        return this.e + this.f;
    }

    public final synchronized int b(long j, boolean z) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.f;
                int iY = y(i);
                if (E() && j >= this.q[iY]) {
                    if (j <= this.v || !z) {
                        int iX = x(iY, this.s - i, j, true);
                        if (iX == -1) {
                            return 0;
                        }
                        return iX;
                    }
                    try {
                        return this.s - i;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final int c() {
        return this.e + this.s;
    }

    public final synchronized int d(msa msaVar, mix mixVar, boolean z, boolean z2, nfy nfyVar) {
        mixVar.e = false;
        if (!E()) {
            if (!z2 && !this.w) {
                mau mauVar = this.z;
                if (mauVar == null || (!z && mauVar == this.k)) {
                    return -3;
                }
                C(mauVar, msaVar);
                return -5;
            }
            mixVar.a = 4;
            mixVar.f = Long.MIN_VALUE;
            return -4;
        }
        mau mauVar2 = ((nfz) this.h.a(a())).a;
        if (!z && mauVar2 == this.k) {
            int iY = y(this.f);
            if (!F(iY)) {
                mixVar.e = true;
                return -3;
            }
            mixVar.a = this.p[iY];
            if (this.f == this.s - 1 && (z2 || this.w)) {
                mixVar.eQ(536870912);
            }
            mixVar.f = this.q[iY];
            nfyVar.a = this.o[iY];
            nfyVar.b = this.n[iY];
            nfyVar.c = this.r[iY];
            return -4;
        }
        C(mauVar2, msaVar);
        return -5;
    }

    @Override // defpackage.nox
    public final /* synthetic */ int e(mah mahVar, int i, boolean z) {
        return nov.a(this, mahVar, i, z);
    }

    public final synchronized long f() {
        return this.v;
    }

    public final synchronized mau g() {
        if (this.y) {
            return null;
        }
        return this.z;
    }

    public final void h() {
        this.a.c(z());
    }

    @Override // defpackage.nox
    public final void i(mau mauVar) {
        boolean zG = G(mauVar);
        nga ngaVar = this.c;
        if (ngaVar == null || !zG) {
            return;
        }
        nfq nfqVar = (nfq) ngaVar;
        nfqVar.j.post(nfqVar.h);
    }

    public final void j() {
        nad nadVar = this.d;
        if (nadVar != null) {
            nadVar.j(this.j);
            this.d = null;
            this.k = null;
        }
    }

    public final void k() {
        l(false);
    }

    public final void l(boolean z) {
        SparseArray sparseArray;
        nfw nfwVar = this.a;
        nfv nfvVar = nfwVar.b;
        if (nfvVar.c != null) {
            nfwVar.f.g(nfvVar);
            nfvVar.b();
        }
        nfwVar.b.c(0L);
        nfv nfvVar2 = nfwVar.b;
        nfwVar.c = nfvVar2;
        nfwVar.d = nfvVar2;
        nfwVar.e = 0L;
        nfwVar.f.f();
        int i = 0;
        this.s = 0;
        this.e = 0;
        this.t = 0;
        this.f = 0;
        this.x = true;
        this.g = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        ngj ngjVar = this.h;
        while (true) {
            sparseArray = ngjVar.b;
            if (i >= sparseArray.size()) {
                break;
            }
            ngjVar.c.a(sparseArray.valueAt(i));
            i++;
        }
        ngjVar.a = -1;
        sparseArray.clear();
        if (z) {
            this.z = null;
            this.y = true;
            this.A = true;
        }
    }

    @Override // defpackage.nox
    public final /* synthetic */ void m(mfr mfrVar, int i) {
        nov.b(this, mfrVar, i);
    }

    @Override // defpackage.nox
    public final void n(mfr mfrVar, int i, int i2) {
        while (i > 0) {
            nfw nfwVar = this.a;
            int iA = nfwVar.a(i);
            nfv nfvVar = nfwVar.d;
            mfrVar.F(nfvVar.c.a, nfvVar.a(nfwVar.e), iA);
            i -= iA;
            nfwVar.d(iA);
        }
    }

    @Override // defpackage.nox
    public final void o(long j, int i, int i2, int i3, now nowVar) {
        if (this.x) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.x = false;
            }
        }
        if (this.A) {
            if (j < this.g) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.B) {
                    mff.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(String.valueOf(this.z))));
                    this.B = true;
                }
                i |= 1;
            }
        }
        B(j, i, (this.a.e - i2) - i3, i2, nowVar);
    }

    public final synchronized void p(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f + i <= this.s) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mee.a(z);
        this.f += i;
    }

    public final synchronized boolean q() {
        return this.w;
    }

    public final synchronized boolean r(boolean z) {
        boolean z2 = true;
        if (E()) {
            if (((nfz) this.h.a(a())).a != this.k) {
                return true;
            }
            return F(y(this.f));
        }
        if (!z && !this.w) {
            mau mauVar = this.z;
            if (mauVar == null) {
                z2 = false;
            } else if (mauVar == this.k) {
                return false;
            }
        }
        return z2;
    }

    public final synchronized boolean s(int i) {
        D();
        int i2 = this.e;
        if (i >= i2 && i <= this.s + i2) {
            this.g = Long.MIN_VALUE;
            this.f = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean t(long j, boolean z) throws Throwable {
        Throwable th;
        ngb ngbVar;
        long j2;
        int iX;
        try {
            try {
                D();
                int i = this.f;
                int iY = y(i);
                if (E() && j >= this.q[iY]) {
                    if (j > this.v) {
                        if (z) {
                            z = true;
                        }
                    }
                    if (this.A) {
                        try {
                            int i2 = this.s - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    if (this.q[iY] >= j) {
                                        ngbVar = this;
                                        j2 = j;
                                        iX = i3;
                                        break;
                                    }
                                    iY++;
                                    if (iY == this.l) {
                                        iY = 0;
                                    }
                                    i3++;
                                } else if (z) {
                                    j2 = j;
                                    iX = i2;
                                    ngbVar = this;
                                } else {
                                    ngbVar = this;
                                    j2 = j;
                                    iX = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        ngbVar = this;
                        j2 = j;
                        iX = ngbVar.x(iY, this.s - i, j2, true);
                    }
                    if (iX != -1) {
                        ngbVar.g = j2;
                        ngbVar.f += iX;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long u(long r9, boolean r11) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.s     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L2e
            long[] r1 = r8.q     // Catch: java.lang.Throwable -> L33
            int r3 = r8.t     // Catch: java.lang.Throwable -> L33
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L33
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L10
            goto L2e
        L10:
            if (r11 == 0) goto L1d
            int r11 = r8.f     // Catch: java.lang.Throwable -> L19
            if (r11 == r0) goto L1d
            int r0 = r11 + 1
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L36
        L1d:
            r4 = r0
            r7 = 0
            r2 = r8
            r5 = r9
            int r9 = r2.x(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L38
            r10 = -1
            if (r9 == r10) goto L2f
            long r9 = r8.A(r9)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r8)
            return r9
        L2e:
            r2 = r8
        L2f:
            monitor-exit(r8)
            r9 = -1
            return r9
        L33:
            r0 = move-exception
            r2 = r8
        L35:
            r9 = r0
        L36:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
            throw r9
        L38:
            r0 = move-exception
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ngb.u(long, boolean):long");
    }

    @Override // defpackage.nox
    public final int w(mah mahVar, int i, boolean z) throws EOFException {
        nfw nfwVar = this.a;
        int iA = nfwVar.a(i);
        nfv nfvVar = nfwVar.d;
        int iA2 = mahVar.a(nfvVar.c.a, nfvVar.a(nfwVar.e), iA);
        if (iA2 != -1) {
            nfwVar.d(iA2);
            return iA2;
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
