package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aczi extends fcyz implements fdat {
    int a;
    final /* synthetic */ acve b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczi(acve acveVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = acveVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            acve acveVar = this.b;
            this.a = 1;
            obj = acveVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Number) obj).intValue() <= 0) {
            this.b.b(1);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aczi(this.b, fcxyVar);
    }
}
