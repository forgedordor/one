package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dimn implements fdat {
    final /* synthetic */ diks a;
    final /* synthetic */ ics b;
    final /* synthetic */ ikp c;
    final /* synthetic */ kji d;

    public dimn(diks diksVar, ics icsVar, ikp ikpVar, kji kjiVar) {
        this.a = diksVar;
        this.b = icsVar;
        this.c = ikpVar;
        this.d = kjiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diks diksVar = this.a;
            dlro dlroVarD = diksVar.d();
            dlro dlroVarD2 = diksVar.d();
            boolean z = dlroVarD2 != null ? dlroVarD2.h : true;
            boolean z2 = diksVar instanceof dikl ? ((dikl) diksVar).a : false;
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = dimg.a;
                hmlVar.y(objF);
            }
            hmlVar.o();
            dlrl.a(dlroVarD, null, z, 5, z2, (fdat) ((fdea) objF), hxe.d(-1211761644, new dimm(diksVar, this.b, this.c, this.d), hmlVar), hmlVar, 1772544, 2);
        }
        return fctx.a;
    }
}
