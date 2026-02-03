package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekf extends fcyz implements fdat {
    int a;
    final /* synthetic */ fekg b;
    final /* synthetic */ fdae c;
    final /* synthetic */ dofb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fekf(fekg fekgVar, fdae fdaeVar, dofb dofbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fekgVar;
        this.c = fdaeVar;
        this.d = dofbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fekf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fekg fekgVar = this.b;
            dofb dofbVar = this.d;
            fcyh fcyhVarA = eicg.a(fekgVar.b);
            fekc fekcVar = new fekc(null, dofbVar);
            this.a = 1;
            obj = fdin.a(fcyhVarA, fekcVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((doec) obj) != null) {
            this.c.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fekf(this.b, this.c, this.d, fcxyVar);
    }
}
