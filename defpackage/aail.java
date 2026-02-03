package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aail extends fcyz implements fdat {
    int a;
    final /* synthetic */ aaim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aail(aaim aaimVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aaimVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aail) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aaim aaimVar = this.b;
            this.a = 1;
            final aaiu aaiuVar = aaimVar.b;
            Object objB = crrj.b(aaiuVar.b, new fdap() { // from class: aaip
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    aain aainVar = (aain) obj3;
                    int i2 = ((aaio) aainVar.instance).b + 1;
                    aainVar.copyOnWrite();
                    ((aaio) aainVar.instance).b = i2;
                    long epochMilli = aaiuVar.c.f().toEpochMilli();
                    aainVar.copyOnWrite();
                    ((aaio) aainVar.instance).c = epochMilli;
                    return fctx.a;
                }
            }, this);
            if (objB != obj2) {
                objB = fctx.a;
            }
            if (objB == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aail(this.b, fcxyVar);
    }
}
