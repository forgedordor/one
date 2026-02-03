package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awxv extends fcyz implements fdat {
    int a;
    final /* synthetic */ awyb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxv(awyb awybVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awybVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awxv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        basj basjVar = basj.DISABLED;
        return basjVar == fcylVar ? fcylVar : basjVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awxv(this.b, fcxyVar);
    }
}
