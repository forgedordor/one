package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmks extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmkw b;
    final /* synthetic */ eoaz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmks(fcxy fcxyVar, cmkw cmkwVar, eoaz eoazVar) {
        super(2, fcxyVar);
        this.b = cmkwVar;
        this.c = eoazVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmks) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmkw cmkwVar = this.b;
            eoaz eoazVar = this.c;
            this.a = 1;
            obj = cmkwVar.b.a(eoazVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new qao();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cmks cmksVar = new cmks(fcxyVar, this.b, this.c);
        cmksVar.d = obj;
        return cmksVar;
    }
}
