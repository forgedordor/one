package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csht extends fcyz implements fdat {
    int a;
    final /* synthetic */ cshv b;
    final /* synthetic */ cshx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csht(fcxy fcxyVar, cshv cshvVar, cshx cshxVar) {
        super(2, fcxyVar);
        this.b = cshvVar;
        this.c = cshxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csht) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dhor dhorVar = (dhor) this.b.a.b();
        cshx cshxVar = this.c;
        this.a = 1;
        Object objA = dhorVar.a(cshxVar.c, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csht cshtVar = new csht(fcxyVar, this.b, this.c);
        cshtVar.d = obj;
        return cshtVar;
    }
}
