package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yln extends fcyz implements fdat {
    /* synthetic */ Object a;

    public yln(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yln) c((xuy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        evxw evxwVar;
        fctl.b(obj);
        xuy xuyVar = (xuy) this.a;
        if (xuyVar == null || (evxwVar = xuyVar.a) == null || (evxwVar.b & 1) == 0) {
            return null;
        }
        evxl evxlVar = evxwVar.c;
        return evxlVar == null ? evxl.a : evxlVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        yln ylnVar = new yln(fcxyVar);
        ylnVar.a = obj;
        return ylnVar;
    }
}
