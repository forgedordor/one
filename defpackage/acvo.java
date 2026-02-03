package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acvo extends fcyz implements fdat {
    int a;
    final /* synthetic */ acvp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acvo(acvp acvpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acvo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Integer num;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            acve acveVar = (acve) fdct.b(this.b.a);
            if (acveVar != null) {
                this.a = 1;
                obj = acveVar.a(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                num = (Integer) obj;
            } else {
                num = null;
            }
        } else {
            num = (Integer) obj;
        }
        return Boolean.valueOf(num != null && num.intValue() == 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acvo(this.b, fcxyVar);
    }
}
