package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrb extends fcyz implements fdat {
    final /* synthetic */ String a;
    final /* synthetic */ afrd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrb(String str, afrd afrdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = str;
        this.b = afrdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afrb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final String str = this.a;
        if (str.length() == 0) {
            str = null;
        }
        this.b.c.c(new fdap() { // from class: afra
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return vvw.c((vvw) obj2, str, null, null, false, null, null, false, 1, null, 1790);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afrb(this.a, this.b, fcxyVar);
    }
}
