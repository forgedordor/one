package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egur implements egsq {
    private final eiai a;
    private final fcsu b;
    private final fcsu c;

    public egur(eiai eiaiVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = eiaiVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.egsq
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        return c(listenableFuture, new eooz() { // from class: egun
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((egsi) obj).c();
            }
        });
    }

    @Override // defpackage.egsq
    public final ListenableFuture b(eooy eooyVar) {
        Set set = (Set) ((eyig) this.c).a;
        ekhv ekhvVarI = ekhx.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekhvVarI.c(new eguq((egsg) it.next()));
        }
        return this.a.a(eooyVar, ekhvVarI.g());
    }

    public final ListenableFuture c(final ListenableFuture listenableFuture, eooz eoozVar) {
        Set set = (Set) ((eyig) this.b).a;
        ekhv ekhvVarI = ekhx.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekhvVarI.c(new egup(eoozVar, (egsi) it.next()));
        }
        return this.a.a(new eooy() { // from class: egul
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return listenableFuture;
            }
        }, ekhvVarI.g());
    }
}
