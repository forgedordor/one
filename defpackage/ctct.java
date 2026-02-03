package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctct extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctdg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctct(fcxy fcxyVar, ctdg ctdgVar) {
        super(2, fcxyVar);
        this.b = ctdgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctct) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctdg ctdgVar = this.b;
            this.a = 1;
            obj = ctdgVar.a.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        evtg evtgVar = ((ctcl) obj).i;
        evtgVar.getClass();
        return ekfv.f(evtgVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctct ctctVar = new ctct(fcxyVar, this.b);
        ctctVar.c = obj;
        return ctctVar;
    }
}
