package defpackage;

import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehab extends ehac {
    public ehae a;
    public final egpl b;

    public ehab(ea eaVar, Executor executor) {
        egpl egplVar = new egpl(executor, true, false, false);
        this.b = egplVar;
        egplVar.d();
        eaVar.P().c(new eijk(new ehaa(this, eaVar)));
    }

    @Override // defpackage.ehac
    public final void a(final egyi egyiVar, final egzv egzvVar) {
        ecem.c();
        ejwl.m(!(egzvVar instanceof egyf), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.b.execute(new Runnable() { // from class: egzz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(egyiVar, new egym(), egzvVar);
            }
        });
    }

    @Override // defpackage.ehac
    public final void b(final egyi egyiVar, final egzr egzrVar, final egzv egzvVar) {
        ecem.c();
        ejwl.m(!(egzvVar instanceof egyf), "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
        this.b.execute(new Runnable() { // from class: egzy
            @Override // java.lang.Runnable
            public final void run() {
                ehae ehaeVar = this.a.a;
                final egzr egzrVar2 = egzrVar;
                ehaeVar.a(egyiVar, new ehar() { // from class: egyl
                    @Override // defpackage.ehar
                    public final int a(Instant instant, egyh egyhVar, boolean z) {
                        if (egyhVar.e() && egyhVar.f()) {
                            if (!egyhVar.c().isBefore(instant.minus(egzrVar2.k))) {
                                return 2;
                            }
                        }
                        if (z || !egyhVar.e()) {
                            return egyhVar.e() ? 3 : 1;
                        }
                        return 2;
                    }
                }, egzvVar);
            }
        });
    }
}
