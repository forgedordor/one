package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvfh extends fcyz implements fdat {
    boolean a;
    int b;
    final /* synthetic */ cvfm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvfh(cvfm cvfmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cvfmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cvfm cvfmVar = this.c;
            boolean zB = ((crxn) cvfmVar.g.b()).b();
            csei cseiVar = (csei) cvfmVar.f.b();
            this.a = zB;
            this.b = 1;
            obj = cseiVar.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = zB;
        }
        return new cvfg(z, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvfh(this.c, fcxyVar);
    }
}
