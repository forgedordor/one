package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzvy {
    public volatile dzwd a = dzwc.a;
    public volatile boolean b = true;
    public volatile dzvr c;
    private final dzvu d;

    public dzvy(final Context context, final Executor executor, final dzwc dzwcVar, final eygg eyggVar, boolean z, ejwi ejwiVar, fcsu fcsuVar, dzvu dzvuVar) {
        this.d = dzvuVar;
        this.c = dzvuVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        final fcsu fcsuVar2 = (!z || ejwiVar.g()) ? null : fcsuVar;
        b(new Runnable() { // from class: dzvv
            @Override // java.lang.Runnable
            public final void run() {
                final dzvy dzvyVar = this.a;
                final eygg eyggVar2 = eyggVar;
                Context context2 = context;
                if (dqyw.h(context2)) {
                    dzvyVar.a(eyggVar2);
                } else {
                    final Executor executor2 = executor;
                    dqyw.c(context2, new Runnable() { // from class: dzvw
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dzvy dzvyVar2 = dzvyVar;
                            final eygg eyggVar3 = eyggVar2;
                            dzvy.b(new Runnable() { // from class: dzvx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dzvyVar2.a(eyggVar3);
                                }
                            }, executor2);
                        }
                    });
                }
                if (dzvyVar.b) {
                    fcsu fcsuVar3 = fcsuVar2;
                    dzwc dzwcVar2 = dzwcVar;
                    if (fcsuVar3 == null) {
                        fehc fehcVar = (fehc) fehf.a.createBuilder();
                        fehcVar.copyOnWrite();
                        fehf fehfVar = (fehf) fehcVar.instance;
                        fehfVar.d = 2;
                        fehfVar.b |= 4;
                        dzvyVar.a = dzwcVar2.a(fehcVar.build());
                        return;
                    }
                    try {
                        dzvyVar.a = dzwcVar2.a((fehf) fcsuVar3.b());
                    } catch (Throwable th) {
                        ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchSamplingParameters", (char) 128, "Sampler.java")).q("Couldn't get sampling strategy");
                        fehc fehcVar2 = (fehc) fehf.a.createBuilder();
                        fehcVar2.copyOnWrite();
                        fehf fehfVar2 = (fehf) fehcVar2.instance;
                        fehfVar2.b = 2 | fehfVar2.b;
                        fehfVar2.c = 1L;
                        fehcVar2.copyOnWrite();
                        fehf fehfVar3 = (fehf) fehcVar2.instance;
                        fehfVar3.d = 3;
                        fehfVar3.b |= 4;
                        dzvyVar.a = dzwcVar2.a(fehcVar2.build());
                    }
                }
            }
        }, executor);
    }

    public static void b(Runnable runnable, Executor executor) {
        executor.execute(runnable);
    }

    public final void a(eygg eyggVar) {
        try {
            dzjv dzjvVar = (dzjv) eyggVar.b();
            this.b = dzjvVar.c();
            this.c = this.d.b(dzjvVar.a());
        } catch (Throwable th) {
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(th)).h("com/google/android/libraries/performance/primes/sampling/Sampler", "fetchConfig", 'k', "Sampler.java")).q("Couldn't get config");
            this.b = false;
        }
    }
}
