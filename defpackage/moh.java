package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class moh extends moj {
    public mmc a;
    public mmw b;
    private max c;
    private final may d;

    public moh(may mayVar, mou mouVar) {
        super(mouVar);
        this.d = mayVar;
    }

    @Override // defpackage.moj, defpackage.mmi
    public final void b(final maz mazVar) {
        this.n.d(new mot() { // from class: mof
            @Override // defpackage.mot
            public final void a() {
                mmw mmwVar = this.a.b;
                mee.f(mmwVar);
                int i = mazVar.b;
                mev.e();
                mnk mnkVar = mmwVar.a;
                SparseArray sparseArray = mnkVar.f;
                mee.c(mgb.U(sparseArray, i));
                mnh mnhVar = (mnh) sparseArray.get(i);
                mmm mmmVar = mnhVar.a;
                final long j = mnhVar.b;
                final mkk mkkVar = (mkk) mmmVar;
                mkkVar.c.d(new mot() { // from class: mkb
                    @Override // defpackage.mot
                    public final void a() {
                        mkkVar.e(j);
                    }
                });
                sparseArray.remove(i);
                mnkVar.p();
            }
        });
    }

    @Override // defpackage.moj, defpackage.mmi
    public final void c() {
        mee.f(this.a);
        final mmc mmcVar = this.a;
        mmcVar.getClass();
        this.n.d(new mot() { // from class: mog
            @Override // defpackage.mot
            public final void a() {
                mmcVar.c();
            }
        });
    }

    @Override // defpackage.moj
    public final int d() {
        mmc mmcVar = this.a;
        mee.f(mmcVar);
        return mmcVar.d();
    }

    @Override // defpackage.moj
    protected final synchronized void e() {
        mmc mmcVar = this.a;
        mee.f(mmcVar);
        mmcVar.w();
        super.e();
    }

    @Override // defpackage.moj
    public final void h(mmk mmkVar) {
        this.a = new mmc(this.d, mmkVar, this.n);
    }

    @Override // defpackage.moj
    public final void i() {
        this.n.d(new mot() { // from class: mod
            @Override // defpackage.mot
            public final void a() {
                mmc mmcVar = this.a.a;
                mee.f(mmcVar);
                mmcVar.f();
                int i = mjr.a;
            }
        });
    }

    @Override // defpackage.moj
    public final void r(max maxVar, boolean z) {
        this.c = maxVar;
    }

    @Override // defpackage.moj
    public final void y(final int i, final long j) {
        final max maxVar = this.c;
        mee.f(maxVar);
        mee.f(this.b);
        this.n.d(new mot() { // from class: moe
            @Override // defpackage.mot
            public final void a() {
                int i2 = i;
                mau mauVar = maxVar.a;
                maz mazVar = new maz(i2, -1, mauVar.v, mauVar.w);
                mmc mmcVar = this.a.a;
                mee.f(mmcVar);
                mmcVar.e(mazVar, j);
                int i3 = mjr.a;
            }
        });
    }

    @Override // defpackage.moj
    public final void z(mmw mmwVar) {
        this.b = mmwVar;
    }

    @Override // defpackage.moj
    public final void g() {
    }
}
