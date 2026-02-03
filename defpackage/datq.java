package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class datq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dayp b;
    final /* synthetic */ daua c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public datq(dayp daypVar, daua dauaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daypVar;
        this.c = dauaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((datq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dayp daypVar = this.b;
            datp datpVar = new datp(this.c);
            this.a = 1;
            if (fdum.g((fdum) daypVar.g, datpVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new datq(this.b, this.c, fcxyVar);
    }
}
