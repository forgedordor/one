package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxz extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public dlxz(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dlxz dlxzVar = new dlxz((fcxy) obj3);
        dlxzVar.c = (fdpm) obj;
        dlxzVar.b = obj2;
        return dlxzVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdpm fdpmVar = (fdpm) this.c;
            Object obj3 = this.b;
            this.c = obj3;
            this.a = 1;
            if (fdpmVar.fO(obj3, this) == fcylVar) {
                return fcylVar;
            }
            obj2 = obj3;
        }
        return Boolean.valueOf(!(((dlyp) obj2) instanceof dlyn));
    }
}
