package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmp extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dmng c;
    final /* synthetic */ fdci d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmp(dmng dmngVar, fdci fdciVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = dmngVar;
        this.d = fdciVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dmmp dmmpVar = new dmmp(this.c, this.d, (fcxy) obj3);
        dmmpVar.b = (Throwable) obj2;
        return dmmpVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            dmng dmngVar = this.c;
            dmlt dmltVar = new dmlt((Throwable) obj2);
            this.a = 1;
            if (dmngVar.k.fO(dmltVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdci fdciVar = this.d;
        if (((vum) fdciVar.a) != null) {
            fdciVar.a = null;
        }
        return fctx.a;
    }
}
