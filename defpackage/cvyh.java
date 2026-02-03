package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvyh implements fdat {
    final /* synthetic */ dihq a;
    final /* synthetic */ cvyy b;

    public cvyh(dihq dihqVar, cvyy cvyyVar) {
        this.a = dihqVar;
        this.b = cvyyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final dihq dihqVar = this.a;
            boolean zD = hmlVar.D(dihqVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: cvyf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dihq dihqVar2 = dihqVar;
                        if (dihqVar2 != null) {
                            dihqVar2.k.invoke();
                        }
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtdi.e((fdae) objF, joj.a(ics.e, "add_people_button"), false, null, null, null, hxe.d(-933750326, new cvyg(this.b), hmlVar), hmlVar, 805306416, 508);
        }
        return fctx.a;
    }
}
