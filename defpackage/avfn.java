package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfn extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfn(fcxy fcxyVar, avgc avgcVar, List list) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        avgc avgcVar = this.b;
        List list = this.c;
        this.a = 1;
        Object objU = avgcVar.u(list, this);
        return objU == fcylVar ? fcylVar : objU;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfn avfnVar = new avfn(fcxyVar, this.b, this.c);
        avfnVar.d = obj;
        return avfnVar;
    }
}
