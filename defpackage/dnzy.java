package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ doaa b;
    final /* synthetic */ dnyz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzy(doaa doaaVar, dnyz dnyzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doaaVar;
        this.c = dnyzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                doam doamVarA = this.b.a();
                String str = this.c.a;
                this.a = 1;
                if (doamVarA.e(str, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (IllegalStateException e) {
            ((ekrd) ((ekrd) doaa.a.i()).g(e).h("com/google/android/libraries/compose/gif/ui/screen/GifScreen$registerMediaUsage$1", "invokeSuspend", 61, "GifScreen.kt")).p(e);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzy(this.b, this.c, fcxyVar);
    }
}
