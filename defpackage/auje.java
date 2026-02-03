package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auje extends fcyz implements fdat {
    int a;
    final /* synthetic */ aujf b;
    final /* synthetic */ aujk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auje(aujf aujfVar, aujk aujkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aujfVar;
        this.c = aujkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auje) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aujf aujfVar = this.b;
        aujk aujkVar = this.c;
        this.a = 1;
        Object objB = aujfVar.b(aujkVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auje(this.b, this.c, fcxyVar);
    }
}
