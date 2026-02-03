package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hge extends fcyz implements fdap {
    int a;
    final /* synthetic */ hgn b;
    final /* synthetic */ fdau c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hge(hgn hgnVar, fdau fdauVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = hgnVar;
        this.c = fdauVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final hgn hgnVar = this.b;
            fdae fdaeVar = new fdae() { // from class: hgc
                @Override // defpackage.fdae
                public final Object invoke() {
                    return hgnVar.p();
                }
            };
            hgd hgdVar = new hgd(this.c, hgnVar, null);
            this.a = 1;
            if (hfw.c(fdaeVar, hgdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new hge(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
