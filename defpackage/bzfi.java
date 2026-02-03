package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzfi extends fcyz implements fdat {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ fcuq c;
    final /* synthetic */ fdau d;
    final /* synthetic */ Map e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzfi(fcxy fcxyVar, int i, fcuq fcuqVar, fdau fdauVar, Map map) {
        super(2, fcxyVar);
        this.b = i;
        this.c = fcuqVar;
        this.d = fdauVar;
        this.e = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzfi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fcyh fcyhVarA = eicg.a(new fdjw("OperateResultsIndividuallyAsync-" + this.b));
        bzfj bzfjVar = new bzfj(null, this.c, this.d, this.e);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, bzfjVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzfi bzfiVar = new bzfi(fcxyVar, this.b, this.c, this.d, this.e);
        bzfiVar.f = obj;
        return bzfiVar;
    }
}
