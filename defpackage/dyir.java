package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyir extends lvx {
    private static final Set i = fcwm.d(dyhq.OUT_OF_STORAGE, dyhq.LOW_STORAGE_SEVERE);
    public final dydi a;
    public final lvz h;
    private final dyiq j;
    private final dyaj k;
    private boolean l;
    private boolean m;
    private dygh n;

    public dyir(dyif dyifVar, dydi dydiVar) {
        super(false);
        this.a = dydiVar;
        lvz lvzVar = new lvz() { // from class: dyio
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ((ejwi) obj).getClass();
                final dyir dyirVar = this.a;
                ecem.e(new Runnable() { // from class: dyin
                    @Override // java.lang.Runnable
                    public final void run() {
                        dyir dyirVar2 = dyirVar;
                        ekgb ekgbVarB = dyirVar2.a.b();
                        ekgbVarB.getClass();
                        dyirVar2.b(ekgbVarB);
                    }
                });
            }
        };
        this.h = lvzVar;
        this.j = new dyiq(this);
        dyaj dyajVar = (dyaj) ((dyii) dyifVar).h.f();
        this.k = dyajVar;
        if (dyajVar != null) {
            p(dyajVar, lvzVar);
        }
    }

    public final void b(ekgb ekgbVar) {
        dyaj dyajVar = this.k;
        boolean z = dyajVar != null && dyajVar.c(ekgbVar);
        if (z != this.l) {
            ecem.c();
            this.l = z;
            m(Boolean.valueOf(z || this.m));
        }
    }

    public final void c() {
        this.n = null;
        boolean zAz = fcva.az(i, null);
        if (zAz != this.m) {
            ecem.c();
            this.m = zAz;
            boolean z = true;
            if (!this.l && !zAz) {
                z = false;
            }
            m(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.lvx, defpackage.lvv
    protected final void h() {
        ecem.c();
        super.h();
        dydi dydiVar = this.a;
        dydiVar.c(this.j);
        dydiVar.a();
        c();
        ekgb ekgbVarB = dydiVar.b();
        ekgbVarB.getClass();
        b(ekgbVarB);
    }

    @Override // defpackage.lvx, defpackage.lvv
    protected final void i() {
        ecem.c();
        super.i();
        this.a.d(this.j);
        c();
        int i2 = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        b(ekgbVar);
    }
}
