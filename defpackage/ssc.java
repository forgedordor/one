package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ssc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ssl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssc(ssl sslVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = sslVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ssc sscVar = new ssc(this.c, (fcxy) obj3);
        sscVar.d = (ssp) obj;
        sscVar.b = (cayy) obj2;
        return sscVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [cayy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.d;
        ?? r1 = this.b;
        ssl sslVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object objA = fdin.a(eicg.a(sslVar.a), new ssk(null, sslVar, r1, (ssp) obj2), this);
        return objA == fcylVar ? fcylVar : objA;
    }
}
