package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aojf extends fcyz implements fdat {
    int a;
    final /* synthetic */ aojk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aojf(aojk aojkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aojkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aojf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aojk aojkVar = this.b;
            this.a = 1;
            obj = aojkVar.c.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        aojk aojkVar2 = this.b;
        return aojkVar2.b.a(((ammv) obj).a);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aojf(this.b, fcxyVar);
    }
}
