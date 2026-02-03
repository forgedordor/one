package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfh extends fcyz implements fdat {
    int a;
    final /* synthetic */ adfk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adfh(fcxy fcxyVar, adfk adfkVar) {
        super(2, fcxyVar);
        this.b = adfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            adfk adfkVar = this.b;
            this.a = 1;
            Object objB = crrj.b(adfkVar.d.a, new fdap() { // from class: adhq
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    adhm adhmVar = (adhm) obj3;
                    int i2 = ((adhn) adhmVar.instance).c + 1;
                    adhmVar.copyOnWrite();
                    adhn adhnVar = (adhn) adhmVar.instance;
                    adhnVar.b |= 1;
                    adhnVar.c = i2;
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
        adfh adfhVar = new adfh(fcxyVar, this.b);
        adfhVar.c = obj;
        return adfhVar;
    }
}
