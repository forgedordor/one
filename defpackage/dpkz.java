package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpkz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dplc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpkz(dplc dplcVar, boolean z, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dplcVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpkz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dplc dplcVar = this.b;
            dpky dpkyVar = new dpky(dplcVar, this.c, this.d, null);
            this.a = 1;
            if (dplcVar.d.c("KeyboardDataPersistenceProtoDataStore#saveHeightToDataStore", dpkyVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpkz(this.b, this.c, this.d, fcxyVar);
    }
}
