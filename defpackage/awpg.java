package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awpg extends fcyz implements fdat {
    int a;
    final /* synthetic */ awpo b;
    final /* synthetic */ axcm c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awpg(awpo awpoVar, axcm axcmVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awpoVar;
        this.c = axcmVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awpo awpoVar = this.b;
        axcm axcmVar = this.c;
        String str = this.d;
        this.a = 1;
        Object objI = awpoVar.i(axcmVar, str, false, this);
        return objI == fcylVar ? fcylVar : objI;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awpg(this.b, this.c, this.d, fcxyVar);
    }
}
