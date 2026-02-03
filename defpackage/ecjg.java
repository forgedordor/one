package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecjg implements eooz {
    public final List a;
    public final Executor b;

    public ecjg(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.eooz
    public final /* synthetic */ ListenableFuture a(Object obj) {
        List list = this.a;
        final int i = ((ekoe) list).c;
        final ecll ecllVar = (ecll) obj;
        final ArrayList arrayList = new ArrayList(i);
        ekqh it = ((ekgb) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((ecjb) it.next()).c());
        }
        final eooz eoozVarD = eiid.d(new eooz() { // from class: ecje
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final List list2 = arrayList;
                final evuh evuhVar = (evuh) obj2;
                eorg eorgVarA = eork.a(list2);
                final ecjg ecjgVar = this.a;
                final int i2 = i;
                return eorgVarA.b(eiid.c(new eooy() { // from class: ecjd
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ListenableFuture listenableFutureI = eork.i(evuhVar);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (((Boolean) eork.q((Future) list2.get(i3))).booleanValue()) {
                                final ecjb ecjbVar = (ecjb) ecjgVar.a.get(i3);
                                listenableFutureI = eooq.g(listenableFutureI, eiid.d(new eooz() { // from class: ecjc
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        return ecjbVar.b((evuh) obj3);
                                    }
                                }), eoqg.a);
                            }
                        }
                        return listenableFutureI;
                    }
                }), ecjgVar.b);
            }
        });
        eclm eclmVar = ecllVar.a;
        eidp eidpVar = eclmVar.e;
        final eoqg eoqgVar = eoqg.a;
        eidpVar.a();
        return eooq.g(eclq.a(eooq.g(eork.j(eclmVar.c.c()), eiid.d(new eooz() { // from class: eclk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ecllVar.a.b.h(eoozVarD, eoqgVar);
            }
        }), eoqgVar)), eiid.d(new eooz() { // from class: ecjf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                int i2 = i;
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) eork.q((Future) arrayList.get(i3))).booleanValue()) {
                        arrayList2.add(((ecjb) this.a.a.get(i3)).a());
                    }
                }
                return eork.c(arrayList2).a(new eopa(null), eoqg.a);
            }
        }), eoqgVar);
    }
}
