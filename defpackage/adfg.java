package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfg extends fcyz implements fdat {
    int a;
    final /* synthetic */ adfk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adfg(fcxy fcxyVar, adfk adfkVar) {
        super(2, fcxyVar);
        this.b = adfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adfg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            adfk adfkVar = this.b;
            this.a = 1;
            Object objB = crrj.b(adfkVar.d.a, new fdap() { // from class: adhp
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    adhm adhmVar = (adhm) obj3;
                    adhmVar.copyOnWrite();
                    adhn adhnVar = (adhn) adhmVar.instance;
                    adhn adhnVar2 = adhn.a;
                    adhnVar.b |= 2;
                    adhnVar.d = true;
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
        adfg adfgVar = new adfg(fcxyVar, this.b);
        adfgVar.c = obj;
        return adfgVar;
    }
}
