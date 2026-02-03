package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdg implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ dmvm b;

    public wdg(hox hoxVar, dmvm dmvmVar) {
        this.a = hoxVar;
        this.b = dmvmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(5004770);
            final hox hoxVar = this.a;
            boolean zD = hmlVar.D(hoxVar);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new fdae() { // from class: wdf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            fdae fdaeVar = (fdae) objF;
            hmlVar.o();
            ics icsVarG = icj.g(ics.e, new ehp());
            dmvm dmvmVar = this.b;
            if (dmvmVar instanceof dmvk) {
                hmlVar.v(1955180790);
                dmvk dmvkVar = (dmvk) dmvmVar;
                dmvkVar.b.b(true);
                dmyf.m(icsVarG, dmvkVar, fdaeVar, hmlVar, 64);
                hmlVar.o();
            } else {
                if (!(dmvmVar instanceof dmvl)) {
                    hmlVar.v(63068787);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(63076868);
                dmxm.h(icsVarG, (dmvl) dmvmVar, false, fdaeVar, hmlVar, 64, 4);
                hmlVar.o();
            }
            acx.a(false, fdaeVar, hmlVar, 0, 1);
        }
        return fctx.a;
    }
}
