package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cljb extends fcyz implements fdat {
    final /* synthetic */ clje a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cljb(clje cljeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cljeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cljb) c((cljh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        clje cljeVar = this.a;
        Iterator it = cljeVar.d.iterator();
        while (it.hasNext()) {
            auvw.k(cljeVar.c, null, null, new clja((adbu) it.next(), null), 3);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cljb(this.a, fcxyVar);
    }
}
