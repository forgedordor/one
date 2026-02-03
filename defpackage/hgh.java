package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdav c;
    final /* synthetic */ hgn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgh(fdav fdavVar, hgn hgnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdavVar;
        this.d = hgnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hgh) c((fcti) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fcti fctiVar = (fcti) this.b;
            hjj hjjVar = (hjj) fctiVar.a;
            Object obj2 = fctiVar.b;
            fdav fdavVar = this.c;
            hgn hgnVar = this.d;
            this.a = 1;
            if (fdavVar.a(hgnVar.h, hjjVar, obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hgh hghVar = new hgh(this.c, this.d, fcxyVar);
        hghVar.b = obj;
        return hghVar;
    }
}
