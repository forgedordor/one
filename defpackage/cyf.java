package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyf extends fdbr implements fdau {
    final /* synthetic */ cyg a;
    final /* synthetic */ dap b;
    final /* synthetic */ dar c;
    final /* synthetic */ String d = "animateEnterExit";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyf(cyg cygVar, dap dapVar, dar darVar) {
        super(3);
        this.a = cygVar;
        this.b = dapVar;
        this.c = darVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1840112047);
        ics icsVarA = ((ics) obj).a(dae.i(((cyh) this.a).a, this.b, this.c, null, this.d, hmlVar, 0, 4));
        hmlVar.o();
        return icsVarA;
    }
}
