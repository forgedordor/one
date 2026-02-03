package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caam extends fcyz implements fdat {
    int a;
    final /* synthetic */ caao b;
    final /* synthetic */ Exception c;
    final /* synthetic */ efwo d;
    final /* synthetic */ evuh e;
    final /* synthetic */ cayy f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caam(fcxy fcxyVar, caao caaoVar, Exception exc, efwo efwoVar, evuh evuhVar, cayy cayyVar) {
        super(2, fcxyVar);
        this.b = caaoVar;
        this.c = exc;
        this.d = efwoVar;
        this.e = evuhVar;
        this.f = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (Exception unused) {
            cayv.E.n("Could not save exception to SilentFeedbackManager");
        }
        if (i == 0) {
            fctl.b(obj);
            cqbd cqbdVarB = cayv.E.b();
            cqbdVarB.I("Encountered an unexpected exception from a CMS WorkHandler");
            caao caaoVar = this.b;
            cqbdVarB.A("processor", caaoVar.d.getClass().getCanonicalName());
            Exception exc = this.c;
            cqbdVarB.s(exc);
            if (caaoVar.e.a()) {
                cpri.c("Encountered an unexpected exception from a CmsSingleItemWorkHandler", exc);
            } else {
                eiju eijuVarB = caaoVar.f.b(exc);
                this.a = 1;
                if (fdxs.c(eijuVarB, this) == fcylVar) {
                }
            }
        } else {
            if (i != 1) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
        }
        caao caaoVar2 = this.b;
        efwo efwoVar = this.d;
        evuh evuhVar = this.e;
        cayy cayyVar = this.f;
        Exception exc2 = this.c;
        this.a = 2;
        Object objL = caaoVar2.l(efwoVar, evuhVar, cayyVar, exc2, this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        caam caamVar = new caam(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        caamVar.g = obj;
        return caamVar;
    }
}
