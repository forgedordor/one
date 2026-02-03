package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvwo b;
    final /* synthetic */ aoer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwn(cvwo cvwoVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvwoVar;
        this.c = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvwo cvwoVar = this.b;
            eiju eijuVarX = cvwoVar.d.x(cvwoVar.c, this.c);
            eijuVarX.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarX, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvwn(this.b, this.c, fcxyVar);
    }
}
