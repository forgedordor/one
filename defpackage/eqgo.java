package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqgo implements eqgk {
    private final exzf a;
    private final String b;
    private final eqcz c;

    public eqgo(exzf exzfVar, String str, eqcz eqczVar) {
        exzfVar.getClass();
        this.a = exzfVar;
        this.b = str;
        this.c = eqczVar;
    }

    static /* synthetic */ exzo d(eqgo eqgoVar, int i) {
        return eqgoVar.e(i, null);
    }

    private final exzo e(int i, eqcx eqcxVar) {
        exzn exznVar = (exzn) exzo.a.createBuilder();
        exznVar.getClass();
        exzc.c(this.b, exznVar);
        exze exzeVar = (exze) exzg.a.createBuilder();
        exzeVar.getClass();
        exza.b(this.a, exzeVar);
        exza.d(3, exzeVar);
        exza.e(i, exzeVar);
        if (eqcxVar != null) {
            exza.c(eqhr.q(eqcxVar), exzeVar);
        }
        exzc.b(exza.a(exzeVar), exznVar);
        eqcz eqczVar = this.c;
        if (eqczVar != null) {
            exzc.e(eqczVar.a, exznVar);
        }
        return exzc.a(exznVar);
    }

    @Override // defpackage.eqgk
    public final exzo a(eqcx eqcxVar) {
        return e(4, eqcxVar);
    }

    @Override // defpackage.eqgk
    public final exzo b() {
        return d(this, 5);
    }

    @Override // defpackage.eqgk
    public final exzo c() {
        return d(this, 3);
    }

    public /* synthetic */ eqgo(exzf exzfVar, String str) {
        this(exzfVar, str, null);
    }
}
