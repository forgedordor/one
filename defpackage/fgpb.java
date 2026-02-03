package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpb extends fgoq {
    final fgna a;
    final fgna c;

    public fgpb(fgms fgmsVar, fgna fgnaVar, fgmu fgmuVar) {
        super(fgmsVar, fgmuVar);
        this.c = fgnaVar;
        this.a = fgmsVar.q();
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 99;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final int d() {
        return 0;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, 0, 99);
        fgms fgmsVar = this.b;
        int iA = fgmsVar.a(j);
        return fgmsVar.h(j, ((iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final fgna q() {
        return this.a;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final fgna s() {
        return this.c;
    }

    public fgpb(fgos fgosVar, fgmu fgmuVar) {
        this(fgosVar, fgosVar.b.q(), fgmuVar);
    }

    public fgpb(fgos fgosVar, fgna fgnaVar, fgmu fgmuVar) {
        super(fgosVar.b, fgmuVar);
        int i = fgosVar.a;
        this.a = fgnaVar;
        this.c = fgosVar.c;
    }
}
