package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpky extends fcyz implements fdap {
    int a;
    final /* synthetic */ dplc b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpky(dplc dplcVar, boolean z, int i, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dplcVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dplc dplcVar = this.b;
            final boolean z = this.c;
            final int i2 = this.d;
            final fdap fdapVar = new fdap() { // from class: dpkw
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dpld dpldVar;
                    dple dpleVar = (dple) obj2;
                    if (dpleVar == null || (dpldVar = (dpld) dple.a.createBuilder(dpleVar)) == null) {
                        dpldVar = (dpld) dple.a.createBuilder();
                        dpldVar.getClass();
                    }
                    int i3 = i2;
                    boolean z2 = z;
                    dplc dplcVar2 = dplcVar;
                    evvp evvpVarC = evxc.c(dplcVar2.a.f().toEpochMilli());
                    dpldVar.copyOnWrite();
                    dple dpleVar2 = (dple) dpldVar.instance;
                    evvpVarC.getClass();
                    dpleVar2.e = evvpVarC;
                    dpleVar2.b |= 4;
                    if (z2) {
                        dpldVar.copyOnWrite();
                        dple dpleVar3 = (dple) dpldVar.instance;
                        dpleVar3.b |= 1;
                        dpleVar3.c = i3;
                    } else {
                        dpldVar.copyOnWrite();
                        dple dpleVar4 = (dple) dpldVar.instance;
                        dpleVar4.b |= 2;
                        dpleVar4.d = i3;
                    }
                    dple dpleVar5 = (dple) dpldVar.build();
                    dplcVar2.e = dpleVar5;
                    return dpleVar5;
                }
            };
            ListenableFuture listenableFutureB = dplcVar.b.b(new ejvr() { // from class: dpkx
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return fdapVar.invoke(obj2);
                }
            }, eoqg.a);
            this.a = 1;
            if (fdxs.c(listenableFutureB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dpky(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
