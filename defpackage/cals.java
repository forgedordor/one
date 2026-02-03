package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cals extends fcyz implements fdat {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ calt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cals(fcxy fcxyVar, Object obj, calt caltVar) {
        super(2, fcxyVar);
        this.b = obj;
        this.c = caltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cals) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Throwable th;
        Object objA;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th2) {
                th = th2;
                objA = fctl.a(th);
                return new fcti(obj2, new fctk(objA));
            }
        } else {
            fctl.b(obj);
            Object obj3 = this.b;
            try {
                eiju eijuVarD = this.c.j.d(obj3);
                eijuVarD.getClass();
                this.d = obj3;
                this.a = 1;
                Object objC = fdxs.c(eijuVarD, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                obj2 = obj3;
                obj = objC;
            } catch (Throwable th3) {
                obj2 = obj3;
                th = th3;
                objA = fctl.a(th);
                return new fcti(obj2, new fctk(objA));
            }
        }
        objA = (Void) obj;
        return new fcti(obj2, new fctk(objA));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cals calsVar = new cals(fcxyVar, this.b, this.c);
        calsVar.d = obj;
        return calsVar;
    }
}
