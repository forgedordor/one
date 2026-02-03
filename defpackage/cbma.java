package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbma extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbmh b;
    final /* synthetic */ String c;
    final /* synthetic */ cblu d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbma(fcxy fcxyVar, cbmh cbmhVar, String str, cblu cbluVar) {
        super(2, fcxyVar);
        this.b = cbmhVar;
        this.c = str;
        this.d = cbluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbma) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbmh cbmhVar = this.b;
            String str = this.c;
            cblu cbluVar = this.d;
            this.a = 1;
            if (cbmhVar.c(str, cbluVar, this) != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        cbmh cbmhVar2 = this.b;
        String str2 = this.c;
        this.a = 2;
        Object objA = cbmhVar2.a(str2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbma cbmaVar = new cbma(fcxyVar, this.b, this.c, this.d);
        cbmaVar.e = obj;
        return cbmaVar;
    }
}
