package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayd extends fcyz implements fdat {
    int a;
    final /* synthetic */ daym b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayd(daym daymVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daymVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            daym daymVar = this.b;
            fdvc fdvcVarA = daymVar.b.a();
            dayc daycVar = new dayc(daymVar);
            this.a = 1;
            if (fdvcVarA.a(daycVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dayd(this.b, fcxyVar);
    }
}
