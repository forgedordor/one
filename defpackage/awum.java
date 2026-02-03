package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awum extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axcm c;
    final /* synthetic */ dggk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awum(axcm axcmVar, dggk dggkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = axcmVar;
        this.d = dggkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awum) c((awvl) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awvl awvlVar = (awvl) this.b;
            axcm axcmVar = this.c;
            dggk dggkVar = this.d;
            this.a = 1;
            if (awvlVar.q(axcmVar, dggkVar.a) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awum awumVar = new awum(this.c, this.d, fcxyVar);
        awumVar.b = obj;
        return awumVar;
    }
}
