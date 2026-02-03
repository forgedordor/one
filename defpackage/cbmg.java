package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbmg extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdkf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbmg(fcxy fcxyVar, fdkf fdkfVar) {
        super(2, fcxyVar);
        this.b = fdkfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbmg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVar = this.b;
            if (fdkfVar == null) {
                return null;
            }
            this.a = 1;
            if (fdkfVar.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbmg cbmgVar = new cbmg(fcxyVar, this.b);
        cbmgVar.c = obj;
        return cbmgVar;
    }
}
