package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fyl implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ dfw b;
    final /* synthetic */ hox c;
    final /* synthetic */ dpn d;
    final /* synthetic */ ikp e;
    final /* synthetic */ long f;
    final /* synthetic */ float g;
    final /* synthetic */ fdau h;

    public fyl(ics icsVar, dfw dfwVar, hox hoxVar, dpn dpnVar, ikp ikpVar, long j, float f, fdau fdauVar) {
        this.a = icsVar;
        this.b = dfwVar;
        this.c = hoxVar;
        this.d = dpnVar;
        this.e = ikpVar;
        this.f = j;
        this.g = f;
        this.h = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gms.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, hmlVar, 384);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
