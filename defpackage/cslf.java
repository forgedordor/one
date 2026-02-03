package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cslf extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ csli c;
    final /* synthetic */ csch d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslf(fcxy fcxyVar, List list, List list2, csli csliVar, csch cschVar, int i) {
        super(2, fcxyVar);
        this.a = list;
        this.b = list2;
        this.c = csliVar;
        this.d = cschVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdjx fdjxVar = (fdjx) this.f;
        for (String str : this.a) {
            List list = this.b;
            fcyi fcyiVar = fcyi.a;
            list.add(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new cslh(null, this.c, str, this.d, this.e)));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cslf cslfVar = new cslf(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        cslfVar.f = obj;
        return cslfVar;
    }
}
