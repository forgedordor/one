package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gki extends fcyz implements fdat {
    int a;
    final /* synthetic */ gkn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gki(gkn gknVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gknVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gki) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gkn gknVar = this.b;
            ddp ddpVar = gknVar.h;
            if (ddpVar != null) {
                ije ijeVar = new ije(gknVar.a().c(gknVar.a, gknVar.b, gknVar.e));
                ddz ddzVarA = gknVar.a ? gpg.a((gpe) jbe.a(gknVar, gpg.a), 5) : new dgg(0);
                this.a = 1;
                obj = ddp.k(ddpVar, ijeVar, ddzVarA, null, this, 12);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gki(this.b, fcxyVar);
    }
}
