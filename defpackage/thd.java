package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class thd extends fcyz implements fdat {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ ftn c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thd(ftn ftnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ftnVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((thd) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && this.b) {
            ftn ftnVar = this.c;
            String str = this.d;
            this.a = 1;
            if (ftnVar.b(str, 1, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        thd thdVar = new thd(this.c, this.d, fcxyVar);
        thdVar.b = ((Boolean) obj).booleanValue();
        return thdVar;
    }
}
