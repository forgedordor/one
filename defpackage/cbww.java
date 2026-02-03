package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbww extends fcyz implements fdat {
    final /* synthetic */ cbyh a;
    final /* synthetic */ ccep b;
    final /* synthetic */ List c;
    final /* synthetic */ enba d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbww(fcxy fcxyVar, cbyh cbyhVar, ccep ccepVar, List list, enba enbaVar) {
        super(2, fcxyVar);
        this.a = cbyhVar;
        this.b = ccepVar;
        this.c = list;
        this.d = enbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbww) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.c.b(this.b, this.c, this.d);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbww cbwwVar = new cbww(fcxyVar, this.a, this.b, this.c, this.d);
        cbwwVar.e = obj;
        return cbwwVar;
    }
}
