package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuaw extends fcyz implements fdat {
    int a;
    final /* synthetic */ cuay b;
    final /* synthetic */ alqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuaw(cuay cuayVar, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cuayVar;
        this.c = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuaw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cuay cuayVar = this.b;
            alqm alqmVar = this.c;
            aoer aoerVarD = cuayVar.d();
            this.a = 1;
            if (cuayVar.d.a(alqmVar, aoerVarD, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cuaw(this.b, this.c, fcxyVar);
    }
}
