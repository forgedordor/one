package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djhs implements fdat {
    final /* synthetic */ djcy a;
    final /* synthetic */ djdm b;
    final /* synthetic */ djfn c;
    final /* synthetic */ igr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ float f;
    final /* synthetic */ boolean g;
    final /* synthetic */ djga h;
    final /* synthetic */ int i;

    public djhs(djcy djcyVar, djdm djdmVar, djfn djfnVar, igr igrVar, boolean z, int i, float f, boolean z2, djga djgaVar) {
        this.a = djcyVar;
        this.b = djdmVar;
        this.c = djfnVar;
        this.d = igrVar;
        this.e = z;
        this.i = i;
        this.f = f;
        this.g = z2;
        this.h = djgaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djhx.e(this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, this.h, hmlVar, 0);
        }
        return fctx.a;
    }
}
