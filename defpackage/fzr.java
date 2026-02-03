package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzr implements fdat {
    final /* synthetic */ gak a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ikp e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ float h;
    final /* synthetic */ float i;
    final /* synthetic */ fdat j;
    final /* synthetic */ fdau k;

    public fzr(gak gakVar, float f, float f2, boolean z, ikp ikpVar, long j, long j2, float f3, float f4, fdat fdatVar, fdau fdauVar) {
        this.a = gakVar;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = ikpVar;
        this.f = j;
        this.g = j2;
        this.h = f3;
        this.i = f4;
        this.j = fdatVar;
        this.k = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gaj.d(this.a.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, hmlVar, 0, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
