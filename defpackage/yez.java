package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yez extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yez(ddp ddpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            dkkg dkkgVar = dkkg.a;
            this.a = 1;
            if (dkkgVar.a(ddpVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yez(this.b, fcxyVar);
    }
}
