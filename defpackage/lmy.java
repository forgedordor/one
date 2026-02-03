package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lmy extends fcyz implements fdau {
    int a;
    private /* synthetic */ Object b;

    public lmy(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        lmy lmyVar = new lmy((fcxy) obj3);
        lmyVar.b = (lml) obj;
        return lmyVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lml] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ?? r3 = this.b;
        this.a = 1;
        Object objB = r3.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }
}
