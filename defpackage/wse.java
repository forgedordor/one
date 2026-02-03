package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wse extends fcyz implements fdat {
    int a;
    final /* synthetic */ wsf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wse(fcxy fcxyVar, wsf wsfVar) {
        super(2, fcxyVar);
        this.b = wsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wse) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wsf wsfVar = this.b;
            this.a = 1;
            if (wsfVar.a(null, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wse wseVar = new wse(fcxyVar, this.b);
        wseVar.c = obj;
        return wseVar;
    }
}
