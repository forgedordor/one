package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akhm extends fcyz implements fdat {
    int a;
    final /* synthetic */ akho b;
    final /* synthetic */ ajts c;
    final /* synthetic */ auib d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akhm(akho akhoVar, ajts ajtsVar, auib auibVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akhoVar;
        this.c = ajtsVar;
        this.d = auibVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akhm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akho akhoVar = this.b;
        ajts ajtsVar = this.c;
        auib auibVar = this.d;
        String str = this.e;
        this.a = 1;
        Object objE = akhoVar.e(ajtsVar, auibVar, str, null, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akhm(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
