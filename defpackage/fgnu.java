package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgnu extends fgoz {
    private final fgnt b;

    public fgnu(fgnt fgntVar, fgna fgnaVar) {
        super(fgmu.i, fgnaVar);
        this.b = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        fgnt fgntVar = this.b;
        int iY = fgntVar.Y(j);
        return fgntVar.N(j, iY, fgntVar.T(j, iY));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 31;
    }

    @Override // defpackage.fgoz, defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.b.f;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.fgoo
    public final int w(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.fgoz
    protected final int x(long j, int i) {
        if (i > 28 || i <= 0) {
            return this.b.Q(j);
        }
        return 28;
    }
}
