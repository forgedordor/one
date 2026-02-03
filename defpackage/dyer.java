package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyer extends dygn {
    public final dyhv a;
    private final dyhu y;
    private final lvz z;

    public dyer(dyhu dyhuVar) {
        dyhk dyhkVarG;
        dygo dygoVarE = dygp.e();
        dyeu dyeuVar = (dyeu) dygoVarE;
        dyeuVar.b = new dyet(dyhuVar.n(), dyhuVar.m());
        if (dyhuVar.d() == null) {
            int iA = dyhuVar.a();
            dyfa dyfaVar = new dyfa();
            dyfaVar.a = null;
            dyfaVar.b(iA);
            dyfaVar.c(false);
            dyfaVar.c(true);
            dyhkVarG = dyfaVar.d();
        } else {
            dyhkVarG = dyhk.g(dyhuVar.d());
        }
        dyeuVar.a = dyhkVarG;
        dyeuVar.c = ejwi.j(Integer.valueOf(dyhuVar.b()));
        dyey dyeyVar = new dyey();
        dyeyVar.b(dyhuVar.c());
        dyeyVar.c(90535);
        dyeyVar.d(90535);
        dyeuVar.d = dyeyVar.a();
        super(dygoVarE.a());
        final lvv lvvVarF = dyhuVar.f();
        this.z = new lvz() { // from class: dyeo
            @Override // defpackage.lvz
            public final void a(Object obj) {
                dyer dyerVar = this.a;
                ejwi ejwiVar = (ejwi) obj;
                if (lvvVarF == null || !ejwiVar.g()) {
                    dyerVar.k(ejud.a);
                    return;
                }
                dyht dyhtVar = (dyht) ejwiVar.c();
                dygq dygqVarD = dygr.d();
                ((dyew) dygqVarD).a = ejwi.j(new dyet(dyhtVar.b(), dyhtVar.a()));
                dygqVarD.b(true);
                dyerVar.k(ejwi.j(dygqVarD.a()));
            }
        };
        this.y = dyhuVar;
        dyhv dyhvVarK = dyhuVar.k();
        if (dyhvVarK == null) {
            dyhvVarK = new dyeq();
            dyhvVarK.b(true);
        }
        this.a = dyhvVarK;
        m(dyhuVar.e());
        this.i = dyhuVar.l();
        super.g();
        j(dygk.CUSTOM_ACTION_CARD);
    }

    @Override // defpackage.dyfk
    public final void a(lvj lvjVar) {
        lvv lvvVarF = this.y.f();
        if (lvvVarF != null) {
            lvvVarF.f(lvjVar, this.z);
        }
    }

    @Override // defpackage.dyfk
    public final void b(final lvj lvjVar, final lvz lvzVar) {
        dyrf.a(new Runnable() { // from class: dyen
            @Override // java.lang.Runnable
            public final void run() {
                dyhv dyhvVar = this.a.a;
                dyhvVar.a();
                dyhvVar.b.f(lvjVar, lvzVar);
            }
        });
    }

    @Override // defpackage.dyfk
    public final void c(final lvj lvjVar) {
        dyrf.a(new Runnable() { // from class: dyep
            @Override // java.lang.Runnable
            public final void run() {
                ecem.c();
                this.a.a.b.l(lvjVar);
            }
        });
    }

    @Override // defpackage.dyfk
    protected final void d() {
        lvv lvvVarF = this.y.f();
        if (lvvVarF != null) {
            lvvVarF.k(this.z);
        }
    }
}
