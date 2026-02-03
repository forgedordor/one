package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eclj implements eooy {
    public List a;
    final /* synthetic */ eclm b;

    public eclj(eclm eclmVar) {
        this.b = eclmVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        eclm eclmVar = this.b;
        eieu eieuVarB = eclmVar.e.b("Initialize ".concat(String.valueOf(eclmVar.a)));
        try {
            synchronized (eclmVar.d) {
                if (this.a == null) {
                    this.a = eclmVar.f;
                    eclmVar.f = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            ecll ecllVar = new ecll(this.b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((eooz) it.next()).a(ecllVar));
                } catch (Exception e) {
                    arrayList.add(eork.h(e));
                }
            }
            ListenableFuture listenableFutureA = eork.c(arrayList).a(new Callable() { // from class: ecli
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eclj ecljVar = this.a;
                    synchronized (ecljVar.b.d) {
                        ecljVar.a = null;
                    }
                    return null;
                }
            }, eoqg.a);
            eieuVarB.b(listenableFutureA);
            eieuVarB.close();
            return listenableFutureA;
        } catch (Throwable th) {
            try {
                eieuVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
