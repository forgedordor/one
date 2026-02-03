package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxh extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ sxk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxh(sxk sxkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = sxkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        sxh sxhVar = new sxh(this.c, (fcxy) obj3);
        sxhVar.d = (sxp) obj;
        sxhVar.b = (cayy) obj2;
        return sxhVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        sxk sxkVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object objA = sxkVar.a((sxp) obj2, r1, this);
        return objA == fcylVar ? fcylVar : objA;
    }
}
