package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class whv extends fcyz implements fdat {
    int a;
    final /* synthetic */ wiq b;
    final /* synthetic */ vvp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whv(wiq wiqVar, vvp vvpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wiqVar;
        this.c = vvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((whv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wiq wiqVar = this.b;
            vvp vvpVar = this.c;
            this.a = 1;
            if (wiqVar.b(vvpVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new whv(this.b, this.c, fcxyVar);
    }
}
