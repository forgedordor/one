package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgof extends fgoq {
    private final fgnt a;

    public fgof(fgms fgmsVar, fgnt fgntVar) {
        super(fgmsVar, fgmu.c);
        this.a = fgntVar;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA <= 0 ? 1 - iA : iA;
    }

    @Override // defpackage.fgoq, defpackage.fgoo, defpackage.fgms
    public final int c() {
        return this.b.c();
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
        fgot.c(this, i, 1, c());
        if (this.a.Y(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.fgoq, defpackage.fgms
    public final fgna s() {
        return this.a.h;
    }
}
