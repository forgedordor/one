package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dve extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ dvh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dve(fdat fdatVar, dvh dvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = dvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dve) c((duv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final duv duvVar = (duv) this.d;
            fdat fdatVar = this.b;
            final dvh dvhVar = this.c;
            fdap fdapVar = new fdap() { // from class: dvd
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    long j = ((dtf) obj2).a;
                    dvh dvhVar2 = dvhVar;
                    long jF = ihs.f(j, true != dvhVar2.m ? 1.0f : -1.0f);
                    dwm dwmVar = dvhVar2.b;
                    fdau fdauVar = dvc.a;
                    duvVar.a(Float.intBitsToFloat((int) (dwmVar == dwm.a ? jF & 4294967295L : jF >> 32)));
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdatVar.a(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dve dveVar = new dve(this.b, this.c, fcxyVar);
        dveVar.d = obj;
        return dveVar;
    }
}
