package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fduw extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdvc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fduw(fdvc fdvcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdvcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fduw) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.c;
            fdce fdceVar = new fdce();
            fdpl fdplVar = this.b;
            fduv fduvVar = new fduv(fdceVar, fdpmVar);
            this.a = 1;
            if (fdum.g((fdum) fdplVar, fduvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        throw new fcta();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fduw fduwVar = new fduw(this.b, fcxyVar);
        fduwVar.c = obj;
        return fduwVar;
    }
}
