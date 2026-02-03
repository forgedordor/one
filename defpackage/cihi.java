package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cihi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cihj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cihi(cihj cihjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cihjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cihi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdjxVar = (fdjx) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjx fdjxVar2 = (fdjx) this.c;
            cihj cihjVar = this.b;
            this.c = fdjxVar2;
            this.a = 1;
            Object objC = cihjVar.c(this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            fdjxVar = fdjxVar2;
            obj = objC;
        }
        if (((Boolean) obj).booleanValue()) {
            cihs cihsVar = (cihs) this.b.a.b();
            caxr caxrVar = new caxr();
            Class<?> cls = fdjxVar.getClass();
            int i = fdcj.a;
            caxrVar.b = new fdbi(cls).c();
            ((cazj) cihsVar.a.b()).g(cbcu.g("group_icon_cleanup_handler", caxy.a, caxrVar.a()));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cihi cihiVar = new cihi(this.b, fcxyVar);
        cihiVar.c = obj;
        return cihiVar;
    }
}
