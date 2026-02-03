package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chmm extends fcyz implements fdat {
    int a;
    final /* synthetic */ chmt b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chmm(fcxy fcxyVar, chmt chmtVar, String str) {
        super(2, fcxyVar);
        this.b = chmtVar;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chmm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chmt chmtVar = this.b;
            ListenableFuture listenableFutureB = chmtVar.b.b(new chmo(new chmn(this.c)), chmtVar.c);
            this.a = 1;
            if (fdxs.c(listenableFutureB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chmm chmmVar = new chmm(fcxyVar, this.b, this.c);
        chmmVar.d = obj;
        return chmmVar;
    }
}
