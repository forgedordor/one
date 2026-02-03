package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkj extends fcyz implements fdat {
    int a;
    final /* synthetic */ gkn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkj(gkn gknVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gknVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gkj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gkn gknVar = this.b;
            kir kirVar = new kir((gknVar.e && gknVar.a) ? gknVar.c : gknVar.d);
            ddz ddzVarA = gknVar.a ? gpg.a((gpe) jbe.a(gknVar, gpg.a), 2) : new dgg(0);
            ddp ddpVar = gknVar.j;
            this.a = 1;
            if (ddp.k(ddpVar, kirVar, ddzVarA, null, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gkj(this.b, fcxyVar);
    }
}
