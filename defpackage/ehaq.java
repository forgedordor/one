package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehaq {
    public final diep a;
    public final egzo b;
    public final egpl c;
    public final Executor d;
    public egzn e;
    public final AtomicReference f = new AtomicReference(null);
    public egzt g;
    public egzs h;
    public egzw i;
    public final egpf j;
    public final egpf k;

    public ehaq(egyi egyiVar, diep diepVar, egzo egzoVar, egpl egplVar, Executor executor) {
        egzv egzvVar = egzw.f;
        ejud ejudVar = ejud.a;
        this.i = new egye(0L, egzvVar, false, ejudVar, ejudVar);
        this.j = new egpf(2, new ejvr() { // from class: ehaf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((egyu) obj).a.cancel(false);
                return null;
            }
        });
        this.k = new egpf(1, new ejvr() { // from class: ehag
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((egyy) obj).c();
                return null;
            }
        });
        this.a = diepVar;
        this.b = egzoVar;
        this.c = egplVar;
        egyc egycVar = new egyc(egyiVar, egyiVar.c(), new egym(), 0L, 1, new egyd(egyiVar, Long.MIN_VALUE, new egxw(0L), new egxx(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.h = egycVar;
        this.g = egycVar.e;
        this.d = executor;
    }

    public static void f(egyf egyfVar) {
        eieu eieuVarK = eiiy.k("BackgroundCallbacks.onBackgroundFetch");
        try {
            egyfVar.a();
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

    public static void g(egyf egyfVar) {
        eieu eieuVarK = eiiy.k("BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            egyfVar.b();
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.egzw j(defpackage.egzw r5, defpackage.egyy r6) {
        /*
            r0 = r5
            egye r0 = (defpackage.egye) r0
            ejwi r1 = r0.e
            boolean r2 = r1.g()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.c()
            if (r2 != r6) goto L1b
            ejud r0 = defpackage.ejud.a
            egzw r1 = r5.f(r6)
            r2 = r1
            r1 = r0
            goto L8d
        L1b:
            boolean r2 = r1.g()
            if (r2 != 0) goto L4e
            ejwi r2 = r0.d
            boolean r3 = r2.g()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.c()
            if (r3 != r6) goto L4e
            java.lang.Object r0 = r2.c()
            egyy r0 = (defpackage.egyy) r0
            egyh r0 = r0.a()
            java.lang.Object r0 = r0.d()
            ejwi r0 = defpackage.ejwi.j(r0)
            ejud r1 = defpackage.ejud.a
            java.lang.Object r2 = r2.c()
            egyy r2 = (defpackage.egyy) r2
            egzw r2 = r5.f(r2)
            goto L8d
        L4e:
            boolean r2 = r1.g()
            if (r2 == 0) goto L78
            java.lang.Object r1 = r1.c()
            egyy r1 = (defpackage.egyy) r1
            egyh r1 = r1.a()
            java.lang.Object r1 = r1.d()
            egyh r2 = r6.a()
            java.lang.Object r2 = r2.d()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L78
            ejud r0 = defpackage.ejud.a
            ejwi r1 = defpackage.ejwi.j(r6)
            r2 = r5
            goto L8d
        L78:
            egyh r1 = r6.a()
            java.lang.Object r1 = r1.d()
            ejwi r1 = defpackage.ejwi.j(r1)
            ejwi r0 = r0.d
            egzw r2 = r5.f(r6)
            r4 = r1
            r1 = r0
            r0 = r4
        L8d:
            boolean r0 = r0.g()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "SubscriptionCallbacks.onNewData"
            eieu r0 = defpackage.eiiy.k(r0)
            egov r3 = defpackage.egow.a()     // Catch: java.lang.Throwable -> Lbd
            egye r5 = (defpackage.egye) r5     // Catch: java.lang.Throwable -> Lb3
            egzv r5 = r5.b     // Catch: java.lang.Throwable -> Lb3
            egyh r6 = r6.a()     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r6 = r6.d()     // Catch: java.lang.Throwable -> Lb3
            r5.b(r6)     // Catch: java.lang.Throwable -> Lb3
            r3.close()     // Catch: java.lang.Throwable -> Lbd
            r0.close()
            goto Lc7
        Lb3:
            r5 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> Lbd
        Lbc:
            throw r5     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r6 = move-exception
            r5.addSuppressed(r6)
        Lc6:
            throw r5
        Lc7:
            boolean r5 = r1.g()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r1.c()
            egyy r5 = (defpackage.egyy) r5
            r5.c()
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehaq.j(egzw, egyy):egzw");
    }

    final void a() {
        egzn egznVar = this.e;
        if (egznVar != null) {
            this.b.e(((egyc) this.h).b, egznVar);
            this.e = null;
        }
        this.j.a();
        this.k.a();
        ejwi ejwiVar = ((egye) this.i).d;
        if (ejwiVar.g()) {
            ((egyy) ejwiVar.c()).c();
        }
        egye egyeVar = (egye) this.i;
        ejwi ejwiVar2 = egyeVar.e;
        if (!ejwiVar2.g() || ejwiVar2.equals(egyeVar.d)) {
            return;
        }
        ((egyy) ((egye) this.i).e.c()).c();
    }

    public final void b(egzt egztVar, egyy egyyVar) {
        ejwl.l(egyyVar.a().e());
        this.i = j(this.i, egyyVar);
        this.g = egztVar;
    }

    final void c() {
        egye egyeVar = (egye) this.i;
        this.i = new egye(egyeVar.a + 1, egzw.f, false, egyeVar.d, ejud.a);
    }

    public final void d(egzt egztVar) {
        eieu eieuVarK;
        ecem.c();
        egye egyeVar = (egye) this.i;
        if (!egyeVar.d.g()) {
            egzv egzvVar = egyeVar.b;
            eieuVarK = eiiy.k("SubscriptionCallbacks.onPending");
            try {
                egov egovVarA = egow.a();
                try {
                    egzvVar.hn();
                    egovVarA.close();
                    eieuVarK.close();
                } finally {
                }
            } finally {
            }
        } else if ((egyeVar.b instanceof egyf) && this.j.b()) {
            egzw egzwVar = this.i;
            if (!((egye) egzwVar).c) {
                egzw egzwVarG = egzwVar.g(true);
                this.i = egzwVarG;
                f((egyf) ((egye) egzwVarG).b);
            }
        }
        egyd egydVar = (egyd) egztVar;
        egyi egyiVar = egydVar.a;
        long j = egydVar.b;
        long j2 = ((egxw) egydVar.c).a;
        ejwl.m(j2 != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        final egyd egydVar2 = new egyd(egyiVar, j, new egxw(j2 + 1), egydVar.d, egydVar.e, egydVar.f);
        egyi egyiVar2 = egydVar2.a;
        eieuVarK = eiiy.k("DataSource fetchAndStoreData()");
        try {
            ListenableFuture listenableFutureB = egyiVar2.b();
            eieuVarK.b(listenableFutureB);
            final egyu egyuVar = new egyu(listenableFutureB);
            eieuVarK.close();
            this.j.d(egyuVar);
            egyuVar.a.b(eiid.k(new Runnable() { // from class: ehaj
                @Override // java.lang.Runnable
                public final void run() {
                    final ehaq ehaqVar = this.a;
                    final egzt egztVar2 = egydVar2;
                    final egyu egyuVar2 = egyuVar;
                    ehaqVar.c.execute(new Runnable() { // from class: ehal
                        @Override // java.lang.Runnable
                        public final void run() {
                            ehaq ehaqVar2 = ehaqVar;
                            egzt egztVar3 = egztVar2;
                            egpf egpfVar = ehaqVar2.j;
                            egyu egyuVar3 = egyuVar2;
                            if (egpfVar.c(egyuVar3)) {
                                ListenableFuture listenableFuture = egyuVar3.a;
                                if (listenableFuture.isCancelled()) {
                                    return;
                                }
                                ecem.c();
                                try {
                                    try {
                                        eork.q(listenableFuture);
                                        egyi egyiVar3 = ((egyd) egztVar3).a;
                                        if ((egyiVar3.c() instanceof egza) && egztVar3.h(ehaqVar2.g)) {
                                            egzo egzoVar = ehaqVar2.b;
                                            egzj egzjVar = (egzj) egzoVar;
                                            egzjVar.c(eork.i(null), egyiVar3.c(), egzm.a, ejud.a, ehaqVar2.c);
                                            return;
                                        }
                                        if (egztVar3.h(ehaqVar2.g)) {
                                            if (((egye) ehaqVar2.i).c && ehaqVar2.i()) {
                                                ejwl.m(((egye) ehaqVar2.i).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                                ehaq.g((egyf) ((egye) ehaqVar2.i).b);
                                                ehaqVar2.i = ehaqVar2.i.g(false);
                                                return;
                                            }
                                            return;
                                        }
                                        ehaqVar2.e(egztVar3);
                                        egzo egzoVar2 = ehaqVar2.b;
                                        ListenableFuture listenableFutureI = eork.i(null);
                                        Object objC = egyiVar3.c();
                                        egzn egznVar = ehaqVar2.e;
                                        egzj egzjVar2 = (egzj) egzoVar2;
                                        egzjVar2.c(listenableFutureI, objC, egzm.a, ejwi.j(egznVar), ehaqVar2.c);
                                    } catch (ExecutionException e) {
                                        ehaqVar2.h(e.getCause());
                                    }
                                } catch (Throwable th) {
                                    ehaqVar2.d.execute(new Runnable() { // from class: ehak
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            throw th;
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }), eoqg.a);
        } finally {
        }
    }

    public final void e(egzt egztVar) {
        ecem.c();
        egyd egydVar = (egyd) egztVar;
        long j = ((egxx) egydVar.d).a;
        ejwl.m(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        final egyd egydVar2 = new egyd(egydVar.a, egydVar.b, egydVar.c, new egxx(j + 1), egydVar.e + 1, egydVar.f);
        egyi egyiVar = egydVar2.a;
        eieu eieuVarK = eiiy.k("DataSource loadData()");
        try {
            eopy eopyVarA = egyiVar.a();
            eieuVarK.a(eopyVarA);
            final egyy egyyVar = new egyy(eopyVarA);
            eieuVarK.close();
            this.k.d(egyyVar);
            egyyVar.b().b(eiid.k(new Runnable() { // from class: ehah
                @Override // java.lang.Runnable
                public final void run() {
                    final ehaq ehaqVar = this.a;
                    final egzt egztVar2 = egydVar2;
                    final egyy egyyVar2 = egyyVar;
                    ehaqVar.c.execute(new Runnable() { // from class: ehai
                        @Override // java.lang.Runnable
                        public final void run() {
                            ecem.c();
                            ehaq ehaqVar2 = ehaqVar;
                            egzt egztVar3 = egztVar2;
                            ejwl.m(!egztVar3.equals(ehaqVar2.g), "The same LoadTask was processed twice.");
                            egyy egyyVar3 = egyyVar2;
                            ejwl.l(egyyVar3.b().isDone());
                            if (ehaqVar2.k.c(egyyVar3)) {
                                try {
                                    if (egyyVar3.b().isCancelled()) {
                                        return;
                                    }
                                    try {
                                        if (egztVar3.h(ehaqVar2.g)) {
                                            egyyVar3.c();
                                        } else if (!egyyVar3.b().isCancelled()) {
                                            int iA = ((egyc) ehaqVar2.h).c.a(((egyd) egztVar3).f, egyyVar3.a(), !egztVar3.i()) - 1;
                                            if (iA == 0) {
                                                egyyVar3.c();
                                                if (egztVar3.i()) {
                                                    egyw egywVar = new egyw();
                                                    egywVar.addSuppressed(eiip.c());
                                                    ehaqVar2.h(egywVar);
                                                } else {
                                                    ehaqVar2.d(egztVar3);
                                                }
                                            } else if (iA != 1) {
                                                ehaqVar2.b(egztVar3, egyyVar3);
                                                if (egztVar3.i()) {
                                                    egyw egywVar2 = new egyw();
                                                    egywVar2.addSuppressed(eiip.c());
                                                    ehaqVar2.h(egywVar2);
                                                } else {
                                                    ehaqVar2.d(egztVar3);
                                                }
                                            } else {
                                                ehaqVar2.b(egztVar3, egyyVar3);
                                                if (((egye) ehaqVar2.i).c && ehaqVar2.i()) {
                                                    ejwl.m(((egye) ehaqVar2.i).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                                    ehaq.g((egyf) ((egye) ehaqVar2.i).b);
                                                    ehaqVar2.i = ehaqVar2.i.g(false);
                                                }
                                            }
                                        }
                                        if (((egye) ehaqVar2.i).c && ehaqVar2.i()) {
                                            ejwl.m(((egye) ehaqVar2.i).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                            ehaq.g((egyf) ((egye) ehaqVar2.i).b);
                                            ehaqVar2.i = ehaqVar2.i.g(false);
                                        }
                                    } catch (egzx e) {
                                        ehaqVar2.h(e.getCause());
                                    }
                                } catch (Throwable th) {
                                    ehaqVar2.d.execute(new Runnable() { // from class: eham
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            throw th;
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }), eoqg.a);
        } finally {
        }
    }

    public final void h(Throwable th) {
        egye egyeVar = (egye) this.i;
        if (egyeVar.d.g()) {
            egzv egzvVar = egyeVar.b;
            if (egzvVar instanceof egzu) {
                egzu egzuVar = (egzu) egzvVar;
                eieu eieuVarK = eiiy.k("RefreshCallbacks.onRefreshError");
                try {
                    egzuVar.a();
                    eieuVarK.close();
                } catch (Throwable th2) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            egzv egzvVar2 = egyeVar.b;
            eieu eieuVarK2 = eiiy.k("SubscriptionCallbacks.onError");
            try {
                egov egovVarA = egow.a();
                try {
                    egzvVar2.a(th);
                    egovVarA.close();
                    eieuVarK2.close();
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    eieuVarK2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        if (((egye) this.i).c && i()) {
            egyf egyfVar = (egyf) ((egye) this.i).b;
            eieu eieuVarK3 = eiiy.k("BackgroundCallbacks.onBackgroundFetchError");
            try {
                egyfVar.c();
                eieuVarK3.close();
                this.i = this.i.g(false);
            } catch (Throwable th6) {
                try {
                    eieuVarK3.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final boolean i() {
        if (!(((egye) this.i).b instanceof egyf) || !this.j.b() || !this.k.b()) {
            return false;
        }
        ejwl.l(((egye) this.i).c);
        return true;
    }
}
