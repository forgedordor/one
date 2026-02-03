package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgh {
    public static final dhip a = new dhip(dhja.a);
    public final fcsu b;
    public final chzx c;
    public final fcsu d;
    private final cqbm e;
    private final dhkw f;

    public ahgh(fcsu fcsuVar, chzx chzxVar, cqbm cqbmVar, dhkw dhkwVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = chzxVar;
        this.e = cqbmVar;
        this.f = dhkwVar;
        this.d = fcsuVar2;
    }

    public final eiju a(int i, ewjm ewjmVar) {
        this.c.a();
        try {
            ((ahfv) this.b.b()).a();
        } catch (cayn e) {
            dhja.q("setupVendorIms precondition failed: RemovingNonExistentRowIdException thrown when trying to cancel all pending tasks. Error: %s", e.getMessage());
        }
        if (new dgid(((chza) this.e.a()).w()).d()) {
            dhja.q("setupVendorIms precondition failed: RCS is disabled.", new Object[0]);
        } else {
            dhki dhkiVarA = this.f.a(i);
            dhki dhkiVar = dhki.SINGLE_REG;
            if (dhkiVar.equals(dhkiVarA)) {
                return b(i, ewjo.OPERATION_TYPE_SETUP_VENDOR_IMS, ewjmVar);
            }
            dhja.q("setupVendorIms precondition failed: Expected SipConnectionType: %s. Active version: %s", dhkiVar.name(), dhkiVarA.name());
        }
        dhja.q("setupVendorIms precondition failed, the task will not be scheduled.", new Object[0]);
        return eijx.e(cbcw.k());
    }

    public final eiju b(int i, ewjo ewjoVar, ewjm ewjmVar) {
        dhja.k("[SR]: Scheduling %s task. Trigger: %s", ewjoVar.name(), ewjmVar.name());
        ahfv ahfvVar = (ahfv) this.b.b();
        ahft ahftVar = (ahft) ahfu.a.createBuilder();
        ahftVar.copyOnWrite();
        ahfu ahfuVar = (ahfu) ahftVar.instance;
        ahfuVar.b = 1 | ahfuVar.b;
        ahfuVar.c = i;
        ahftVar.copyOnWrite();
        ahfu ahfuVar2 = (ahfu) ahftVar.instance;
        ahfuVar2.d = ewjoVar.d;
        ahfuVar2.b |= 2;
        ahftVar.copyOnWrite();
        ahfu ahfuVar3 = (ahfu) ahftVar.instance;
        ahfuVar3.e = ewjmVar.l;
        ahfuVar3.b |= 4;
        return ((cazj) ahfvVar.a.b()).b(cbcu.f("vendor_ims_call", (ahfu) ahftVar.build())).i(new eooz() { // from class: ahgg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cazi) obj).a();
            }
        }, (Executor) this.d.b());
    }
}
