package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxs extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ vzk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxs(fcxy fcxyVar, vzk vzkVar) {
        super(3, fcxyVar);
        this.c = vzkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vxs vxsVar = new vxs((fcxy) obj3, this.c);
        vxsVar.d = (fdpm) obj;
        vxsVar.b = obj2;
        return vxsVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            fdpl fdplVarB = vzk.b((vzv) this.b, this.c.j);
            this.a = 1;
            if (fdpy.c(r4, fdplVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
