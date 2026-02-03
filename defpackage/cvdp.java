package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvdp extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvdq b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdp(cvdq cvdqVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvdqVar;
        this.c = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csjm csjmVar = (csjm) this.b.c.b();
            boolean zBooleanValue = ((Boolean) this.c).booleanValue();
            this.a = 1;
            if (csjmVar.b(zBooleanValue, true, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvdp(this.b, this.c, fcxyVar);
    }
}
