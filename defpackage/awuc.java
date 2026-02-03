package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awuc extends fcyz implements fdat {
    int a;
    final /* synthetic */ awuo b;
    final /* synthetic */ axcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awuc(awuo awuoVar, axcm axcmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awuoVar;
        this.c = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awuc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awuo awuoVar = this.b;
        axcm axcmVar = this.c;
        this.a = 1;
        Object objG = awuoVar.g(axcmVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awuc(this.b, this.c, fcxyVar);
    }
}
