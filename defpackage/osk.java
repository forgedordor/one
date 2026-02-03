package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osk extends fcyz implements fdat {
    int a;
    private /* synthetic */ Object b;

    public osk(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((osk) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpm fdpmVar;
        owk owkVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            fdpmVar = (fdpm) this.b;
            owkVar = null;
        } else {
            if (i != 1) {
                fctl.b(obj);
                return fctx.a;
            }
            fdpmVar = (fdpm) this.b;
            fctl.b(obj);
            owkVar = (owk) obj;
        }
        Boolean boolValueOf = Boolean.valueOf(owkVar == owk.a);
        this.b = null;
        this.a = 2;
        if (fdpmVar.fO(boolValueOf, this) == fcylVar) {
            return fcylVar;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        osk oskVar = new osk(fcxyVar);
        oskVar.b = obj;
        return oskVar;
    }
}
