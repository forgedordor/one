package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvs extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxvt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxvs(dxvt dxvtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxvtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxvs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dxvt dxvtVar = this.b;
        this.a = 1;
        Object objA = dxvtVar.b.a.a(evjz.COLLABORATOR_API_CALL, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxvs(this.b, fcxyVar);
    }
}
