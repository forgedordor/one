package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntb implements nsx {
    private final mfr a;
    private final int b;
    private final int c;
    private int d;
    private int e;

    public ntb(mgh mghVar) {
        mfr mfrVar = mghVar.a;
        this.a = mfrVar;
        mfrVar.K(12);
        this.c = mfrVar.m() & 255;
        this.b = mfrVar.m();
    }

    @Override // defpackage.nsx
    public final int a() {
        return -1;
    }

    @Override // defpackage.nsx
    public final int b() {
        return this.b;
    }

    @Override // defpackage.nsx
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.j();
        }
        if (i == 16) {
            return this.a.n();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iJ = this.a.j();
        this.e = iJ;
        return (iJ & 240) >> 4;
    }
}
