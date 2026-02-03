package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gai extends fcyz implements fdat {
    int a;
    final /* synthetic */ gsp b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gai(gsp gspVar, float f, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gspVar;
        this.c = f;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gai) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gsp gspVar = this.b;
            float f = this.c;
            this.a = 1;
            if (gspVar.h(f, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gai(this.b, this.c, fcxyVar);
    }
}
