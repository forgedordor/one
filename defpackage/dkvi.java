package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkvi implements fdau {
    final /* synthetic */ dkxr a;
    final /* synthetic */ boolean b;

    public dkvi(dkxr dkxrVar, boolean z) {
        this.a = dkxrVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edp edpVar = (edp) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edpVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edpVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkxr dkxrVar = this.a;
            dkvo.b(dkvo.m(ics.e, dkxrVar.b, hmlVar), hxe.d(1417042538, new dkvh(dkxrVar, edpVar, this.b), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
