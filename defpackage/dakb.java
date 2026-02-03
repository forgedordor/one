package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dakb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dakb(fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dakb) c((hps) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Exception e;
        Object dajxVar;
        Object obj3;
        Object obj4;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj5 = this.a;
            obj2 = (hps) this.d;
            try {
                fctl.b(obj);
                obj4 = obj5;
            } catch (Exception e2) {
                e = e2;
                dajxVar = new dajx(e);
                obj3 = obj2;
                ((hps) obj3).b(dajxVar);
                return fctx.a;
            }
        } else {
            fctl.b(obj);
            Object obj6 = (hps) this.d;
            try {
                fdap fdapVar = this.c;
                this.d = obj6;
                this.a = obj6;
                this.b = 1;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke == fcylVar) {
                    return fcylVar;
                }
                Object obj7 = obj6;
                obj = objInvoke;
                obj2 = obj7;
                obj4 = obj7;
            } catch (Exception e3) {
                obj2 = obj6;
                e = e3;
                dajxVar = new dajx(e);
                obj3 = obj2;
                ((hps) obj3).b(dajxVar);
                return fctx.a;
            }
        }
        dajxVar = new dajz(obj);
        obj3 = obj4;
        ((hps) obj3).b(dajxVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dakb dakbVar = new dakb(this.c, fcxyVar);
        dakbVar.d = obj;
        return dakbVar;
    }
}
