package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkde implements fdat {
    final /* synthetic */ dkdh a;

    public dkde(dkdh dkdhVar) {
        this.a = dkdhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final dkdh dkdhVar = this.a;
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(dkdhVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdap() { // from class: dkdd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((Boolean) obj3).booleanValue();
                        dkdhVar.e.invoke();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dthf.a(dkdhVar.d, (fdap) objF, null, true, null, hmlVar, 0);
        }
        return fctx.a;
    }
}
