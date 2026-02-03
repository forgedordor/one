package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fif implements fii {
    public final long a;
    private final fdae b;
    private final fdae c;
    private jyi e;
    private final Object d = this;
    private int f = -1;

    public fif(long j, fdae fdaeVar, fdae fdaeVar2) {
        this.a = j;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }

    private final int n(jyi jyiVar) {
        int i;
        int iF;
        synchronized (this.d) {
            if (this.e != jyiVar) {
                if (!jyiVar.q() || jyiVar.b.c) {
                    iF = jyiVar.f() - 1;
                } else {
                    float f = (int) (jyiVar.c & 4294967295L);
                    int iG = fddu.g(jyiVar.i(f), jyiVar.f() - 1);
                    while (iG >= 0 && jyiVar.e(iG) >= f) {
                        iG--;
                    }
                    iF = fddu.f(iG, 0);
                }
                this.f = jyiVar.g(iF, true);
                this.e = jyiVar;
            }
            i = this.f;
        }
        return i;
    }

    @Override // defpackage.fii
    public final float a(int i) {
        jyi jyiVar;
        int iH;
        Object objInvoke = this.c.invoke();
        if (objInvoke == null || (iH = (jyiVar = (jyi) objInvoke).h(i)) >= jyiVar.f()) {
            return -1.0f;
        }
        float fE = jyiVar.e(iH);
        return ((jyiVar.b(iH) - fE) / 2.0f) + fE;
    }

    @Override // defpackage.fii
    public final float b(int i) {
        Object objInvoke = this.c.invoke();
        if (objInvoke != null) {
            return fcz.a((jyi) objInvoke, i);
        }
        return 0.0f;
    }

    @Override // defpackage.fii
    public final float c(int i) {
        jyi jyiVar;
        int iH;
        Object objInvoke = this.c.invoke();
        if (objInvoke != null && (iH = (jyiVar = (jyi) objInvoke).h(i)) < jyiVar.f()) {
            return jyiVar.c(iH);
        }
        return -1.0f;
    }

    @Override // defpackage.fii
    public final float d(int i) {
        jyi jyiVar;
        int iH;
        Object objInvoke = this.c.invoke();
        if (objInvoke != null && (iH = (jyiVar = (jyi) objInvoke).h(i)) < jyiVar.f()) {
            return jyiVar.d(iH);
        }
        return -1.0f;
    }

    @Override // defpackage.fii
    public final int e() {
        Object objInvoke = this.c.invoke();
        if (objInvoke == null) {
            return 0;
        }
        return n((jyi) objInvoke);
    }

    @Override // defpackage.fii
    public final long f(fil filVar, boolean z) {
        Object objInvoke;
        if (z) {
            if (filVar.a.b != this.a) {
                return 9205357640488583168L;
            }
        }
        if (!z) {
            if (filVar.b.b != this.a) {
                return 9205357640488583168L;
            }
        }
        if (k() == null || (objInvoke = this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        jyi jyiVar = (jyi) objInvoke;
        return fns.a(jyiVar, fddu.i(z ? filVar.a.a : filVar.b.a, 0, n(jyiVar)), z, filVar.c);
    }

    @Override // defpackage.fii
    public final long g(int i) {
        Object objInvoke = this.c.invoke();
        if (objInvoke == null) {
            return jyo.a;
        }
        jyi jyiVar = (jyi) objInvoke;
        int iN = n(jyiVar);
        if (iN <= 0) {
            return jyo.a;
        }
        int iH = jyiVar.h(fddu.i(i, 0, iN - 1));
        long jA = jyp.a(jyiVar.j(iH), jyiVar.g(iH, true));
        long j = jyo.a;
        return jA;
    }

    @Override // defpackage.fii
    public final long h() {
        return this.a;
    }

    @Override // defpackage.fii
    public final fil i() {
        Object objInvoke = this.c.invoke();
        if (objInvoke == null) {
            return null;
        }
        jyi jyiVar = (jyi) objInvoke;
        int iA = jyiVar.a.a.a();
        int iT = jyiVar.t(0);
        long j = this.a;
        return new fil(new fik(iT, 0, j), new fik(jyiVar.t(Math.max(iA - 1, 0)), iA, j), false);
    }

    @Override // defpackage.fii
    public final ihu j(int i) {
        Object objInvoke = this.c.invoke();
        if (objInvoke != null) {
            jyi jyiVar = (jyi) objInvoke;
            int iA = jyiVar.a.a.a();
            if (iA > 0) {
                return jyiVar.m(fddu.i(i, 0, iA - 1));
            }
        }
        return ihu.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ivy, java.lang.Object] */
    @Override // defpackage.fii
    public final ivy k() {
        ?? Invoke = this.b.invoke();
        if (Invoke == 0 || !Invoke.u()) {
            return null;
        }
        return Invoke;
    }

    @Override // defpackage.fii
    public final juo l() {
        Object objInvoke = this.c.invoke();
        return objInvoke == null ? new juo("") : ((jyi) objInvoke).a.a;
    }

    @Override // defpackage.fii
    public final void m(fka fkaVar) {
        Object objInvoke;
        int i;
        int i2;
        long j;
        int iC;
        int i3;
        int iC2;
        long j2;
        int i4;
        boolean z;
        int i5;
        int iB;
        int iB2;
        fik fikVar;
        fik fikVar2;
        ivy ivyVarK = k();
        if (ivyVarK == null || (objInvoke = this.c.invoke()) == null) {
            return;
        }
        ivy ivyVar = fkaVar.c;
        long j3 = fkaVar.a;
        long jH = ivyVar.h(ivyVarK, 0L);
        long jD = ihs.d(j3, jH);
        long j4 = fkaVar.b;
        long jD2 = (j4 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : ihs.d(j4, jH);
        long j5 = this.a;
        jyi jyiVar = (jyi) objInvoke;
        long j6 = jyiVar.c;
        ihu ihuVar = new ihu(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
        int i6 = (int) (jD >> 32);
        int i7 = Float.intBitsToFloat(i6) < ihuVar.b ? 1 : Float.intBitsToFloat(i6) > ihuVar.d ? 3 : 2;
        int i8 = (int) (jD & 4294967295L);
        int i9 = Float.intBitsToFloat(i8) < ihuVar.c ? 1 : Float.intBitsToFloat(i8) > ihuVar.e ? 3 : 2;
        boolean z2 = fkaVar.d;
        if (z2) {
            fil filVar = fkaVar.e;
            i = i7;
            int i10 = i9;
            iC2 = fig.c(i, i10, fkaVar, j5, filVar != null ? filVar.b : null);
            i3 = iC2;
            j2 = 9205357640488583168L;
            iC = i;
            i2 = i10;
            i4 = i2;
            z = z2;
            j = j5;
            i5 = i3;
        } else {
            fil filVar2 = fkaVar.e;
            fik fikVar3 = filVar2 != null ? filVar2.a : null;
            i = i7;
            i2 = i9;
            j = j5;
            iC = fig.c(i, i2, fkaVar, j, fikVar3);
            i3 = i;
            iC2 = i2;
            j2 = 9205357640488583168L;
            i4 = iC;
            z = z2;
            i5 = i4;
        }
        int iA = fkc.a(i, i2);
        if (iA == 2 || iA != i5) {
            int iA2 = jyiVar.a.a.a();
            if (z) {
                int iA3 = fig.a(jD, jyiVar);
                fil filVar3 = fkaVar.e;
                iB2 = (filVar3 == null || (fikVar2 = filVar3.b) == null) ? iA3 : fig.b(fikVar2, fkaVar.f, j, iA2);
                iB = iA3;
            } else {
                int iA4 = fig.a(jD, jyiVar);
                fil filVar4 = fkaVar.e;
                if (filVar4 == null || (fikVar = filVar4.a) == null) {
                    iB = iA4;
                    iB2 = iB;
                } else {
                    iB = fig.b(fikVar, fkaVar.f, j, iA2);
                    iB2 = iA4;
                }
            }
            int iA5 = (jD2 & 9223372034707292159L) == j2 ? -1 : fig.a(jD2, jyiVar);
            int i11 = fkaVar.k + 2;
            fkaVar.k = i11;
            fij fijVar = new fij(j, i11, iB, iB2, iA5, jyiVar);
            fkaVar.i = fkaVar.a(fkaVar.i, iC, i4);
            fkaVar.j = fkaVar.a(fkaVar.j, i3, iC2);
            cuk cukVar = fkaVar.g;
            List list = fkaVar.h;
            cukVar.c(j, list.size());
            list.add(fijVar);
        }
    }
}
