package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpag extends fcyz implements fdat {
    int a;
    final /* synthetic */ doyt b;
    final /* synthetic */ dpao c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpag(doyt doytVar, dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doytVar;
        this.c = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpag) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                doyt doytVar = this.b;
                if (doytVar.b instanceof doar) {
                    doam doamVarBm = this.c.bm();
                    String str = doytVar.a;
                    this.a = 1;
                    if (doamVarBm.e(str, this) == fcylVar) {
                        return fcylVar;
                    }
                }
            }
        } catch (IllegalStateException e) {
            ((ekrd) ((ekrd) dpao.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$registerMediaUsage$1", "invokeSuspend", 236, "StickerScreen.kt")).p(e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpag(this.b, this.c, fcxyVar);
    }
}
