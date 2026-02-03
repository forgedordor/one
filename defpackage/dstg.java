package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsth b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dstg(dsth dsthVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsthVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dstg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dsth dsthVar = this.b;
        this.a = 1;
        Object objC = dsthVar.a.c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dstg(this.b, this.c, fcxyVar);
    }
}
