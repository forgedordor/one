package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edbo extends lxd {
    public final edis a;
    public final lvx b;
    public ejwi c;
    public ejwi d;
    public int e;

    public edbo(edis edisVar) {
        ejud ejudVar = ejud.a;
        this.c = ejudVar;
        this.d = ejudVar;
        this.a = edisVar;
        lvx lvxVar = new lvx();
        this.b = lvxVar;
        lvxVar.p(edisVar.b, new lvz() { // from class: edbm
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((ediu) obj);
                edbo edboVar = this.a;
                edboVar.d = ejwiVarJ;
                edboVar.a();
            }
        });
        lvxVar.p(edisVar.c, new lvz() { // from class: edbn
            @Override // defpackage.lvz
            public final void a(Object obj) {
                ejwi ejwiVarJ = ejwi.j((edhq) obj);
                edbo edboVar = this.a;
                edboVar.c = ejwiVarJ;
                edboVar.a();
            }
        });
        this.e = 1;
    }

    public final void a() {
        if (this.d.g() && this.c.g()) {
            lvx lvxVar = this.b;
            ekgb ekgbVarJ = ekgb.j(((ediu) this.d.c()).c());
            ekgb ekgbVarJ2 = ekgb.j(((ediu) this.d.c()).b());
            ekgb ekgbVarJ3 = ekgb.j(((edhq) this.c.c()).b());
            ejwi ejwiVarA = ((ediu) this.d.c()).a().a(((edhq) this.c.c()).a());
            ekgb ekgbVarS = ekgb.s(((ediu) this.d.c()).d(), ((edhq) this.c.c()).c());
            if (ekgbVarS == null) {
                throw new NullPointerException("Null events");
            }
            if (ekgbVarJ != null && ekgbVarJ2 != null && ekgbVarJ3 != null) {
                lvxVar.j(new edbp(ekgbVarJ, ekgbVarJ2, ekgbVarJ3, ejwiVarA, ekgbVarS));
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (ekgbVarJ == null) {
                sb.append(" suggestedImages");
            }
            if (ekgbVarJ2 == null) {
                sb.append(" suggestedCollections");
            }
            if (ekgbVarJ3 == null) {
                sb.append(" categories");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    }
}
