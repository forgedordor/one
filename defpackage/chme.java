package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chme extends fcyz implements fdat {
    int a;
    final /* synthetic */ chmt b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chme(fcxy fcxyVar, chmt chmtVar, String str, String str2) {
        super(2, fcxyVar);
        this.b = chmtVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chme) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chmt chmtVar = this.b;
            ListenableFuture listenableFutureB = chmtVar.b.b(new chmo(new chmf(this.c, this.d)), chmtVar.c);
            this.a = 1;
            if (fdxs.c(listenableFutureB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chme chmeVar = new chme(fcxyVar, this.b, this.c, this.d);
        chmeVar.e = obj;
        return chmeVar;
    }
}
