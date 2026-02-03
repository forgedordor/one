package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzpc extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzpg b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzpc(bzpg bzpgVar, String str, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzpgVar;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzpc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bzpg bzpgVar = this.b;
            String str = this.c;
            int i2 = this.d;
            this.a = 1;
            if (bzpgVar.h(str, i2, true, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzpc(this.b, this.c, this.d, fcxyVar);
    }
}
