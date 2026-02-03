package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkd {
    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((bjz) it.next()).e();
        }
    }

    public static void b(List list) throws bjx {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((bjz) list.get(i)).f();
                i++;
            } catch (bjx e) {
                while (true) {
                    i--;
                    if (i < 0) {
                        throw e;
                    }
                    ((bjz) list.get(i)).e();
                }
            }
        } while (i < list.size());
    }

    public static ListenableFuture c(final Collection collection, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(bqk.d(((bjz) it.next()).b()));
        }
        final ListenableFuture listenableFutureC = bqk.c(5000L, scheduledExecutorService, bqk.e(arrayList));
        return kol.a(new koi() { // from class: bkb
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                final ListenableFuture listenableFuture = listenableFutureC;
                Runnable runnable = new Runnable() { // from class: bka
                    @Override // java.lang.Runnable
                    public final void run() {
                        listenableFuture.cancel(true);
                    }
                };
                Executor executor2 = executor;
                kogVar.a(runnable, executor2);
                bqk.i(listenableFuture, new bkc(kogVar), executor2);
                return "surfaceList[" + collection + "]";
            }
        });
    }
}
