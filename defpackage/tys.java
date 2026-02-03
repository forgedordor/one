package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tys implements ual {
    private static final eksp b = eksp.c("BugleCms");
    public final txe a;
    private final fcsu c;
    private final cpmc d;
    private final eosc e;

    public tys(fcsu fcsuVar, cpmc cpmcVar, txe txeVar, eosc eoscVar) {
        this.c = fcsuVar;
        this.d = cpmcVar;
        this.a = txeVar;
        this.e = eoscVar;
    }

    @Override // defpackage.ual
    public final /* bridge */ /* synthetic */ ListenableFuture a(eqmo eqmoVar) {
        if (eqmoVar.b != 9) {
            ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleEvent", 47, "BoxMetadataEventHandler.java")).t("Cannot handle event of type %s", eqmn.a(eqmoVar.b));
            return eijx.e(null);
        }
        eqjj eqjjVar = (eqjj) eqmoVar.c;
        int iB = eqji.b(eqjjVar.b);
        if (iB == 0) {
            iB = 1;
        }
        if (iB - 2 != 1) {
            ekrw ekrwVarN = b.n();
            ekrz ekrzVar = bzmz.t;
            int iB2 = eqji.b(eqjjVar.b);
            ekrwVarN.X(ekrzVar, eqji.a(iB2 != 0 ? iB2 : 1));
            ekrwVarN.X(bzmz.w, eqjjVar.c);
            ekrwVarN.X(bzmz.x, "Not implemented");
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleEvent", 62, "BoxMetadataEventHandler.java")).q("BoxMetadataEvent received");
            return eijx.e(null);
        }
        ekrw ekrwVarN2 = b.n();
        ekrz ekrzVar2 = bzmz.t;
        int iB3 = eqji.b(eqjjVar.b);
        ekrwVarN2.X(ekrzVar2, eqji.a(iB3 != 0 ? iB3 : 1));
        ekrwVarN2.X(bzmz.w, eqjjVar.c);
        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleBoxDevicesUpdatedEvent", 73, "BoxMetadataEventHandler.java")).q("BoxMetadataEvent received");
        if (cpyl.a()) {
            tzc tzcVar = (tzc) this.c.b();
            return auvw.c(tzcVar.c, fcyi.a, fdjz.a, new tzb(tzcVar, null));
        }
        cpmc cpmcVar = this.d;
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("box_devices");
        return cpmcVar.k((evrw) evrvVar.build()).i(new eooz() { // from class: tyr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a.a((eqiz) obj);
            }
        }, this.e);
    }
}
