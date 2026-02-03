package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egbq extends egbf {
    public static final ekrg b = ekrg.c("com/google/apps/tiktok/account/data/AccountDataServiceImpl");
    static final Duration c = Duration.ofDays(365);
    public final egcq d;
    public final ScheduledExecutorService e;
    private final egcd f;
    private final egca g;
    private final egyt h;
    private final fcsu i;
    private final diep j;

    public egbq(egcd egcdVar, egcq egcqVar, egca egcaVar, egyt egytVar, fcsu fcsuVar, diep diepVar, ScheduledExecutorService scheduledExecutorService) {
        this.f = egcdVar;
        this.d = egcqVar;
        this.g = egcaVar;
        this.h = egytVar;
        this.i = fcsuVar;
        this.j = diepVar;
        this.e = scheduledExecutorService;
    }

    @Override // defpackage.egbf
    public final egyi a(final efwo efwoVar) {
        return new egys(this.h, new eopk() { // from class: egbm
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(eika.j(this.a.c(efwoVar), new ejvr() { // from class: egbg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((egbe) obj).b();
                    }
                }, eoqg.a));
            }
        }, "com.google.apps.tiktok.account.data.AllAccounts");
    }

    @Override // defpackage.egbf
    public final /* bridge */ /* synthetic */ egyi b() {
        return (egcc) this.i.b();
    }

    @Override // defpackage.egbf
    public final ListenableFuture c(efwo efwoVar) {
        return eika.j(this.f.c(efwoVar), new ejvr() { // from class: egbh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egbe egbeVar = (egbe) obj;
                ekrg ekrgVar = egbq.b;
                int iC = egbeVar.c();
                ejwl.f(iC == 2, "Account must be in ENABLED state, but was %s.", iC != 1 ? iC != 2 ? "DISABLED" : "ENABLED" : "UNSPECIFIED");
                return egbeVar;
            }
        }, eoqg.a);
    }

    @Override // defpackage.egbf
    public final ListenableFuture d(final Duration duration) {
        boolean z = true;
        ejwl.b(!duration.isNegative(), "maxAge cannot be negative");
        if (!duration.equals(a) && duration.compareTo(c) > 0) {
            z = false;
        }
        ejwl.b(z, "Instead of a custom long Duration, use AccountDataService#DONT_CARE");
        final Instant instantF = this.j.f();
        ListenableFuture listenableFutureF = eika.f(j(duration, instantF), egbp.class, new eooz() { // from class: egbi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final egbq egbqVar = this.a;
                final Duration duration2 = duration;
                final Instant instant = instantF;
                ejxr ejxrVarB = eiid.b(new ejxr() { // from class: egbn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        final egbq egbqVar2 = egbqVar;
                        egcq egcqVar = egbqVar2.d;
                        ListenableFuture listenableFutureA = egcqVar.a();
                        egcqVar.d(listenableFutureA);
                        final Duration duration3 = duration2;
                        final Instant instant2 = instant;
                        return eika.k(listenableFutureA, new eooz() { // from class: egbl
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return egbqVar2.j(duration3, instant2);
                            }
                        }, egbqVar2.e);
                    }
                });
                Logger logger = elgb.a;
                elfy elfyVar = new elfy();
                elfyVar.a = ejwi.j(egbqVar.e);
                Duration duration3 = elfq.d;
                return elfyVar.a(ejxrVarB, new elfl(3), ejwr.ALWAYS_TRUE);
            }
        }, this.e);
        eork.r(listenableFutureF, new egbo(), eoqg.a);
        return listenableFutureF;
    }

    @Override // defpackage.egbf
    public final ListenableFuture e() {
        return this.f.f();
    }

    @Override // defpackage.egbf
    public final ListenableFuture f() {
        return this.f.g();
    }

    @Override // defpackage.egbf
    public final ListenableFuture g() {
        return this.g.b();
    }

    @Override // defpackage.egbf
    public final ListenableFuture h(efwo efwoVar) {
        return eika.j(this.f.c(efwoVar), new ejvr() { // from class: egbj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = egbq.b;
                return Boolean.valueOf(((egbe) obj).c() == 2);
            }
        }, eoqg.a);
    }

    @Override // defpackage.egbf
    public final egbe i(efwo efwoVar) {
        return this.f.j(efwoVar);
    }

    public final ListenableFuture j(final Duration duration, final Instant instant) {
        egcd egcdVar = this.f;
        final ListenableFuture listenableFutureE = this.d.e();
        final ListenableFuture listenableFutureE2 = egcdVar.e();
        return eika.d(listenableFutureE, listenableFutureE2).a(new Callable() { // from class: egbk
            @Override // java.util.concurrent.Callable
            public final Object call() throws egbp {
                boolean z;
                ekrg ekrgVar = egbq.b;
                egcx egcxVar = (egcx) eork.q(listenableFutureE);
                boolean z2 = true;
                int i = egcxVar.b & 1;
                Instant instant2 = instant;
                Duration duration2 = duration;
                if (i != 0 && !Instant.ofEpochMilli(egcxVar.c).isBefore(instant2.minus(duration2))) {
                    return (List) eork.q(listenableFutureE2);
                }
                int i2 = egcxVar.b;
                if (1 != (i2 & 1)) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                }
                throw new egbp(z2, egcxVar.c, (i2 & 2) != 0 ? z : false, egcxVar.d, instant2.toEpochMilli(), duration2.toMillis());
            }
        }, this.e);
    }
}
