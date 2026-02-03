package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ool extends fcyz implements fdat {
    int a;
    final /* synthetic */ ooq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ool(ooq ooqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ooqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ool) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.c;
            fdcg fdcgVar = new fdcg();
            fdcgVar.a = Integer.MIN_VALUE;
            ooq ooqVar = this.b;
            fdrw fdrwVar = new fdrw(ooqVar.c, new ooi(null));
            ook ookVar = new ook(fdcgVar, fdpmVar);
            this.a = 1;
            if (fdrwVar.a(ookVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ool oolVar = new ool(this.b, fcxyVar);
        oolVar.c = obj;
        return oolVar;
    }
}
