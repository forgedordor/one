package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acdn extends fcyz implements fdat {
    int a;
    final /* synthetic */ dayp b;
    final /* synthetic */ acec c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acdn(dayp daypVar, acec acecVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = daypVar;
        this.c = acecVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acdn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dayp daypVar = this.b;
            acdm acdmVar = new acdm(this.c);
            this.a = 1;
            if (fdum.g((fdum) daypVar.g, acdmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acdn(this.b, this.c, fcxyVar);
    }
}
