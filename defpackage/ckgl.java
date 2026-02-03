package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgl implements ckhw {
    public static final cczi a = cdag.e(cdag.b, "exponential_backoff_max_seconds", 86400);
    public static final cczi b = cdag.e(cdag.b, "provisioning_exponential_backoff_delay", 60);
    public final fcsu c;
    public final eosc d;

    public ckgl(fcsu fcsuVar, eosc eoscVar) {
        this.c = fcsuVar;
        this.d = eoscVar;
    }

    @Override // defpackage.ckhw
    public final int a(String str) {
        try {
            return ((Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cjuu) ((cjxi) this.c.b()).d.l()).j), str, 0)).intValue();
        } catch (evtj e) {
            cqca.n("Bugle", "Exception when getting retry count: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @Override // defpackage.ckhw
    public final eiju b(String str) {
        return ((cjxi) this.c.b()).g(str, 0);
    }

    @Override // defpackage.ckhw
    public final eiju c(final String str) {
        return ((cjxi) this.c.b()).d().h(new ejvr() { // from class: cjwo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (Integer) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cjuu) obj).j), str, 0);
            }
        }, eoqg.a).i(new eooz() { // from class: ckgk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Integer num = (Integer) obj;
                ckgl ckglVar = this.a;
                return ((cjxi) ckglVar.c.b()).g(str, num.intValue() + 1).h(new ejvr() { // from class: ckgj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cczi ccziVar = ckgl.a;
                        int iIntValue = num.intValue();
                        long millis = TimeUnit.SECONDS.toMillis(((Integer) ckgl.b.e()).intValue());
                        long millis2 = TimeUnit.SECONDS.toMillis(((Integer) ckgl.a.e()).intValue());
                        if (Long.numberOfLeadingZeros(millis) - Long.numberOfLeadingZeros(millis2) > iIntValue) {
                            millis2 = millis << iIntValue;
                        }
                        return Duration.ofMillis(millis2);
                    }
                }, ckglVar.d);
            }
        }, this.d);
    }
}
