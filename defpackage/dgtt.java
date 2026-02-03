package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgtt {
    public final dhhc a;
    public final AtomicReference b = new AtomicReference(dgts.UNKNOWN);
    private final dgwa c;
    private final eosc d;

    public dgtt(dgwa dgwaVar, dhhc dhhcVar, eosc eoscVar) {
        this.c = dgwaVar;
        this.a = dhhcVar;
        this.d = eoscVar;
    }

    public final void a() {
        final dgzu dgzuVar = (dgzu) this.c.a(dgzu.class);
        if (Objects.isNull(dgzuVar)) {
            dhja.c("Skipping Chat API flag change detection: InstantMessagingService not configured.", new Object[0]);
        } else {
            eosc eoscVar = this.d;
            eork.r(eoqt.t(eoscVar.submit(new Runnable() { // from class: dgtq
                @Override // java.lang.Runnable
                public final void run() {
                    dgtt dgttVar = this.a;
                    dgts dgtsVar = dgttVar.a.k("enable_simplified_messaging_api", false, "BuglePhenotypeFlagsRelay") ? dgts.SMAPI : dgts.LEGACY;
                    if (dgtsVar.equals((dgts) dgttVar.b.getAndSet(dgtsVar))) {
                        return;
                    }
                    dgzu dgzuVar2 = dgzuVar;
                    dhja.c("Chat API flag detected, disconnecting all sessions.", new Object[0]);
                    dgzuVar2.d(dezf.CONNECTIVITY_CHANGE);
                }
            })), new dgtr(), eoscVar);
        }
    }
}
