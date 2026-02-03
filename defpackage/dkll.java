package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkll extends fcyz implements fdat {
    final /* synthetic */ dklv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkll(dklv dklvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dklvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkll) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdae fdaeVar = this.a.c;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkll(this.a, fcxyVar);
    }
}
