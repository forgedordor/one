package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwx implements bxwy {
    public static final eksp a = eksp.c("BugleSearch");
    public final Queue b = new ArrayDeque();
    public final Queue c = new ArrayDeque();
    public SettableFuture d;
    private final bxzz e;
    private final Executor f;

    public bxwx(bxzz bxzzVar, Executor executor) {
        this.e = bxzzVar;
        this.f = new eoss(executor);
    }

    @Override // defpackage.bxwy
    public final ListenableFuture a(final SearchQuery searchQuery) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        auvh.h(eijx.f(new Runnable() { // from class: bxww
            @Override // java.lang.Runnable
            public final void run() {
                bxwx bxwxVar = this.a;
                bxwxVar.b.add(settableFutureCreate);
                bxwxVar.c.add(searchQuery);
                bxwxVar.b();
            }
        }, this.f));
        return settableFutureCreate;
    }

    public final void b() {
        Queue queue = this.b;
        if (!queue.isEmpty() && this.d == null) {
            while (!queue.isEmpty()) {
                SettableFuture settableFuture = (SettableFuture) queue.remove();
                SearchQuery searchQuery = (SearchQuery) this.c.remove();
                if (!settableFuture.isDone() && !settableFuture.isCancelled()) {
                    this.d = settableFuture;
                    eiju eijuVarA = this.e.a(searchQuery);
                    ejvr ejvrVar = new ejvr() { // from class: bxwu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((eksl) ((eksl) ((eksl) bxwx.a.j()).g((byal) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/common/SequentialIcingSearchApiImpl", "startSearch", 88, "SequentialIcingSearchApiImpl.java")).q("ThrottleIcingSearchApiImpl: Couldn't fetch search results.");
                            return bxwf.e();
                        }
                    };
                    Executor executor = this.f;
                    auvh.h(eijuVarA.e(byal.class, ejvrVar, executor).h(new ejvr() { // from class: bxwv
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            bxwx bxwxVar = this.a;
                            bxwf bxwfVar = (bxwf) obj;
                            SettableFuture settableFuture2 = bxwxVar.d;
                            if (settableFuture2 != null) {
                                settableFuture2.set(bxwfVar);
                                bxwxVar.d = null;
                                bxwxVar.b();
                            }
                            return bxwfVar;
                        }
                    }, executor));
                    return;
                }
            }
        }
    }
}
