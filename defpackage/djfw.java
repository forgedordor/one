package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djfw implements fdau {
    final /* synthetic */ String a;

    public djfw(String str) {
        this.a = str;
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
            kfp kfpVar = kfo.a;
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            hmlVar.o();
            dthqVar.b(this.a, fdatVar, false, kfpVar, (ebk) objF, djar.b, null, null, new egd(0.0f, 0.0f, 0.0f, 0.0f), djar.c, hmlVar, ((iIntValue << 3) & 112) | 100887936, 114819072);
        }
        return fctx.a;
    }
}
