package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehcf {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater");
    public final ekfk b;
    public final Executor c;
    public final Executor d;
    public final egpl e;
    public final Set f = new css();
    public Set g = new css();
    public int h = 2;

    public ehcf(ekfk ekfkVar, Executor executor, Executor executor2, egpl egplVar) {
        this.b = ekfkVar;
        this.c = executor;
        this.d = executor2;
        this.e = egplVar;
    }

    public static void b(ehay ehayVar, ehcl ehclVar) {
        eieu eieuVarK;
        egov egovVarA;
        ecem.c();
        if (ehclVar.c()) {
            eieuVarK = eiiy.k("LocalSubscription onLoaded()");
            try {
                egovVarA = egow.a();
                try {
                    ehayVar.b(ehclVar.b());
                    egovVarA.close();
                    eieuVarK.close();
                    return;
                } finally {
                }
            } finally {
            }
        }
        eieuVarK = eiiy.k("LocalSubscription onLoadError()");
        try {
            egovVarA = egow.a();
            try {
                ehayVar.a(ehclVar.a());
                egovVarA.close();
                eieuVarK.close();
            } finally {
                try {
                    egovVarA.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }

    private final void e(final ListenableFuture listenableFuture) {
        ecem.c();
        this.g.add(listenableFuture);
        listenableFuture.b(eiid.k(new Runnable() { // from class: ehbs
            @Override // java.lang.Runnable
            public final void run() {
                Set set = this.a.g;
                if (set != null) {
                    set.remove(listenableFuture);
                }
            }
        }), this.d);
    }

    public final void a(final ehci ehciVar, ListenableFuture listenableFuture) {
        ListenableFuture listenableFutureJ = eork.j(listenableFuture);
        ejvr ejvrVar = new ejvr() { // from class: ehbv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ehci ehciVar2 = ehciVar;
                ehciVar2.a();
                this.a.c(ehciVar2);
                return null;
            }
        };
        Executor executor = this.d;
        e(eika.e(eika.j(listenableFutureJ, ejvrVar, executor), Throwable.class, new ejvr() { // from class: ehbw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                ehcf ehcfVar = this.a;
                ehci ehciVar2 = ehciVar;
                if (z) {
                    throw ((CancellationException) th);
                }
                try {
                    ehciVar2.a();
                    ehcfVar.c(ehciVar2);
                    return null;
                } catch (NullPointerException e) {
                    ((ekrd) ((ekrd) ((ekrd) ehcf.a.i()).g(e)).h("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater", "appendLoadCompletion", (char) 334, "LocalSubscriptionMixinUpdater.java")).q("LocalSubscriptionMixinUpdater silently ignored NullPointerException");
                    throw e;
                }
            }
        }, executor));
    }

    public final void c(ehci ehciVar) {
        ecem.c();
        this.f.add(ehciVar);
        if (this.h == 2) {
            this.h = 1;
            e(eika.g(new Runnable() { // from class: ehbz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    ecem.c();
                    ehcf ehcfVar = this.a;
                    ejwl.m(ehcfVar.h == 1, "Duplicate or leaked callback task.");
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    ehcfVar.h = 2;
                    Set set = ehcfVar.f;
                    csr csrVar = new csr((css) set);
                    while (csrVar.hasNext()) {
                        ehci ehciVar2 = (ehci) csrVar.next();
                        ecem.c();
                        ehcg ehcgVar = ehciVar2.a;
                        ehcgVar.getClass();
                        ejwl.m(ehcgVar.c().g(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                        ehcg ehcgVar2 = ehciVar2.a;
                        ehciVar2.a = ehcgVar2.e((ehcl) ehcgVar2.c().c());
                        ekfwVar.h(new ehas((ehay) ((ekod) ehcfVar.b).d.get(ehciVar2), (ehcl) ehciVar2.a.d().c()));
                    }
                    set.clear();
                    ekgb ekgbVarG = ekfwVar.g();
                    int i2 = ((ekoe) ekgbVarG).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ehce ehceVar = (ehce) ekgbVarG.get(i3);
                        try {
                            ehcf.b(ehceVar.a(), ehceVar.b());
                        } catch (Throwable th) {
                            ehcfVar.c.execute(eiid.k(new Runnable() { // from class: ehby
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    throw th;
                                }
                            }));
                        }
                    }
                }
            }, this.e));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ehaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void d(final ehci ehciVar) {
        ejwy ejwyVar = new ejwy() { // from class: ehca
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                this.a.a(ehciVar, (ListenableFuture) obj);
            }
        };
        ecem.c();
        ehcg ehcgVar = ehciVar.a;
        ehcgVar.getClass();
        ejwy ejwyVar2 = new ejwy() { // from class: ehch
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ehciVar.a = (ehcg) obj;
            }
        };
        if (ehcgVar.a().g()) {
            ehcgVar.a().c().cancel(false);
        }
        if (ehcgVar.b().g()) {
            eieu eieuVarK = eiiy.k("LocalSubscription newLoad");
            try {
                ListenableFuture listenableFutureB = ehcgVar.b().c().b();
                eieuVarK.b(listenableFutureB);
                ejwyVar2.a(new ehat(ehcgVar.b(), ejwi.j(listenableFutureB), ehcgVar.c(), ehcgVar.d()));
                ejwyVar.a(listenableFutureB);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
