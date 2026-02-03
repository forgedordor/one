package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpf extends fgoq {
    public fgpf(fgms fgmsVar, fgmu fgmuVar) {
        super(fgmsVar, fgmuVar);
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA == 0 ? c() : iA;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.b.c() + 1;
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        return this.b.e(j, i);
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
        int iC = c();
        fgot.c(this, i, 1, iC);
        if (i == iC) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.b.r();
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.b.t(j);
    }
}
