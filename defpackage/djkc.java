package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djkc implements fdau {
    final /* synthetic */ hsf a;
    final /* synthetic */ boolean b;

    public djkc(hsf hsfVar, boolean z) {
        this.a = hsfVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        fdatVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dthq dthqVar = dthq.a;
            egc egcVarG = efy.g(0.0f, 12.0f, 1);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            hmlVar.o();
            dthqVar.b((String) this.a.a(), fdatVar, true, kfo.a, (ebk) objF, hxe.d(-230428146, new djkb(this.b), hmlVar), null, null, egcVarG, djjp.a, hmlVar, ((iIntValue << 3) & 112) | 100887936, 114819072);
        }
        return fctx.a;
    }
}
