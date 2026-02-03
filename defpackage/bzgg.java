package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgg extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzgt c;
    final /* synthetic */ bnar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgg(bzgt bzgtVar, bnar bnarVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = bzgtVar;
        this.d = bnarVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bzgg bzggVar = new bzgg(this.c, this.d, (fcxy) obj3);
        bzggVar.b = (bzaw) obj2;
        return bzggVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        bzgt bzgtVar = this.c;
        Object obj3 = ((bzaw) obj2).a;
        bnar bnarVar = this.d;
        this.a = 1;
        Object objB = bzgtVar.f.b(obj3, bnarVar, true, bzbd.a, this);
        return objB == fcylVar ? fcylVar : objB;
    }
}
