package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oof extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ oog c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oof(fdpl fdplVar, fcxy fcxyVar, oog oogVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = oogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oof) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.d;
            fdpl fdplVar = this.b;
            ooe ooeVar = new ooe(fdpmVar, this.c);
            this.a = 1;
            if (fdplVar.a(ooeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        oof oofVar = new oof(this.b, fcxyVar, this.c);
        oofVar.d = obj;
        return oofVar;
    }
}
