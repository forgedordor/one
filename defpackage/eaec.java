package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaec {
    public final ejxr a;
    private final Context c;
    private final ejxr d;
    private final ejxr e;
    private volatile int f = 0;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object g = new Object();
    private volatile ListenableFuture h = null;

    public eaec(Context context, ejxr ejxrVar, ejxr ejxrVar2, ejxr ejxrVar3) {
        this.c = context;
        this.d = ejxrVar;
        this.e = ejxrVar2;
        this.a = ejxrVar3;
    }

    public final ListenableFuture a(eryd erydVar, boolean z, eaea eaeaVar) {
        ListenableFuture listenableFutureJ;
        final eaep eaepVar = (eaep) this.e.get();
        if (eaepVar == null && !z) {
            return eorv.a;
        }
        int i = erydVar.h;
        ejwl.a(true);
        int i2 = 1 << i;
        if ((this.f & i2) == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            synchronized (copyOnWriteArrayList) {
                int i3 = this.f;
                if ((i3 & i2) == 0) {
                    copyOnWriteArrayList.add(eaeaVar);
                    this.f = i2 | i3;
                }
            }
        }
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        synchronized (this.g) {
            listenableFutureJ = this.h;
            if (listenableFutureJ == null) {
                if (eaepVar == null) {
                    eaepVar = new eaep() { // from class: eadx
                        @Override // defpackage.eaep
                        public final void a() {
                        }
                    };
                }
                Context context = this.c;
                if (dqyw.g(context)) {
                    Runnable runnable = new Runnable() { // from class: eady
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    };
                    ejxr ejxrVar = this.d;
                    listenableFutureJ = eooq.g(dqyw.d(context, runnable, (Executor) ejxrVar.get()), new eooz() { // from class: eadz
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            eaec eaecVar = this.a;
                            return ((eaaa) eaecVar.a.get()).j(new eaeb(eaecVar, eaepVar));
                        }
                    }, (Executor) ejxrVar.get());
                    this.h = listenableFutureJ;
                } else {
                    listenableFutureJ = ((eaaa) this.a.get()).j(new eaeb(this, eaepVar));
                    this.h = listenableFutureJ;
                }
            }
        }
        return listenableFutureJ;
    }
}
