package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class woz extends fcyz implements fdat {
    int a;
    final /* synthetic */ wpa b;
    final /* synthetic */ vvp c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woz(fcxy fcxyVar, wpa wpaVar, vvp vvpVar) {
        super(2, fcxyVar);
        this.b = wpaVar;
        this.c = vvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((woz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        wpa wpaVar = this.b;
        vvo vvoVar = (vvo) this.c;
        this.a = 1;
        wov wovVar = wpaVar.b;
        Object objA = fdin.a(eicg.a(wovVar.b), new wot(null, vvoVar, wovVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        woz wozVar = new woz(fcxyVar, this.b, this.c);
        wozVar.d = obj;
        return wozVar;
    }
}
