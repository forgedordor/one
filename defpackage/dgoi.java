package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoi(fcxy fcxyVar, dgom dgomVar) {
        super(2, fcxyVar);
        this.b = dgomVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            this.a = 1;
            if (dgomVar.g(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgoi dgoiVar = new dgoi(fcxyVar, this.b);
        dgoiVar.c = obj;
        return dgoiVar;
    }
}
