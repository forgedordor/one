package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csoz extends fcyz implements fdat {
    int a;
    final /* synthetic */ cspf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csoz(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csoz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cspf cspfVar = this.b;
            this.a = 1;
            obj = cspfVar.h.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        bojh bojhVar = (bojh) obj;
        Integer num = bojhVar != null ? new Integer(bojhVar.k()) : null;
        if (num == null) {
            return false;
        }
        return Boolean.valueOf(bvdi.b(num.intValue()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csoz(this.b, fcxyVar);
    }
}
