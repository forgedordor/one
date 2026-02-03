package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkl implements fdpm {
    final /* synthetic */ List a;
    final /* synthetic */ gkn b;

    public gkl(List list, gkn gknVar) {
        this.a = list;
        this.b = gknVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if (ebjVar instanceof ebc) {
            this.a.add(ebjVar);
        } else if (ebjVar instanceof ebd) {
            this.a.remove(((ebd) ebjVar).a);
        }
        boolean z = !this.a.isEmpty();
        gkn gknVar = this.b;
        if (z != gknVar.e) {
            gknVar.e = z;
            gknVar.f();
        }
        return fctx.a;
    }
}
