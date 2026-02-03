package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxxc implements bxwy {
    public static final eksp a = eksp.c("BugleSearch");
    public SettableFuture b;
    private final bxzz c;
    private SettableFuture d;
    private SearchQuery e;
    private final Executor f = new Executor() { // from class: bxwz
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ecem.e(runnable);
        }
    };

    public bxxc(bxzz bxzzVar) {
        this.c = bxzzVar;
    }

    private final void c(SearchQuery searchQuery, SettableFuture settableFuture) {
        this.b = settableFuture;
        this.c.a(searchQuery).e(byal.class, new ejvr() { // from class: bxxa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) bxxc.a.j()).g((byal) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/common/ThrottleIcingSearchApiImpl", "startSearch", 71, "ThrottleIcingSearchApiImpl.java")).q("ThrottleIcingSearchApiImpl: Couldn't fetch search results.");
                return bxwf.e();
            }
        }, eoqg.a).k(auwc.a(new bxxb(this, settableFuture)), this.f);
    }

    @Override // defpackage.bxwy
    public final ListenableFuture a(SearchQuery searchQuery) {
        ecem.c();
        SettableFuture settableFuture = this.b;
        if (settableFuture == null || settableFuture.isDone() || this.b.isCancelled()) {
            SettableFuture settableFutureCreate = SettableFuture.create();
            c(searchQuery, settableFutureCreate);
            return settableFutureCreate;
        }
        this.e = searchQuery;
        SettableFuture settableFutureCreate2 = this.d;
        if (settableFutureCreate2 == null) {
            settableFutureCreate2 = SettableFuture.create();
        }
        this.d = settableFutureCreate2;
        return settableFutureCreate2;
    }

    public final void b() {
        SearchQuery searchQuery;
        SettableFuture settableFuture = this.d;
        if (settableFuture == null || (searchQuery = this.e) == null) {
            return;
        }
        this.e = null;
        this.d = null;
        c(searchQuery, settableFuture);
    }
}
