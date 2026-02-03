package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ceqg b;
    final /* synthetic */ ezvu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceqf(fcxy fcxyVar, ceqg ceqgVar, ezvu ezvuVar) {
        super(2, fcxyVar);
        this.b = ceqgVar;
        this.c = ezvuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceqf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ezws ezwsVar = (ezws) this.b.a.a(null, null);
        ezvu ezvuVar = this.c;
        this.a = 1;
        Object objC = ezwsVar.c(ezvuVar, new fbrg(), this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ceqf ceqfVar = new ceqf(fcxyVar, this.b, this.c);
        ceqfVar.d = obj;
        return ceqfVar;
    }
}
