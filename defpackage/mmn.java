package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmn implements mmj, mmi {
    public boolean a;
    private final mjp b;

    public mmn(may mayVar, mmk mmkVar, mmk mmkVar2, mou mouVar) {
        this.b = new mjp(mayVar, mmkVar, mmkVar2, mouVar);
    }

    @Override // defpackage.mmj
    public final synchronized void a() {
        if (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.mmi
    public final void b(maz mazVar) {
        if (this.a) {
            this.b.b(mazVar);
        }
    }

    @Override // defpackage.mmi
    public final void c() {
        if (this.a) {
            this.b.c();
        }
    }

    @Override // defpackage.mmi
    public final synchronized void w() {
        if (this.a) {
            this.b.w();
        }
    }

    @Override // defpackage.mmj
    public final synchronized void x(maz mazVar, long j) {
        if (this.a) {
            this.b.x(mazVar, j);
        }
    }
}
