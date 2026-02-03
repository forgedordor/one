package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gan implements fdpm {
    final /* synthetic */ iac a;

    public gan(iac iacVar) {
        this.a = iacVar;
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
        return fctx.a;
    }
}
