package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvh b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvg(dvh dvhVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvhVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            dvh dvhVar = this.b;
            long j = this.c;
            fdau fdauVar = dvhVar.l;
            long jE = kjo.e(j, dvhVar.m ? -1.0f : 1.0f);
            dwm dwmVar = dvhVar.b;
            fdau fdauVar2 = dvc.a;
            Float f = new Float(dwmVar == dwm.a ? kjo.b(jE) : kjo.a(jE));
            this.a = 1;
            if (fdauVar.a(fdjxVar, f, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvg dvgVar = new dvg(this.b, this.c, fcxyVar);
        dvgVar.d = obj;
        return dvgVar;
    }
}
