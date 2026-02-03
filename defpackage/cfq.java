package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cfq implements cec {
    public final Map a = new LinkedHashMap();
    public cbb b = cbb.INACTIVE;
    public final List c = new ArrayList();
    final /* synthetic */ cgh d;

    public cfq(cgh cghVar) {
        this.d = cghVar;
    }

    @Override // defpackage.cbc
    public final ListenableFuture a() {
        return kol.a(new koi() { // from class: cfi
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final cfq cfqVar = this.a;
                cfqVar.d.h.execute(new Runnable() { // from class: cfj
                    @Override // java.lang.Runnable
                    public final void run() {
                        kog kogVar2 = kogVar;
                        final cfq cfqVar2 = cfqVar;
                        cbb cbbVar = cfqVar2.b;
                        if (cbbVar == cbb.ACTIVE) {
                            cgh cghVar = cfqVar2.d;
                            final ListenableFuture listenableFutureI = cghVar.i();
                            bqk.j(listenableFutureI, kogVar2);
                            kogVar2.a(new Runnable() { // from class: cfl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cfqVar2.e(listenableFutureI);
                                }
                            }, bpc.a());
                            cfqVar2.c.add(listenableFutureI);
                            listenableFutureI.b(new Runnable() { // from class: cfm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cfqVar2.c.remove(listenableFutureI);
                                }
                            }, cghVar.h);
                            return;
                        }
                        if (cbbVar == cbb.INACTIVE) {
                            kogVar2.c(new IllegalStateException("BufferProvider is not active."));
                            return;
                        }
                        cbb cbbVar2 = cfqVar2.b;
                        Objects.toString(cbbVar2);
                        kogVar2.c(new IllegalStateException("Unknown state: ".concat(String.valueOf(cbbVar2))));
                    }
                });
                return "acquireBuffer";
            }
        });
    }

    @Override // defpackage.blm
    public final ListenableFuture b() {
        return kol.a(new koi() { // from class: cfh
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final cfq cfqVar = this.a;
                cfqVar.d.h.execute(new Runnable() { // from class: cfk
                    @Override // java.lang.Runnable
                    public final void run() {
                        kogVar.b(cfqVar.b);
                    }
                });
                return "fetchData";
            }
        });
    }

    @Override // defpackage.blm
    public final void c(final Executor executor, final bll bllVar) {
        this.d.h.execute(new Runnable() { // from class: cfg
            @Override // java.lang.Runnable
            public final void run() {
                final bll bllVar2 = bllVar;
                lcg.i(bllVar2);
                Executor executor2 = executor;
                lcg.i(executor2);
                cfq cfqVar = this.a;
                cfqVar.a.put(bllVar2, executor2);
                final cbb cbbVar = cfqVar.b;
                executor2.execute(new Runnable() { // from class: cfo
                    @Override // java.lang.Runnable
                    public final void run() {
                        bllVar2.b(cbbVar);
                    }
                });
            }
        });
    }

    @Override // defpackage.blm
    public final void d(final bll bllVar) {
        this.d.h.execute(new Runnable() { // from class: cfp
            @Override // java.lang.Runnable
            public final void run() {
                bll bllVar2 = bllVar;
                lcg.i(bllVar2);
                this.a.a.remove(bllVar2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ListenableFuture listenableFuture) {
        if (listenableFuture.cancel(true)) {
            return;
        }
        lcg.c(listenableFuture.isDone());
        try {
            ((cgl) listenableFuture.get()).d();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            cgh cghVar = this.d;
            e.toString();
            bbs.f(cghVar.a, "Unable to cancel the input buffer: ".concat(e.toString()));
        }
    }

    final void f(boolean z) {
        final cbb cbbVar = z ? cbb.ACTIVE : cbb.INACTIVE;
        if (this.b == cbbVar) {
            return;
        }
        this.b = cbbVar;
        if (cbbVar == cbb.INACTIVE) {
            List list = this.c;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(true);
            }
            list.clear();
        }
        for (final Map.Entry entry : this.a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new Runnable() { // from class: cfn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((bll) entry.getKey()).b(cbbVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                bbs.d(this.d.a, "Unable to post to the supplied executor.", e);
            }
        }
    }
}
