package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crso {
    public final eosc c;
    private final eosd e;
    public static final cczi a = cdag.f(cdag.b, "rcs_service_retry_delay_millis", 500);
    private static final cczi d = cdag.c(cdag.b, "rcs_service_retry_multiplier", 2.0d);
    public static final cczi b = cdag.e(cdag.b, "rcs_service_retry_total_attempts_num", 4);

    public crso(eosc eoscVar, eosd eosdVar) {
        this.c = eoscVar;
        this.e = eosdVar;
    }

    public final eiju a(final Callable callable) {
        Logger logger = elgb.a;
        elfy elfyVar = new elfy();
        eosd eosdVar = this.e;
        elfyVar.b(eosdVar);
        return eiju.g(elfyVar.a(eiid.b(new ejxr() { // from class: crsl
            @Override // defpackage.ejxr
            public final Object get() {
                return eijx.g(callable, this.a.c);
            }
        }), elfq.c(Duration.ofMillis(((Long) a.e()).longValue()), ((Double) d.e()).doubleValue(), ((Integer) b.e()).intValue()), new ejwm() { // from class: crsm
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                cczi ccziVar = crso.a;
                return ((Exception) obj) instanceof efao;
            }
        })).f(elfj.class, new eooz() { // from class: crsn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cczi ccziVar = crso.a;
                return eijx.d(((elfj) obj).getCause());
            }
        }, eosdVar);
    }
}
