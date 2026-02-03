package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ahfq implements ahfn {
    static final cczv a = cdag.e(cdag.b, "setup_vendor_ims_delay_ms", 5000);
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final eosd f;
    private final eosd g;
    private final fcsu h;
    private final fcsu i;

    public ahfq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosd eosdVar, eosd eosdVar2, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = eosdVar;
        this.g = eosdVar2;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
    }

    @Override // defpackage.ahfn
    public final eiju a(final ahfr ahfrVar) {
        eiju eijuVarE;
        if (((arhh) this.i.b()).a()) {
            dhja.q("[SR]: SingleRegistrationProvisioningEventHandler is deprecated.", new Object[0]);
            return eijx.e(null);
        }
        eosd eosdVar = this.g;
        ahff ahffVar = (ahff) ahfrVar;
        if (!((dgrs) this.c.b()).G(ahffVar.a)) {
            dhja.q("[SR]: There's no valid configuration available. Skipping RcsEngine init.", new Object[0]);
            eijuVarE = eijx.e(new RcsEngineLifecycleServiceResult(0));
        } else if (dfpk.t()) {
            dhja.k("[SR]: Called RcsEngineLifecycleManagerV2 to init RcsEngine in SR mode.", new Object[0]);
            cies ciesVar = (cies) this.h.b();
            final int i = ahffVar.b;
            eijuVarE = ciesVar.a(new cier() { // from class: ciee
                @Override // defpackage.cier
                public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                    return rcsEngineLifecycleServiceV2.initialize(i, 2);
                }
            }, true);
        } else {
            dhja.c("RcsSettings__enableRcsEngineInitializationByBugle is disabled. Skipping RcsEngine init.", new Object[0]);
            eijuVarE = eijx.e(new RcsEngineLifecycleServiceResult(0));
        }
        return eijuVarE.i(new eooz() { // from class: ahfp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ahfq ahfqVar = this.a;
                chza chzaVar = (chza) ((cqbm) ahfqVar.d.b()).a();
                ahff ahffVar2 = (ahff) ahfrVar;
                String str = ahffVar2.a;
                chzaVar.p(new dggp(str), chyx.SINGLE_REGISTRATION_PROVISIONING_EVENT);
                dhja.k("[SR]: Triggered RcsAvailability update.", new Object[0]);
                ((dgqr) ahfqVar.b.b()).s(str, ((dgrs) ahfqVar.c.b()).j(str));
                dhja.k("[SR]: Notified Provisioning API about configuration change.", new Object[0]);
                if (!ahffVar2.c) {
                    return eijx.e(null);
                }
                dhja.k("[SR]: Triggering setupVendorIms in RCS process with %d ms delay.", ahfq.a.e());
                return eiju.g(ahfqVar.f.schedule(new Callable() { // from class: ahfo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((clea) ahfqVar.e.b()).A();
                        return null;
                    }
                }, ((Integer) r1.e()).intValue(), TimeUnit.MILLISECONDS));
            }
        }, eosdVar);
    }
}
