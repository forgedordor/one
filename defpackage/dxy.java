package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxy extends fcyz implements fdat {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ dxz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxy(dxz dxzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dxzVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxy) c(new ihs(((ihs) obj).a), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        dxz dxzVar = this.c;
        this.a = 1;
        Object objA = dxk.a(dxzVar.b, j, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxy dxyVar = new dxy(this.c, fcxyVar);
        dxyVar.b = ((ihs) obj).a;
        return dxyVar;
    }
}
