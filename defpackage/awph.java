package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awph extends fcyz implements fdat {
    int a;
    final /* synthetic */ awpo b;
    final /* synthetic */ axcm c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awph(awpo awpoVar, axcm axcmVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awpoVar;
        this.c = axcmVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.e;
            awpo awpoVar = this.b;
            fdkf fdkfVarA = ejaa.a(fdjxVar, awpoVar.i, new awpg(awpoVar, this.c, this.d, null));
            this.a = 1;
            if (fdkfVarA.c(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awph awphVar = new awph(this.b, this.c, this.d, fcxyVar);
        awphVar.e = obj;
        return awphVar;
    }
}
