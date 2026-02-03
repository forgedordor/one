package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osw extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ orr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osw(orr orrVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = orrVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        osw oswVar = new osw(this.c, (fcxy) obj3);
        oswVar.a = (oqg) obj;
        oswVar.b = (oqg) obj2;
        return oswVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        obj3.getClass();
        obj2.getClass();
        orr orrVar = this.c;
        orrVar.getClass();
        oqg oqgVar = (oqg) obj3;
        int i = oqgVar.a;
        oqg oqgVar2 = (oqg) obj2;
        int i2 = oqgVar2.a;
        return i > i2 ? true : i < i2 ? false : oqm.a(oqgVar.b, oqgVar2.b, orrVar) ? obj3 : obj2;
    }
}
