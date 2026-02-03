package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctpy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctqd b;
    final /* synthetic */ alqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctpy(ctqd ctqdVar, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctqdVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctpy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctqd ctqdVar = this.b;
            alqm alqmVar = this.c;
            aoer aoerVar = (aoer) ctqdVar.g.a().c();
            this.a = 1;
            if (ctqdVar.f.a(alqmVar, aoerVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctpy(this.b, this.c, fcxyVar);
    }
}
