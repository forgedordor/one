package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfb implements fdat {
    final /* synthetic */ fdae a;

    public ejfb(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final fdae fdaeVar = this.a;
            boolean zD = hmlVar.D(fdaeVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: ejfa
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            gax.b((fdae) objF, null, false, null, null, null, ejdk.c, hmlVar, 805306368, 510);
        }
        return fctx.a;
    }
}
