package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adff extends fcyz implements fdat {
    int a;
    final /* synthetic */ adfk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adff(fcxy fcxyVar, adfk adfkVar) {
        super(2, fcxyVar);
        this.b = adfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        adfk adfkVar = this.b;
        cczv cczvVar = cgwx.a;
        Object objE = cgwx.d.e();
        objE.getClass();
        final int iIntValue = ((Number) objE).intValue();
        this.a = 1;
        Object objA = crrj.a(adfkVar.d.a, new fdap() { // from class: adhr
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                adhn adhnVar = (adhn) obj2;
                adhnVar.getClass();
                boolean z = true;
                if (adhnVar.c < iIntValue && !adhnVar.d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        adff adffVar = new adff(fcxyVar, this.b);
        adffVar.c = obj;
        return adffVar;
    }
}
