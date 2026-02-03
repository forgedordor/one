package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ebe implements fdpm {
    final /* synthetic */ List a;
    final /* synthetic */ hox b;

    public ebe(List list, hox hoxVar) {
        this.a = list;
        this.b = hoxVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if (ebjVar instanceof ebc) {
            this.a.add(ebjVar);
        } else if (ebjVar instanceof ebd) {
            this.a.remove(((ebd) ebjVar).a);
        }
        this.b.b(Boolean.valueOf(!this.a.isEmpty()));
        return fctx.a;
    }
}
