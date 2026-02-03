package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llk extends fcyz implements fdat {
    int a;
    final /* synthetic */ llo b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llk(llo lloVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lloVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((llk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdjx fdjxVar = (fdjx) this.d;
        fdjd fdjdVar = new fdjd();
        llo lloVar = this.b;
        lmh lmhVar = new lmh(this.c, fdjdVar, lloVar.c.a(), fdjxVar.hE());
        lmq lmqVar = lloVar.f;
        Object objB = lmqVar.c.b(lmhVar);
        if (objB instanceof fdoe) {
            Throwable thB = fdog.b(objB);
            if (thB == null) {
                throw new fdom("Channel was closed normally");
            }
            throw thB;
        }
        if (!fdog.c(objB)) {
            throw new IllegalStateException("Check failed.");
        }
        if (lmqVar.d.a.getAndIncrement() == 0) {
            fdil.d(lmqVar.a, null, null, new lmp(lmqVar, null), 3);
        }
        this.a = 1;
        Object objHJ = fdjdVar.hJ(this);
        return objHJ == fcylVar ? fcylVar : objHJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        llk llkVar = new llk(this.b, this.c, fcxyVar);
        llkVar.d = obj;
        return llkVar;
    }
}
