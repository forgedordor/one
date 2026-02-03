package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpx implements egbu {
    private static final cqce a = cqce.g("Lighter", "LighterAccountCleanupInterceptor");
    private final fcsu b;

    public cdpx(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.egbu
    public final ListenableFuture b(egbv egbvVar) {
        fcsu fcsuVar = this.b;
        if (((Optional) fcsuVar.b()).isEmpty() || !cdpn.a()) {
            return eork.i(null);
        }
        a.p("Start Lighter cleanup task for removed account");
        return ((cdpy) ((Optional) fcsuVar.b()).get()).e(((egdc) egbvVar).b);
    }
}
