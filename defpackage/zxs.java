package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ zxa b;
    final /* synthetic */ gun c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zxs(zxa zxaVar, gun gunVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zxaVar;
        this.c = gunVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zxs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdtj fdtjVar = new fdtj(this.b.e);
            zxr zxrVar = new zxr(this.c);
            this.a = 1;
            if (fdtjVar.a(zxrVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zxs(this.b, this.c, fcxyVar);
    }
}
