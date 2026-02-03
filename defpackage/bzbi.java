package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbi extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ bzbx d;
    final /* synthetic */ bzbz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbi(bzbx bzbxVar, bzbz bzbzVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = bzbxVar;
        this.e = bzbzVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((fctk) obj2).a;
        bzbi bzbiVar = new bzbi(this.d, this.e, (fcxy) obj3);
        bzbiVar.b = (String) obj;
        bzbiVar.c = new fctk(obj4);
        return bzbiVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objM;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objM = ((fctk) obj).a;
        } else {
            Object obj2 = this.b;
            Object obj3 = ((fctk) this.c).a;
            bzbx bzbxVar = this.d;
            String str = (String) obj2;
            bzbz.a(this.e, str, null, 6);
            this.b = null;
            this.a = 1;
            objM = bzbxVar.m(obj3, str, this);
            if (objM == fcylVar) {
                return fcylVar;
            }
        }
        return new fctk(objM);
    }
}
