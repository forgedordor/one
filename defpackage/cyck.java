package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyck extends fcyz implements fdat {
    int a;
    final /* synthetic */ cycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyck(fcxy fcxyVar, cycn cycnVar) {
        super(2, fcxyVar);
        this.b = cycnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyck) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
                return "Success";
            }
            fctl.b(obj);
            auso ausoVar = this.b.a;
            this.a = 1;
            return ausoVar.d(this) == fcylVar ? fcylVar : "Success";
        } catch (Exception e) {
            e.toString();
            return "Failed. ".concat(e.toString());
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cyck cyckVar = new cyck(fcxyVar, this.b);
        cyckVar.c = obj;
        return cyckVar;
    }
}
