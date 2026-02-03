package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awvb extends fcyz implements fdat {
    int a;
    final /* synthetic */ awvh b;
    final /* synthetic */ axcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awvb(awvh awvhVar, axcm axcmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awvhVar;
        this.c = axcmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awvb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awvh awvhVar = this.b;
        axcm axcmVar = this.c;
        this.a = 1;
        Object objG = awvhVar.g(axcmVar, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awvb(this.b, this.c, fcxyVar);
    }
}
