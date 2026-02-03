package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fat extends fcyz implements fdat {
    int a;
    final /* synthetic */ isn b;
    final /* synthetic */ fbh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fat(isn isnVar, fbh fbhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = isnVar;
        this.c = fbhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            isn isnVar = this.b;
            final fbh fbhVar = this.c;
            this.a = 1;
            Object objH = duh.h(isnVar, new fdap() { // from class: fao
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    fbhVar.c(((ihs) obj3).a);
                    return fctx.a;
                }
            }, new fdae() { // from class: fap
                @Override // defpackage.fdae
                public final Object invoke() {
                    fbhVar.d();
                    return fctx.a;
                }
            }, new fdae() { // from class: faq
                @Override // defpackage.fdae
                public final Object invoke() {
                    fbhVar.a();
                    return fctx.a;
                }
            }, new fdat() { // from class: far
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    fbhVar.b(((ihs) obj4).a);
                    return fctx.a;
                }
            }, this);
            if (objH != obj2) {
                objH = fctx.a;
            }
            if (objH == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fat(this.b, this.c, fcxyVar);
    }
}
