package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ngl implements nel, nek {
    public final nel a;
    private final long b;
    private nek c;

    public ngl(nel nelVar, long j) {
        this.a = nelVar;
        this.b = j;
    }

    @Override // defpackage.nel
    public final long a(long j, mtq mtqVar) {
        long j2 = this.b;
        return this.a.a(j - j2, mtqVar) + j2;
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ void b(nge ngeVar) {
        nek nekVar = this.c;
        mee.f(nekVar);
        nekVar.b(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long c() {
        long jC = this.a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.b;
    }

    @Override // defpackage.nek
    public final void d(nel nelVar) {
        nek nekVar = this.c;
        mee.f(nekVar);
        nekVar.d(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long e() {
        long jE = this.a.e();
        if (jE == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jE + this.b;
    }

    @Override // defpackage.nel
    public final long f() {
        long jF = this.a.f();
        if (jF == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jF + this.b;
    }

    @Override // defpackage.nel
    public final long g(long j) {
        long j2 = this.b;
        return this.a.g(j - j2) + j2;
    }

    @Override // defpackage.nel
    public final long h(nif[] nifVarArr, boolean[] zArr, ngc[] ngcVarArr, boolean[] zArr2, long j) {
        ngc[] ngcVarArr2 = new ngc[ngcVarArr.length];
        int i = 0;
        while (true) {
            ngc ngcVar = null;
            if (i >= ngcVarArr.length) {
                break;
            }
            ngk ngkVar = (ngk) ngcVarArr[i];
            if (ngkVar != null) {
                ngcVar = ngkVar.a;
            }
            ngcVarArr2[i] = ngcVar;
            i++;
        }
        nel nelVar = this.a;
        long j2 = this.b;
        long jH = nelVar.h(nifVarArr, zArr, ngcVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ngcVarArr.length; i2++) {
            ngc ngcVar2 = ngcVarArr2[i2];
            if (ngcVar2 == null) {
                ngcVarArr[i2] = null;
            } else {
                ngc ngcVar3 = ngcVarArr[i2];
                if (ngcVar3 == null || ((ngk) ngcVar3).a != ngcVar2) {
                    ngcVarArr[i2] = new ngk(ngcVar2, j2);
                }
            }
        }
        return jH + j2;
    }

    @Override // defpackage.nel
    public final ngo i() {
        return this.a.i();
    }

    @Override // defpackage.nel
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.nel
    public final void k(nek nekVar, long j) {
        this.c = nekVar;
        this.a.k(this, j - this.b);
    }

    @Override // defpackage.nel, defpackage.nge
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean n(msd msdVar) {
        msc mscVar = new msc(msdVar);
        mscVar.a = msdVar.a - this.b;
        return this.a.n(new msd(mscVar));
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.nel
    public final void q(long j) {
        this.a.q(j - this.b);
    }
}
