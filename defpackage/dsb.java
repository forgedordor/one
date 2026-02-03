package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsb extends fcyz implements fdap {
    int a;
    final /* synthetic */ dsd b;
    final /* synthetic */ fdau c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsb(dsd dsdVar, fdau fdauVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dsdVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dsd dsdVar = this.b;
            fdae fdaeVar = new fdae() { // from class: drz
                @Override // defpackage.fdae
                public final Object invoke() {
                    return dsdVar.k();
                }
            };
            dsa dsaVar = new dsa(this.c, dsdVar, null);
            this.a = 1;
            if (dro.b(fdaeVar, dsaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        dsd dsdVar2 = this.b;
        Object objB = dsdVar2.k().b(dsdVar2.a());
        if (objB != null) {
            if (Math.abs(dsdVar2.a() - dsdVar2.k().a(objB)) < 0.5f) {
                ((Boolean) dsdVar2.a.invoke(objB)).booleanValue();
                dsdVar2.j(objB);
                dsdVar2.h(objB);
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dsb(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
