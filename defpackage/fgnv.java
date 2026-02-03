package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgnv extends fgoz {
    private final fgnt b;

    public fgnv(fgnt fgntVar, fgna fgnaVar) {
        super(fgmu.g, fgnaVar);
        this.b = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        fgnt fgntVar = this.b;
        return fgntVar.P(j, fgntVar.Y(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 366;
    }

    @Override // defpackage.fgoz, defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.b.g;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.b.af(j);
    }

    @Override // defpackage.fgoo
    public final int w(long j) {
        fgnt fgntVar = this.b;
        return fgntVar.ag(fgntVar.Y(j)) ? 366 : 365;
    }

    @Override // defpackage.fgoz
    protected final int x(long j, int i) {
        if (i > 365 || i <= 0) {
            return w(j);
        }
        return 365;
    }
}
