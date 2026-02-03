package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dss b;
    final /* synthetic */ dzx c;
    final /* synthetic */ dsj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsr(dss dssVar, dzx dzxVar, dsj dsjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dssVar;
        this.c = dzxVar;
        this.d = dsjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            try {
                if (this.a != 0) {
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    fdlr fdlrVarC = fdlw.c(((fdjx) this.e).hE());
                    dss dssVar = this.b;
                    dssVar.j = true;
                    dyk dykVar = dssVar.b;
                    dod dodVar = dod.a;
                    dsq dsqVar = new dsq(this.c, dssVar, this.d, fdlrVarC, null);
                    this.a = 1;
                    if (dykVar.i(dodVar, dsqVar, this) == fcylVar) {
                        return fcylVar;
                    }
                }
                hum humVar = this.b.e.a;
                fddq fddqVarR = fddu.r(0, humVar.b);
                int i = fddqVarR.a;
                int i2 = fddqVarR.b;
                if (i <= i2) {
                    while (true) {
                        ((dsn) humVar.a[i]).b.w(fctx.a);
                        if (i == i2) {
                            break;
                        }
                        i++;
                    }
                }
                humVar.g();
                dss dssVar2 = this.b;
                dssVar2.j = false;
                dssVar2.e.a(null);
                dssVar2.g = false;
                return fctx.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            dss dssVar3 = this.b;
            dssVar3.j = false;
            dssVar3.e.a(null);
            dssVar3.g = false;
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dsr dsrVar = new dsr(this.b, this.c, this.d, fcxyVar);
        dsrVar.e = obj;
        return dsrVar;
    }
}
