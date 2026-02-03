package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edtf extends lxd {
    public final edmp a;
    public final edmj b;
    public final lvx c;
    public edhm d;
    public edhm e;
    private edtc f;

    public edtf(edmp edmpVar, edmj edmjVar) {
        this.a = edmpVar;
        this.b = edmjVar;
        lvx lvxVar = new lvx();
        this.c = lvxVar;
        this.d = edhm.g();
        this.e = edhm.g();
        b();
        lvxVar.p(edmpVar.c, new lvz() { // from class: edtd
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edtf edtfVar = this.a;
                edtfVar.d = (edhm) obj;
                edtfVar.b();
            }
        });
        lvxVar.p(edmjVar.b, new lvz() { // from class: edte
            @Override // defpackage.lvz
            public final void a(Object obj) {
                edtf edtfVar = this.a;
                edtfVar.e = (edhm) obj;
                edtfVar.b();
            }
        });
    }

    public final lvv a() {
        return this.b.b;
    }

    public final void b() {
        ejwi ejwiVarB = this.e.b();
        ejwi ejwiVarB2 = this.d.b();
        ejwi ejwiVarA = this.d.a().a(this.e.a());
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(this.e.c());
        ekfwVar.j(this.d.c());
        edsx edsxVar = new edsx(ejwiVarB, ejwiVarB2, ejwiVarA, ekfwVar.g());
        if (edsxVar.equals(this.f)) {
            return;
        }
        this.f = edsxVar;
        this.c.j(edsxVar);
    }
}
