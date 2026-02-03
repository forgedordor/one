package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjc extends fcyz implements fdat {
    int a;
    final /* synthetic */ csjd b;
    final /* synthetic */ csch c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjc(fcxy fcxyVar, csjd csjdVar, csch cschVar) {
        super(2, fcxyVar);
        this.b = csjdVar;
        this.c = cschVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        csjd csjdVar = this.b;
        csch cschVar = this.c;
        this.a = 1;
        Object objA = csjdVar.a(cschVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csjc csjcVar = new csjc(fcxyVar, this.b, this.c);
        csjcVar.d = obj;
        return csjcVar;
    }
}
