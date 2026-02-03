package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgos extends fgoq {
    final int a;
    final fgna c;
    final fgna d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgos(fgms fgmsVar, fgmu fgmuVar) {
        super(fgmsVar, fgmuVar);
        fgna fgnaVarS = fgmsVar.s();
        fgna fgnaVarQ = fgmsVar.q();
        if (fgnaVarQ == null) {
            this.c = null;
        } else {
            this.c = new fgpc(fgnaVarQ, ((fgmt) fgmuVar).a);
        }
        this.d = fgnaVarS;
        this.a = 100;
        int iD = fgmsVar.d();
        int i = iD >= 0 ? iD / 100 : ((iD + 1) / 100) - 1;
        int iC = fgmsVar.c();
        int i2 = iC >= 0 ? iC / 100 : ((iC + 1) / 100) - 1;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.f;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        int iA = a(j) * 100;
        fgms fgmsVar = this.b;
        return fgmsVar.g(fgmsVar.h(j, iA));
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, this.e, this.f);
        fgms fgmsVar = this.b;
        int iA = fgmsVar.a(j);
        return fgmsVar.h(j, (i * 100) + (iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99));
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return this.c;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final fgna s() {
        fgna fgnaVar = this.d;
        return fgnaVar != null ? fgnaVar : super.s();
    }
}
