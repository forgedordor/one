package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxmc extends fcyz implements fdat {
    final /* synthetic */ dxmj a;
    final /* synthetic */ dxly b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxmc(dxmj dxmjVar, dxly dxlyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dxmjVar;
        this.b = dxlyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxmc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        dxlz dxlzVarF;
        fctl.b(obj);
        dxmj dxmjVar = this.a;
        dxly dxlyVar = this.b;
        try {
            try {
                synchronized (dxmjVar.d) {
                    dxmjVar.j(dxmjVar.g(dxlyVar));
                    dxlzVarF = dxmjVar.f(dxlyVar);
                    dxmj.a.o().I("Refreshed oauth token for [%s, %s] expiration %s", dxlyVar.a, dxlyVar.b, dxlzVarF.c);
                }
                Map map = dxmjVar.f;
                synchronized (map) {
                }
                objA = dxlzVarF;
            } catch (Throwable th) {
                Map map2 = dxmjVar.f;
                synchronized (map2) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            objA = fctl.a(th2);
        }
        return new fctk(objA);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxmc dxmcVar = new dxmc(this.a, this.b, fcxyVar);
        dxmcVar.c = obj;
        return dxmcVar;
    }
}
