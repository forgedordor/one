package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aais extends fcyz implements fdat {
    int a;
    final /* synthetic */ aaiu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aais(aaiu aaiuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aaiuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aais) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final aaiu aaiuVar = this.b;
            fdap fdapVar = new fdap() { // from class: aair
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    aain aainVar = (aain) obj2;
                    long epochMilli = aaiuVar.c.f().toEpochMilli();
                    aainVar.copyOnWrite();
                    aaio aaioVar = (aaio) aainVar.instance;
                    aaio aaioVar2 = aaio.a;
                    aaioVar.c = epochMilli;
                    return fctx.a;
                }
            };
            this.a = 1;
            if (crrj.b(aaiuVar.b, fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aais(this.b, fcxyVar);
    }
}
