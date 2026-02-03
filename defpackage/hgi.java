package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgi extends fcyz implements fdap {
    int a;
    final /* synthetic */ hgn b;
    final /* synthetic */ Object c;
    final /* synthetic */ fdav d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(hgn hgnVar, Object obj, fdav fdavVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = hgnVar;
        this.c = obj;
        this.d = fdavVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final hgn hgnVar = this.b;
            hgnVar.m(this.c);
            fdae fdaeVar = new fdae() { // from class: hgg
                @Override // defpackage.fdae
                public final Object invoke() {
                    hgn hgnVar2 = hgnVar;
                    return new fcti(hgnVar2.p(), hgnVar2.j());
                }
            };
            hgh hghVar = new hgh(this.d, hgnVar, null);
            this.a = 1;
            if (hfw.c(fdaeVar, hghVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new hgi(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
