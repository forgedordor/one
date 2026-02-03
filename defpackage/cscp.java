package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscp extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdkf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscp(fcxy fcxyVar, fdkf fdkfVar) {
        super(2, fcxyVar);
        this.b = fdkfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVar = this.b;
            this.a = 1;
            obj = fdkfVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        csoc csocVar = (csoc) obj;
        if (csocVar != null) {
            return csocVar.d();
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cscp cscpVar = new cscp(fcxyVar, this.b);
        cscpVar.c = obj;
        return cscpVar;
    }
}
