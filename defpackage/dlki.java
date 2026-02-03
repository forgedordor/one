package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlki implements fdat {
    final /* synthetic */ fdax a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dtic c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdau f;
    final /* synthetic */ hcr g;
    final /* synthetic */ fdat h;
    final /* synthetic */ fdat i;
    final /* synthetic */ gda j;
    final /* synthetic */ fdap k;
    final /* synthetic */ fdat l;

    public dlki(fdax fdaxVar, boolean z, dtic dticVar, boolean z2, boolean z3, fdau fdauVar, hcr hcrVar, fdat fdatVar, fdat fdatVar2, gda gdaVar, fdap fdapVar, fdat fdatVar3) {
        this.a = fdaxVar;
        this.b = z;
        this.c = dticVar;
        this.d = z2;
        this.e = z3;
        this.f = fdauVar;
        this.g = hcrVar;
        this.h = fdatVar;
        this.i = fdatVar2;
        this.j = gdaVar;
        this.k = fdapVar;
        this.l = fdatVar3;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fdax fdaxVar = this.a;
            boolean z = this.b;
            dtic dticVar = this.c;
            boolean z2 = this.d;
            dlkk.b((dlim) fdaxVar.a(Boolean.valueOf(z), dticVar, Boolean.valueOf(z2 && !z), Boolean.valueOf(this.e), hmlVar, 0), (dlkl) this.f.a(dlkn.a(this.g), hmlVar, 0), (dljn) this.h.a(hmlVar, 0), this.i, hmlVar, 0);
            gda gdaVar = this.j;
            hmlVar.v(-1633490746);
            fdap fdapVar = this.k;
            boolean zD = hmlVar.D(fdapVar);
            fdat fdatVar = this.l;
            boolean zD2 = zD | hmlVar.D(fdatVar);
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                objF = new dlkh(fdapVar, fdatVar, null);
                hmlVar.y(objF);
            }
            hmlVar.o();
            hob.g(gdaVar, (fdat) objF, hmlVar);
        }
        return fctx.a;
    }
}
