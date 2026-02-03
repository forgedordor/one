package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aakl extends fcyz implements fdat {
    int a;
    final /* synthetic */ aako b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakl(aako aakoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aakoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aakl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aako aakoVar = this.b;
            fdap fdapVar = new fdap() { // from class: aakk
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    aagv aagvVar = (aagv) obj2;
                    aagvVar.copyOnWrite();
                    aagw aagwVar = (aagw) aagvVar.instance;
                    aagw aagwVar2 = aagw.a;
                    aagwVar.b = true;
                    return fctx.a;
                }
            };
            this.a = 1;
            if (crrj.b(aakoVar.b, fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aakl(this.b, fcxyVar);
    }
}
