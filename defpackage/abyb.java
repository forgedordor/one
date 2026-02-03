package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abyb extends fcyz implements fdat {
    int a;
    final /* synthetic */ abyd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyb(abyd abydVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abydVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abyb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarA = this.b.a.a();
            this.a = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abyb(this.b, fcxyVar);
    }
}
