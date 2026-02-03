package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davc implements dava {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fduf d;
    private final fdjx e;

    public davc(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3) {
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.e = fdjxVar;
        this.c = fcsuVar3;
        this.d = fdvf.a(dauw.a);
    }

    @Override // defpackage.dava
    public final fdvc a() {
        return this.d;
    }

    @Override // defpackage.dava
    public final void b(egbe egbeVar) {
        if (egbeVar == null || (((askd) this.c.b()).a() && !fdbq.f(egbeVar.b().k, "google"))) {
            this.d.f(daux.a);
        } else {
            auvw.k(this.e, null, null, new davb(this, egbeVar, null), 3);
        }
    }
}
