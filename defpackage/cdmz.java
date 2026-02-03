package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdnb b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmz(fcxy fcxyVar, cdnb cdnbVar, int i) {
        super(2, fcxyVar);
        this.b = cdnbVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cdnb cdnbVar = this.b;
        cdna cdnaVar = new cdna(cdnbVar, this.c);
        this.a = 1;
        Object objD = cdnbVar.b.d(cdnaVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdmz cdmzVar = new cdmz(fcxyVar, this.b, this.c);
        cdmzVar.d = obj;
        return cdmzVar;
    }
}
