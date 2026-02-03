package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgti extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgti(fcxy fcxyVar, cgum cgumVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgti) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVarB = this.b.d.b();
            this.a = 1;
            obj = fdtc.a(fdplVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        String str = ((cgtd) obj).g;
        str.getClass();
        if (fdgn.H(str)) {
            return null;
        }
        return str;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cgti cgtiVar = new cgti(fcxyVar, this.b);
        cgtiVar.c = obj;
        return cgtiVar;
    }
}
