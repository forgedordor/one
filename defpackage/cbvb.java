package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbvb extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cbwd c;
    final /* synthetic */ List d;
    final /* synthetic */ evqs e;
    final /* synthetic */ enba f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbvb(cbwd cbwdVar, List list, evqs evqsVar, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cbwdVar;
        this.d = list;
        this.e = evqsVar;
        this.f = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbvb) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cbum cbumVar = (cbum) this.b;
        cbwd cbwdVar = this.c;
        List list = this.d;
        evqs evqsVar = this.e;
        enba enbaVar = this.f;
        this.a = 1;
        Object objM = cbumVar.m(cbwdVar, list, evqsVar, enbaVar, this);
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbvb cbvbVar = new cbvb(this.c, this.d, this.e, this.f, fcxyVar);
        cbvbVar.b = obj;
        return cbvbVar;
    }
}
