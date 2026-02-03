package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlq extends fcyz implements fdat {
    int a;
    final /* synthetic */ chlu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlq(fcxy fcxyVar, chlu chluVar) {
        super(2, fcxyVar);
        this.b = chluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        evtg evtgVar;
        euda eudaVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ListenableFuture listenableFutureB = ((chnp) this.b.b).d.b();
            listenableFutureB.getClass();
            this.a = 1;
            obj = fdxs.c(listenableFutureB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        eucu eucuVar = (eucu) ((ejwi) obj).f();
        if (eucuVar == null || (evtgVar = eucuVar.b) == null || (eudaVar = (euda) fcva.P(evtgVar)) == null) {
            return null;
        }
        efvz efvzVar = eudaVar.c;
        return efvzVar == null ? efvz.a : efvzVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlq chlqVar = new chlq(fcxyVar, this.b);
        chlqVar.c = obj;
        return chlqVar;
    }
}
