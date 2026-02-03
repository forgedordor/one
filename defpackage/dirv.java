package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dirv implements fdau {
    final /* synthetic */ ikp a;

    public dirv(ikp ikpVar) {
        this.a = ikpVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVarA;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(-2044692850);
        boolean zA = dlv.a(hmlVar);
        ikp ikpVar = this.a;
        if (zA) {
            long j = ije.a;
            icsVarA = ifl.a(icsVar, 2.5f, ikpVar, j, j, 4);
        } else {
            long j2 = glz.a(hmlVar).a;
            icsVarA = ifl.a(icsVar, 7.0f, ikpVar, 0L, ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.4f, ije.f(j2)), 12);
        }
        hmlVar.o();
        return icsVarA;
    }
}
