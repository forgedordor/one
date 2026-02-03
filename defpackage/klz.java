package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klz extends fdbr implements fdat {
    final /* synthetic */ hsf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klz(hsf hsfVar) {
        super(2);
        this.a = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ico icoVar = ics.e;
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = kly.a;
                hmlVar.y(objF);
            }
            kme.b(jsh.c(icoVar, false, (fdap) objF), (fdat) this.a.a(), hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
