package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsks implements dski {
    public Map a;
    public boolean b;
    private final dski c;
    private ListenableFuture d;

    public dsks(dski dskiVar) {
        this.c = dskiVar;
    }

    private final synchronized ListenableFuture g() {
        Map map = this.a;
        if (map != null) {
            return eork.i(map);
        }
        ListenableFuture listenableFuture = this.d;
        if (listenableFuture != null) {
            return listenableFuture;
        }
        this.b = false;
        ListenableFuture listenableFutureC = this.c.c();
        this.d = listenableFutureC;
        eork.r(listenableFutureC, new dskr(this), eoqg.a);
        return listenableFutureC;
    }

    private final synchronized void h() {
        this.a = null;
        this.b = true;
    }

    @Override // defpackage.dski
    public final ListenableFuture a() {
        h();
        return this.c.a();
    }

    @Override // defpackage.dski
    public final ListenableFuture b(Map map) {
        h();
        return this.c.b(map);
    }

    @Override // defpackage.dski
    public final ListenableFuture c() {
        return eooq.f(g(), new ejvr() { // from class: dskq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new HashMap((Map) obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dski
    public final ListenableFuture d(String str, evuh evuhVar) {
        h();
        return this.c.d(str, evuhVar);
    }

    @Override // defpackage.dski
    public final ListenableFuture e(String str) {
        h();
        return this.c.e(str);
    }
}
