package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgof extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgof(fcxy fcxyVar, dgom dgomVar, Object obj, Object obj2) {
        super(2, fcxyVar);
        this.b = dgomVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgof) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            Object obj2 = this.c;
            Object obj3 = this.d;
            this.a = 1;
            if (dgomVar.q(obj2, obj3) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgof dgofVar = new dgof(fcxyVar, this.b, this.c, this.d);
        dgofVar.e = obj;
        return dgofVar;
    }
}
