package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqw extends fcyz implements fdat {
    int a;
    final /* synthetic */ afrd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqw(afrd afrdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afrdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            afrd afrdVar = this.b;
            fdpl fdplVarA = fdqq.a(new afqv(new afqs(afrdVar.c.a)));
            afqp afqpVar = new afqp(afrdVar);
            this.a = 1;
            if (fdplVarA.a(afqpVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afqw(this.b, fcxyVar);
    }
}
