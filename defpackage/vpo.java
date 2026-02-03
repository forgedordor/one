package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vpo extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ vpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpo(vpp vppVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = vppVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vpo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fduf fdufVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            fdufVar = obj2;
        } else {
            fctl.b(obj);
            vpp vppVar = this.c;
            csyj csyjVar = (csyj) vppVar.c.b();
            fduf fdufVar2 = vppVar.m;
            this.a = fdufVar2;
            this.b = 1;
            Object objD = csyjVar.d(this);
            if (objD == fcylVar) {
                return fcylVar;
            }
            fdufVar = fdufVar2;
            obj = objD;
        }
        fdufVar.f(obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vpo(this.c, fcxyVar);
    }
}
