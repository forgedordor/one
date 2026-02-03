package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqgs implements eqgk {
    private final eqeq a;
    private final eqdb b;
    private final String c;
    private final eqcz d;

    public eqgs(eqeq eqeqVar, eqdb eqdbVar, String str, eqcz eqczVar) {
        this.a = eqeqVar;
        this.b = eqdbVar;
        this.c = str;
        this.d = eqczVar;
    }

    static /* synthetic */ exzo d(eqgs eqgsVar, int i) {
        return eqgsVar.e(i, null);
    }

    private final exzo e(int i, eqcx eqcxVar) {
        exzn exznVar = (exzn) exzo.a.createBuilder();
        exznVar.getClass();
        exzc.c(this.c, exznVar);
        exzp exzpVar = (exzp) exzr.a.createBuilder();
        exzpVar.getClass();
        exzv.c(this.a.a, exzpVar);
        eqdb eqdbVar = this.b;
        exzv.b(eqdbVar.a().toString(), exzpVar);
        exzv.d(eqdbVar.b().d(), exzpVar);
        exzv.f(i, exzpVar);
        if (eqcxVar != null) {
            exzv.e(eqhr.q(eqcxVar), exzpVar);
        }
        exzc.d(exzv.a(exzpVar), exznVar);
        eqcz eqczVar = this.d;
        if (eqczVar != null) {
            exzc.e(eqczVar.a, exznVar);
        }
        return exzc.a(exznVar);
    }

    @Override // defpackage.eqgk
    public final exzo a(eqcx eqcxVar) {
        return e(5, eqcxVar);
    }

    @Override // defpackage.eqgk
    public final exzo b() {
        throw null;
    }

    @Override // defpackage.eqgk
    public final exzo c() {
        return d(this, 3);
    }
}
