package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzfh extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ fdau d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfh(fdau fdauVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = fdauVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((fctk) obj2).a;
        bzfh bzfhVar = new bzfh(this.d, (fcxy) obj3);
        bzfhVar.b = obj;
        bzfhVar.c = new fctk(obj4);
        return bzfhVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
        } catch (Throwable th) {
            obj = fctl.a(th);
        }
        if (this.a != 0) {
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Object obj2 = this.b;
            Object obj3 = ((fctk) this.c).a;
            fdau fdauVar = this.d;
            if (!fctk.d(obj3)) {
                obj = obj3;
                return new fctk(obj);
            }
            this.b = null;
            this.a = 1;
            obj = fdauVar.a(obj2, obj3, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new fctk(obj);
    }
}
