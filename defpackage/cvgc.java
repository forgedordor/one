package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvgc extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvgs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvgc(cvgs cvgsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvgsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvgc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvgs cvgsVar = this.b;
            cvfx cvfxVar = cvfx.a;
            this.a = 1;
            if (cvgsVar.j.fO(cvfxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvgc(this.b, fcxyVar);
    }
}
