package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvps extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public cvps(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvps) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        long jIntValue = ((Number) cvpw.a.e()).intValue();
        this.a = 1;
        if (fdkj.c(jIntValue, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvps cvpsVar = new cvps(fcxyVar);
        cvpsVar.b = obj;
        return cvpsVar;
    }
}
