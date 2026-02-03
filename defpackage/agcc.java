package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agcc extends fcyz implements fdat {
    int a;
    final /* synthetic */ agcd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcc(agcd agcdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agcdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agcc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agcd agcdVar = this.b;
            this.a = 1;
            if (agcdVar.a.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agcc(this.b, fcxyVar);
    }
}
