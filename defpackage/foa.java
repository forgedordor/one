package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foa implements fdat {
    final /* synthetic */ dfw a;
    final /* synthetic */ hox b;
    final /* synthetic */ dpn c;
    final /* synthetic */ ics d;
    final /* synthetic */ fdau e;

    public foa(dfw dfwVar, hox hoxVar, dpn dpnVar, ics icsVar, fdau fdauVar) {
        this.a = dfwVar;
        this.b = hoxVar;
        this.c = dpnVar;
        this.d = icsVar;
        this.e = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fra.b(this.a, this.b, this.c, this.d, this.e, hmlVar, 48);
        }
        return fctx.a;
    }
}
