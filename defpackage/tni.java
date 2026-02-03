package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tni extends fcyz implements fdat {
    int a;
    final /* synthetic */ tnp b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ epmr e;
    final /* synthetic */ epnf f;
    final /* synthetic */ ewyb g;
    final /* synthetic */ evqs h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tni(tnp tnpVar, String str, long j, epmr epmrVar, epnf epnfVar, ewyb ewybVar, evqs evqsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tnpVar;
        this.c = str;
        this.d = j;
        this.e = epmrVar;
        this.f = epnfVar;
        this.g = ewybVar;
        this.h = evqsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tni) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        tnp tnpVar = this.b;
        String str = this.c;
        long j = this.d;
        epmr epmrVar = this.e;
        epnf epnfVar = this.f;
        ewyb ewybVar = this.g;
        evqs evqsVar = this.h;
        this.a = 1;
        Object objE = tnpVar.e(str, j, epmrVar, epnfVar, ewybVar, evqsVar, this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tni(this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
