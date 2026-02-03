package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dste implements dssy {
    public static final eksp a = eksp.c("GnpSdk");
    public final eygg b;
    public final String c;
    public final eygg d;
    private final eosc e;
    private final fcsu f;

    public dste(eosc eoscVar, fcsu fcsuVar, eygg eyggVar, String str, eygg eyggVar2) {
        this.e = eoscVar;
        this.f = fcsuVar;
        this.b = eyggVar;
        this.c = str;
        this.d = eyggVar2;
    }

    @Override // defpackage.dssy
    public final ListenableFuture a() {
        final fcsu fcsuVar = this.f;
        fcsuVar.getClass();
        Callable callableL = eiid.l(new Callable() { // from class: dstc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) fcsuVar.b();
            }
        });
        eosc eoscVar = this.e;
        ListenableFuture listenableFutureG = eooq.g(eoscVar.submit(callableL), eiid.d(new eooz() { // from class: dstd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dste dsteVar = this.a;
                if (zBooleanValue) {
                    dsdp dsdpVar = (dsdp) dsteVar.d.b();
                    return fdxs.b(dsdpVar.b, fcyi.a, fdjz.a, new dsdo(dsdpVar, null));
                }
                ((eksl) ((eksl) dste.a.h()).h("com/google/android/libraries/internal/growth/growthkit/lifecycle/impl/GrowthKitStartupImpl", "schedulePeriodicJobs", 83, "GrowthKitStartupImpl.java")).q("GrowthKit is disabled by Phenotype flag, cancelling jobs.");
                dsdp dsdpVar2 = (dsdp) dsteVar.d.b();
                return fdxs.b(dsdpVar2.b, fcyi.a, fdjz.a, new dsdn(dsdpVar2, null));
            }
        }), eoscVar);
        dxlc.a(listenableFutureG, new ejwy() { // from class: dsta
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                dste dsteVar = this.a;
                ((dxtx) dsteVar.b.b()).h(dsteVar.c, "OK");
            }
        }, new ejwy() { // from class: dstb
            @Override // defpackage.ejwy
            public final void a(Object obj) {
                ((eksl) ((eksl) ((eksl) dste.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/lifecycle/impl/GrowthKitStartupImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 66, "GrowthKitStartupImpl.java")).q("GrowthKit failed to start.");
                dste dsteVar = this.a;
                ((dxtx) dsteVar.b.b()).h(dsteVar.c, "ERROR");
            }
        });
        return listenableFutureG;
    }
}
