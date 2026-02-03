package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avfo extends fcyz implements fdat {
    int a;
    final /* synthetic */ avgc b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfo(fcxy fcxyVar, avgc avgcVar, List list) {
        super(2, fcxyVar);
        this.b = avgcVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objW = avgcVar.w(list, this);
        return objW == fcylVar ? fcylVar : objW;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfo avfoVar = new avfo(fcxyVar, this.b, this.c);
        avfoVar.d = obj;
        return avfoVar;
    }
}
