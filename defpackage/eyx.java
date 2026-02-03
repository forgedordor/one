package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyx extends fcyz implements fdat {
    int a;
    final /* synthetic */ kew b;
    final /* synthetic */ faj c;
    final /* synthetic */ fda d;
    final /* synthetic */ kel e;
    final /* synthetic */ eug f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyx(eug eugVar, kew kewVar, faj fajVar, fda fdaVar, kel kelVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = eugVar;
        this.b = kewVar;
        this.c = fajVar;
        this.d = fdaVar;
        this.e = kelVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eyx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eug eugVar = this.f;
            kew kewVar = this.b;
            faj fajVar = this.c;
            fda fdaVar = this.d;
            kel kelVar = this.e;
            fbf fbfVar = fajVar.a;
            this.a = 1;
            int iA = kelVar.a(jyo.c(kewVar.c));
            jyi jyiVar = fdaVar.a;
            Object objA = eugVar.a(iA < jyiVar.a.a.a() ? jyiVar.m(iA) : iA != 0 ? jyiVar.m(iA - 1) : new ihu(0.0f, 0.0f, 1.0f, (int) (fbp.a(fbfVar.b, fbfVar.e, fbfVar.f, fbp.a, 1) & 4294967295L)), this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eyx(this.f, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
