package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeas extends fcyz implements fdat {
    int a;
    final /* synthetic */ gun b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeas(gun gunVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gunVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eeas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gun gunVar = this.b;
            String str = this.c;
            this.a = 1;
            if (gunVar.c(str, null, false, 3, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eeas(this.b, this.c, fcxyVar);
    }
}
