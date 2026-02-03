package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgok extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgok(fcxy fcxyVar, dgom dgomVar, Object obj) {
        super(2, fcxyVar);
        this.b = dgomVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgok) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            Object obj2 = this.c;
            this.a = 1;
            if (dgomVar.h(obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dgok dgokVar = new dgok(fcxyVar, this.b, this.c);
        dgokVar.d = obj;
        return dgokVar;
    }
}
