package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctob extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctoc b;
    final /* synthetic */ alqm c;
    final /* synthetic */ aoer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctob(ctoc ctocVar, alqm alqmVar, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctocVar;
        this.c = alqmVar;
        this.d = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctob) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctoc ctocVar = this.b;
            alqm alqmVar = this.c;
            alqmVar.getClass();
            aoer aoerVar = this.d;
            this.a = 1;
            if (ctocVar.e.a(alqmVar, aoerVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctob(this.b, this.c, this.d, fcxyVar);
    }
}
