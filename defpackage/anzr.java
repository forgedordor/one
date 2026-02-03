package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzr extends fcyz implements fdat {
    int a;
    final /* synthetic */ anzt b;
    final /* synthetic */ anzp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzr(anzt anztVar, anzp anzpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anztVar;
        this.c = anzpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anzq anzqVar = (anzq) this.b.c.b();
            anzp anzpVar = this.c;
            caxr caxrVar = new caxr();
            caxrVar.c = Duration.ofSeconds(5L);
            eiju eijuVarB = ((cazj) anzqVar.a.b()).a(cbcu.g("participant_contact_sync", anzpVar, caxrVar.a())).b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anzr(this.b, this.c, fcxyVar);
    }
}
