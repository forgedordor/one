package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndi implements nel, nek {
    public final nel a;
    long b;
    long c;
    public ndl d;
    private nek e;
    private ndh[] f = new ndh[0];
    private long g;

    public ndi(nel nelVar, boolean z, long j, long j2) {
        this.a = nelVar;
        this.g = true != z ? -9223372036854775807L : j;
        this.b = j;
        this.c = j2;
    }

    private static long r(long j, long j2, long j3) {
        long jMax = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.nel
    public final long a(long j, mtq mtqVar) {
        long j2 = this.b;
        if (j == j2) {
            return j2;
        }
        long j3 = mtqVar.c;
        long jS = mgb.s(j3, 0L, j - j2);
        long j4 = mtqVar.d;
        long j5 = this.c;
        long jS2 = mgb.s(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (jS != j3 || jS2 != j4) {
            mtqVar = new mtq(jS, jS2);
        }
        return this.a.a(j, mtqVar);
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ void b(nge ngeVar) {
        nek nekVar = this.e;
        mee.f(nekVar);
        nekVar.b(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long c() {
        long jC = this.a.c();
        if (jC != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jC < j) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.nek
    public final void d(nel nelVar) {
        if (this.d != null) {
            return;
        }
        nek nekVar = this.e;
        mee.f(nekVar);
        nekVar.d(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long e() {
        long jE = this.a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.nel
    public final long f() {
        if (p()) {
            long j = this.g;
            this.g = -9223372036854775807L;
            long jF = f();
            return jF != -9223372036854775807L ? jF : j;
        }
        long jF2 = this.a.f();
        if (jF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return r(jF2, this.b, this.c);
    }

    @Override // defpackage.nel
    public final long g(long j) {
        this.g = -9223372036854775807L;
        for (ndh ndhVar : this.f) {
            if (ndhVar != null) {
                ndhVar.b = false;
            }
        }
        return r(this.a.g(j), this.b, this.c);
    }

    @Override // defpackage.nel
    public final long h(nif[] nifVarArr, boolean[] zArr, ngc[] ngcVarArr, boolean[] zArr2, long j) {
        int length = ngcVarArr.length;
        this.f = new ndh[length];
        ngc[] ngcVarArr2 = new ngc[length];
        int i = 0;
        while (true) {
            ngc ngcVar = null;
            if (i >= ngcVarArr.length) {
                break;
            }
            ndh[] ndhVarArr = this.f;
            ndh ndhVar = (ndh) ngcVarArr[i];
            ndhVarArr[i] = ndhVar;
            if (ndhVar != null) {
                ngcVar = ndhVar.a;
            }
            ngcVarArr2[i] = ngcVar;
            i++;
        }
        long jH = this.a.h(nifVarArr, zArr, ngcVarArr2, zArr2, j);
        long jR = r(jH, j, this.c);
        long j2 = -9223372036854775807L;
        if (p()) {
            if (jH < j) {
                j2 = jR;
                break;
            }
            if (jH != 0) {
                for (nif nifVar : nifVarArr) {
                    if (nifVar != null) {
                        mau mauVarB = nifVar.b();
                        if (!mbw.g(mauVarB.o, mauVarB.k)) {
                            j2 = jR;
                            break;
                        }
                    }
                }
            }
        }
        this.g = j2;
        for (int i2 = 0; i2 < ngcVarArr.length; i2++) {
            ngc ngcVar2 = ngcVarArr2[i2];
            if (ngcVar2 == null) {
                this.f[i2] = null;
            } else {
                ndh[] ndhVarArr2 = this.f;
                ndh ndhVar2 = ndhVarArr2[i2];
                if (ndhVar2 == null || ndhVar2.a != ngcVar2) {
                    ndhVarArr2[i2] = new ndh(this, ngcVar2);
                }
            }
            ngcVarArr[i2] = this.f[i2];
        }
        return jR;
    }

    @Override // defpackage.nel
    public final ngo i() {
        return this.a.i();
    }

    @Override // defpackage.nel
    public final void j() throws ndl {
        ndl ndlVar = this.d;
        if (ndlVar != null) {
            throw ndlVar;
        }
        this.a.j();
    }

    @Override // defpackage.nel
    public final void k(nek nekVar, long j) {
        this.e = nekVar;
        this.a.k(this, j);
    }

    @Override // defpackage.nel, defpackage.nge
    public final void l(long j) {
        this.a.l(j);
    }

    public final void m(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean n(msd msdVar) {
        return this.a.n(msdVar);
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean o() {
        return this.a.o();
    }

    final boolean p() {
        return this.g != -9223372036854775807L;
    }

    @Override // defpackage.nel
    public final void q(long j) {
        this.a.q(j);
    }
}
