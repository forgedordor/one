package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atgu extends fcyz implements fdat {
    int a;
    final /* synthetic */ atgy b;
    final /* synthetic */ athh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgu(atgy atgyVar, athh athhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atgyVar;
        this.c = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            atgy atgyVar = this.b;
            athh athhVar = this.c;
            this.a = 1;
            if (atgyVar.a.a(athhVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atgu(this.b, this.c, fcxyVar);
    }
}
