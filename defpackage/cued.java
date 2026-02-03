package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cued extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cuef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cued(cuef cuefVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cuefVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cued) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        aoer aoerVar;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            cuef cuefVar = this.c;
            eiju eijuVarF = ((aofc) cuefVar.b.b()).f();
            this.a = cuefVar;
            this.b = 1;
            Object objC = fdxs.c(eijuVarF, this);
            if (objC != fcylVar) {
                obj2 = cuefVar;
                obj = objC;
            }
            return fcylVar;
        }
        if (i != 1) {
            obj3 = this.a;
            fctl.b(obj);
            obj.getClass();
            aoerVar = (aoer) fcva.P((List) obj);
            obj2 = obj3;
            ((cuef) obj2).d(aoerVar);
            return fctx.a;
        }
        obj2 = this.a;
        fctl.b(obj);
        obj.getClass();
        aoerVar = (aoer) fdct.b((Optional) obj);
        if (aoerVar == null) {
            eiju eijuVarB = ((aofc) this.c.b.b()).a().b();
            eijuVarB.getClass();
            this.a = obj2;
            this.b = 2;
            obj = fdxs.c(eijuVarB, this);
            if (obj != fcylVar) {
                obj3 = obj2;
                obj.getClass();
                aoerVar = (aoer) fcva.P((List) obj);
                obj2 = obj3;
            }
            return fcylVar;
        }
        ((cuef) obj2).d(aoerVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cued(this.c, fcxyVar);
    }
}
