package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzt implements fdat {
    final /* synthetic */ gak a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdau c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;
    final /* synthetic */ ikp g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ float j;
    final /* synthetic */ float k;
    final /* synthetic */ fdat l;
    final /* synthetic */ fdau m;
    final /* synthetic */ fdau n;

    public fzt(gak gakVar, fdat fdatVar, fdau fdauVar, float f, float f2, boolean z, ikp ikpVar, long j, long j2, float f3, float f4, fdat fdatVar2, fdau fdauVar2, fdau fdauVar3) {
        this.a = gakVar;
        this.b = fdatVar;
        this.c = fdauVar;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = ikpVar;
        this.h = j;
        this.i = j2;
        this.j = f3;
        this.k = f4;
        this.l = fdatVar2;
        this.m = fdauVar2;
        this.n = fdauVar3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            final gak gakVar = this.a;
            fdat fdatVar = this.b;
            fdau fdauVar = this.c;
            float f = this.d;
            hwv hwvVarD = hxe.d(-519581786, new fzq(fdauVar, f), hmlVar);
            hwv hwvVarD2 = hxe.d(-815624571, new fzr(gakVar, f, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), hmlVar);
            hwv hwvVarD3 = hxe.d(-1111667356, new fzs(this.n, gakVar), hmlVar);
            boolean zD = hmlVar.D(gakVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: fzp
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return Float.valueOf(gakVar.a.b());
                    }
                };
                hmlVar.y(objF);
            }
            gaj.c(fdatVar, hwvVarD, hwvVarD2, hwvVarD3, (fdae) objF, gakVar.a, hmlVar, 3504);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
