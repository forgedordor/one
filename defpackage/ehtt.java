package defpackage;

import android.accounts.Account;
import android.accounts.NetworkErrorException;
import com.google.android.gms.auth.TokenData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehtt extends ehtk {
    public static final /* synthetic */ int f = 0;
    public final dbmr c;
    public final ehtl d;
    public final diep e;
    private final cvw h = new cvw();
    private final eosc i;
    private final eosc j;
    private final egej k;
    static final Duration a = Duration.ofMinutes(5);
    static final Duration b = Duration.ofHours(1);
    private static final ecdw g = new ecdw("debug.tiktok.apiary_token", "");

    public ehtt(eosc eoscVar, eosc eoscVar2, dbmr dbmrVar, ehtl ehtlVar, egej egejVar, diep diepVar) {
        this.i = eoscVar;
        this.j = eoscVar2;
        this.c = dbmrVar;
        this.d = ehtlVar;
        this.k = egejVar;
        this.e = diepVar;
    }

    private final ListenableFuture e() {
        return eork.i(new ehtj(g.a(), this.e.f(), null));
    }

    private static final ehtj f(ListenableFuture listenableFuture) {
        try {
            return (ehtj) eork.q(listenableFuture);
        } catch (ExecutionException unused) {
            return null;
        }
    }

    private static final boolean g() {
        return !g.a().isEmpty();
    }

    @Override // defpackage.ehtk
    public final ListenableFuture a(final efwo efwoVar) {
        return g() ? e() : eork.j(eooq.g(this.k.b(efwoVar), eiid.d(new eooz() { // from class: ehts
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                return str != null ? this.a.c(str) : eork.h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(efwoVar)))));
            }
        }), this.j));
    }

    @Override // defpackage.ehtk
    public final ListenableFuture b(final efwo efwoVar) {
        return g() ? e() : eork.j(eooq.g(this.k.b(efwoVar), eiid.d(new eooz() { // from class: ehtq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                return str != null ? this.a.d(str) : eork.h(new IllegalStateException("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(efwoVar)))));
            }
        }), this.j));
    }

    public final synchronized ListenableFuture c(final String str) {
        ehtj ehtjVarF;
        cvw cvwVar = this.h;
        ListenableFuture listenableFuture = (ListenableFuture) cvwVar.get(str);
        if (listenableFuture == null) {
            ehtjVarF = null;
        } else {
            if (!listenableFuture.isDone()) {
                return listenableFuture;
            }
            ehtjVarF = f(listenableFuture);
        }
        eiju eijuVarE = eijx.e(ehtjVarF);
        eooz eoozVar = new eooz() { // from class: ehtm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ehtj ehtjVar = (ehtj) obj;
                if (ehtjVar == null) {
                    return eorv.a;
                }
                ehtt ehttVar = this.a;
                return drgi.a(ehttVar.c.a(ehtjVar.a));
            }
        };
        eosc eoscVar = this.i;
        eiju eijuVarF = eijuVarE.i(eoozVar, eoscVar).i(new eooz() { // from class: ehtn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ehtt ehttVar = this.a;
                final Instant instantF = ehttVar.e.f();
                return eika.j(drgi.a(ehttVar.c.c(new Account(str, "com.google"), ehttVar.d.a(), null)), new ejvr() { // from class: ehtr
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        TokenData tokenData = (TokenData) obj2;
                        String str2 = tokenData.b;
                        Long l = tokenData.c;
                        int i = ehtt.f;
                        return new ehtj(str2, instantF, (Instant) Optional.ofNullable(l).map(new Function() { // from class: ehtp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Instant.ofEpochSecond(((Long) obj3).longValue());
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(null));
                    }
                }, eoqg.a);
            }
        }, eoscVar).f(IOException.class, new eooz() { // from class: ehto
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i = ehtt.f;
                return eork.h(new NetworkErrorException("Can't get auth token.", (IOException) obj));
            }
        }, eoqg.a);
        cvwVar.put(str, eijuVarF);
        return eijuVarF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (j$.time.Duration.between(r1.b, r4.e.f()).compareTo(defpackage.ehtt.b.minus(defpackage.ehtt.a)) < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.common.util.concurrent.ListenableFuture d(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            cvw r0 = r4.h     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L51
            com.google.common.util.concurrent.ListenableFuture r0 = (com.google.common.util.concurrent.ListenableFuture) r0     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L4b
            boolean r1 = r0.isDone()     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L12
            goto L49
        L12:
            ehtj r1 = f(r0)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L4b
            j$.time.Instant r2 = r1.c     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L2f
            diep r1 = r4.e     // Catch: java.lang.Throwable -> L51
            j$.time.Instant r1 = r1.f()     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r2 = defpackage.ehtt.a     // Catch: java.lang.Throwable -> L51
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L51
            if (r1 > 0) goto L49
            goto L4b
        L2f:
            j$.time.Instant r1 = r1.b     // Catch: java.lang.Throwable -> L51
            diep r2 = r4.e     // Catch: java.lang.Throwable -> L51
            j$.time.Instant r2 = r2.f()     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r1 = j$.time.Duration.between(r1, r2)     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r2 = defpackage.ehtt.b     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r3 = defpackage.ehtt.a     // Catch: java.lang.Throwable -> L51
            j$.time.Duration r2 = r2.minus(r3)     // Catch: java.lang.Throwable -> L51
            int r1 = r1.compareTo(r2)     // Catch: java.lang.Throwable -> L51
            if (r1 >= 0) goto L4b
        L49:
            monitor-exit(r4)
            return r0
        L4b:
            com.google.common.util.concurrent.ListenableFuture r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            return r5
        L51:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehtt.d(java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }
}
