package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mjp implements mmi, mmj {
    public final mmk a;
    private final mmc b;
    private final mou c;

    public mjp(may mayVar, mmk mmkVar, mmk mmkVar2, mou mouVar) {
        mee.b(mmkVar != mmkVar2, "Creating a self loop in the chain: ".concat(String.valueOf(String.valueOf(mmkVar))));
        this.a = mmkVar;
        this.b = new mmc(mayVar, mmkVar2, mouVar);
        this.c = mouVar;
    }

    @Override // defpackage.mmj
    public final synchronized void a() {
        this.b.f();
    }

    @Override // defpackage.mmi
    public final void b(final maz mazVar) {
        this.c.d(new mot() { // from class: mjn
            @Override // defpackage.mot
            public final void a() {
                this.a.a.f(mazVar);
            }
        });
    }

    @Override // defpackage.mmi
    public final synchronized void c() {
        this.b.c();
    }

    @Override // defpackage.mmi
    public final synchronized void w() {
        this.b.w();
        final mmk mmkVar = this.a;
        mmkVar.getClass();
        this.c.d(new mot() { // from class: mjo
            @Override // defpackage.mot
            public final void a() {
                mmkVar.c();
            }
        });
    }

    @Override // defpackage.mmj
    public final synchronized void x(maz mazVar, long j) {
        this.b.e(mazVar, j);
    }
}
