package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfwa extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfwb b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfwa(cfwb cfwbVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfwbVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfwa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cfwb cfwbVar = this.b;
            int i2 = this.c;
            long j = fdhi.a;
            long jG = fdhk.g(Math.min(evxd.c(cfwbVar.b).toSeconds() << (i2 - 1), evxd.c(cfwbVar.c).toSeconds()), fdhl.d);
            this.a = 1;
            if (fdkj.d(jG, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfwa(this.b, this.c, fcxyVar);
    }
}
