package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cecw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cedc b;
    final /* synthetic */ efwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cecw(cedc cedcVar, efwo efwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cedcVar;
        this.c = efwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cecw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cedc cedcVar = this.b;
            efwo efwoVar = this.c;
            this.a = 1;
            if (cedcVar.a(efwoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cecw(this.b, this.c, fcxyVar);
    }
}
