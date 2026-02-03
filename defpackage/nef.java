package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nef implements nel, nek {
    public final nen a;
    public final long b;
    public nep c;
    public nel d;
    public long e = -9223372036854775807L;
    private nek f;
    private final niu g;

    public nef(nen nenVar, niu niuVar, long j) {
        this.a = nenVar;
        this.g = niuVar;
        this.b = j;
    }

    private final long p(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.nel
    public final long a(long j, mtq mtqVar) {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.a(j, mtqVar);
    }

    @Override // defpackage.ngd
    public final /* bridge */ /* synthetic */ void b(nge ngeVar) {
        nek nekVar = this.f;
        String str = mgb.a;
        nekVar.b(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long c() {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.c();
    }

    @Override // defpackage.nek
    public final void d(nel nelVar) {
        nek nekVar = this.f;
        String str = mgb.a;
        nekVar.d(this);
    }

    @Override // defpackage.nel, defpackage.nge
    public final long e() {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.e();
    }

    @Override // defpackage.nel
    public final long f() {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.f();
    }

    @Override // defpackage.nel
    public final long g(long j) {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.g(j);
    }

    @Override // defpackage.nel
    public final long h(nif[] nifVarArr, boolean[] zArr, ngc[] ngcVarArr, boolean[] zArr2, long j) {
        long j2 = this.e;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.e = -9223372036854775807L;
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.h(nifVarArr, zArr, ngcVarArr, zArr2, j3);
    }

    @Override // defpackage.nel
    public final ngo i() {
        nel nelVar = this.d;
        String str = mgb.a;
        return nelVar.i();
    }

    @Override // defpackage.nel
    public final void j() {
        nel nelVar = this.d;
        if (nelVar != null) {
            nelVar.j();
            return;
        }
        nep nepVar = this.c;
        if (nepVar != null) {
            nepVar.t();
        }
    }

    @Override // defpackage.nel
    public final void k(nek nekVar, long j) {
        this.f = nekVar;
        nel nelVar = this.d;
        if (nelVar != null) {
            nelVar.k(this, p(this.b));
        }
    }

    @Override // defpackage.nel, defpackage.nge
    public final void l(long j) {
        nel nelVar = this.d;
        String str = mgb.a;
        nelVar.l(j);
    }

    public final void m(nen nenVar) {
        long jP = p(this.b);
        nep nepVar = this.c;
        mee.f(nepVar);
        nel nelVarW = nepVar.w(nenVar, this.g, jP);
        this.d = nelVarW;
        if (this.f != null) {
            nelVarW.k(this, jP);
        }
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean n(msd msdVar) {
        nel nelVar = this.d;
        return nelVar != null && nelVar.n(msdVar);
    }

    @Override // defpackage.nel, defpackage.nge
    public final boolean o() {
        nel nelVar = this.d;
        return nelVar != null && nelVar.o();
    }

    @Override // defpackage.nel
    public final void q(long j) {
        nel nelVar = this.d;
        String str = mgb.a;
        nelVar.q(j);
    }
}
