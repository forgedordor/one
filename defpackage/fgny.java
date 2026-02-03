package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgny extends fgoz {
    private final fgnt b;

    public fgny(fgnt fgntVar, fgna fgnaVar) {
        super(fgmu.l, fgnaVar);
        this.b = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.b.U(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 53;
    }

    @Override // defpackage.fgoz, defpackage.fgms
    public final int d() {
        return 1;
    }

    @Override // defpackage.fgoz, defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.fgoz, defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return this.b.e;
    }

    @Override // defpackage.fgoo
    public final int w(long j) {
        fgnt fgntVar = this.b;
        return fgntVar.W(fgntVar.X(j));
    }

    @Override // defpackage.fgoz
    protected final int x(long j, int i) {
        if (i > 52) {
            return w(j);
        }
        return 52;
    }
}
