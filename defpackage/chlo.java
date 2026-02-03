package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlo extends fcyz implements fdat {
    int a;
    final /* synthetic */ chlu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlo(fcxy fcxyVar, chlu chluVar) {
        super(2, fcxyVar);
        this.b = chluVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ListenableFuture listenableFutureD = ((chnp) this.b.b).d.d();
            listenableFutureD.getClass();
            this.a = 1;
            obj = fdxs.c(listenableFutureD, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        evtg evtgVar = ((eucu) obj).b;
        evtgVar.getClass();
        return fcva.P(evtgVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlo chloVar = new chlo(fcxyVar, this.b);
        chloVar.c = obj;
        return chloVar;
    }
}
