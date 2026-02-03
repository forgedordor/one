package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fov implements fdpm {
    final /* synthetic */ List a;
    final /* synthetic */ fdjx b;
    final /* synthetic */ fqa c;

    public fov(List list, fdjx fdjxVar, fqa fqaVar) {
        this.a = list;
        this.b = fdjxVar;
        this.c = fqaVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if (ebjVar instanceof ebh) {
            this.a.add(ebjVar);
        } else if (ebjVar instanceof ebi) {
            this.a.remove(((ebi) ebjVar).a);
        } else if (ebjVar instanceof ebc) {
            this.a.add(ebjVar);
        } else if (ebjVar instanceof ebd) {
            this.a.remove(((ebd) ebjVar).a);
        } else if (ebjVar instanceof ebm) {
            this.a.add(ebjVar);
        } else if (ebjVar instanceof ebn) {
            this.a.remove(((ebn) ebjVar).a);
        } else if (ebjVar instanceof ebl) {
            this.a.remove(((ebl) ebjVar).a);
        }
        fdil.d(this.b, null, null, new fou(this.c, (ebj) fcva.T(this.a), null), 3);
        return fctx.a;
    }
}
