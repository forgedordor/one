package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbur extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ccep c;
    final /* synthetic */ List d;
    final /* synthetic */ enba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbur(ccep ccepVar, List list, enba enbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ccepVar;
        this.d = list;
        this.e = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbur) c((cbum) obj, (fcxy) obj2)).b(fctx.a);
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
        ccep ccepVar = this.c;
        List list = this.d;
        enba enbaVar = this.e;
        this.a = 1;
        Object objC = cbumVar.c(ccepVar, list, enbaVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbur cburVar = new cbur(this.c, this.d, this.e, fcxyVar);
        cburVar.b = obj;
        return cburVar;
    }
}
