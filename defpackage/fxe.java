package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxe implements fdpm {
    final /* synthetic */ fxg a;
    final /* synthetic */ fdjx b;

    public fxe(fxg fxgVar, fdjx fdjxVar) {
        this.a = fxgVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if (ebjVar instanceof ebo) {
            fxg fxgVar = this.a;
            if (fxgVar.f) {
                fxgVar.k((ebo) ebjVar);
            } else {
                fxgVar.g.h(ebjVar);
            }
        } else {
            fxg fxgVar2 = this.a;
            fdjx fdjxVar = this.b;
            fxl fxlVar = fxgVar2.c;
            if (fxlVar == null) {
                fxl fxlVar2 = new fxl(fxgVar2.a, fxgVar2.b);
                jbq.a(fxgVar2);
                fxgVar2.c = fxlVar2;
                fxlVar = fxlVar2;
            }
            boolean z = ebjVar instanceof ebh;
            if (z) {
                fxlVar.d.add(ebjVar);
            } else if (ebjVar instanceof ebi) {
                fxlVar.d.remove(((ebi) ebjVar).a);
            } else if (ebjVar instanceof ebc) {
                fxlVar.d.add(ebjVar);
            } else if (ebjVar instanceof ebd) {
                fxlVar.d.remove(((ebd) ebjVar).a);
            } else if (ebjVar instanceof eba) {
                fxlVar.d.add(ebjVar);
            } else if (ebjVar instanceof ebb) {
                fxlVar.d.remove(((ebb) ebjVar).a);
            } else if (ebjVar instanceof eaz) {
                fxlVar.d.remove(((eaz) ebjVar).a);
            }
            ebj ebjVar2 = (ebj) fcva.T(fxlVar.d);
            if (!fdbq.f(fxlVar.e, ebjVar2)) {
                if (ebjVar2 != null) {
                    fwx fwxVar = (fwx) fxlVar.b.invoke();
                    float f = z ? fwxVar.c : ebjVar instanceof ebc ? fwxVar.b : ebjVar instanceof eba ? fwxVar.a : 0.0f;
                    boolean z2 = ebjVar2 instanceof ebh;
                    dia diaVar = fxd.a;
                    dia diaVar2 = z2 ? fxd.a : ((ebjVar2 instanceof ebc) || (ebjVar2 instanceof eba)) ? new dia(45, dev.d, 2) : fxd.a;
                    fdil.d(fdjxVar, null, null, new fxj(fxlVar, f, diaVar2, null), 3);
                } else {
                    ebj ebjVar3 = fxlVar.e;
                    boolean z3 = ebjVar3 instanceof ebh;
                    dia diaVar3 = fxd.a;
                    dia diaVar4 = (z3 || (ebjVar3 instanceof ebc) || !(ebjVar3 instanceof eba)) ? fxd.a : new dia(150, dev.d, 2);
                    fdil.d(fdjxVar, null, null, new fxk(fxlVar, diaVar4, null), 3);
                }
                fxlVar.e = ebjVar2;
            }
        }
        return fctx.a;
    }
}
