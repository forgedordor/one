package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnjf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnnp b;
    final /* synthetic */ dnjh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnjf(dnnp dnnpVar, dnjh dnjhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnnpVar;
        this.c = dnjhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnjf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnnp dnnpVar = this.b;
            dnno dnnoVar = dnnpVar.d;
            String str = dnnoVar instanceof dnnn ? ((dnnn) dnnoVar).a : null;
            dnjh dnjhVar = this.c;
            dnmj dnmjVar = dnnpVar.a;
            dnce dnceVar = dnjhVar.e;
            if (dnceVar == null) {
                dnceVar = dnjh.a;
            }
            dnga dngaVar = dnjhVar.d;
            Instant instantA = dnjhVar.b.a();
            instantA.getClass();
            dneb dnebVar = new dneb(dnmjVar, dnceVar, instantA, str);
            this.a = 1;
            if (dngaVar.a(dnebVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnjf(this.b, this.c, fcxyVar);
    }
}
