package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhx extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public vhx(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vhx vhxVar = new vhx((fcxy) obj3);
        vhxVar.c = (fdpm) obj;
        vhxVar.b = obj2;
        return vhxVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.c;
            fdpl fdplVar = (fdpl) this.b;
            this.a = 1;
            if (fdpy.c(r4, fdplVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
