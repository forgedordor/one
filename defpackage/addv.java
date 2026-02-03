package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addv extends fcyz implements fdat {
    int a;
    final /* synthetic */ addx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addv(fcxy fcxyVar, addx addxVar) {
        super(2, fcxyVar);
        this.b = addxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((addv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            addx addxVar = this.b;
            ListenableFuture listenableFutureC = addxVar.b.c(addxVar.a);
            this.a = 1;
            obj = fdxs.c(listenableFutureC, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ((egbe) obj).b();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        addv addvVar = new addv(fcxyVar, this.b);
        addvVar.c = obj;
        return addvVar;
    }
}
