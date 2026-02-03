package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cacf implements caaq {
    public static final eksp a = eksp.c("BugleCms");
    public final eosc b;
    public final cden c;
    public final apqc d;
    private final aurx e;

    /* compiled from: PG */
    public interface a {
        cpmd fu();
    }

    public cacf(aurx aurxVar, cden cdenVar, apqc apqcVar, eosc eoscVar) {
        this.e = aurxVar;
        this.c = cdenVar;
        this.d = apqcVar;
        this.b = eoscVar;
    }

    @Override // defpackage.caas
    public final /* synthetic */ int a(Object obj) {
        return ((bzzx) obj).c;
    }

    @Override // defpackage.caaq
    public final /* bridge */ /* synthetic */ eiju c(cayy cayyVar, Object obj, Object obj2) {
        final a aVar = (a) obj;
        eiju eijuVarA = this.e.m.a();
        eooz eoozVar = new eooz() { // from class: cacc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj3) {
                if (!((Boolean) obj3).booleanValue()) {
                    ((eksl) ((eksl) cacf.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "processCmsWorkItemAsync", 76, "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Update InitialSyncStatus not performed because no cms feature is enabled on this device");
                    return eijx.e(cbcw.i());
                }
                return aVar.fu().g().h(new ejvr() { // from class: caca
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj4) {
                        eksp ekspVar = cacf.a;
                        return cbcw.i();
                    }
                }, eoqg.a).e(axkg.class, new ejvr() { // from class: cacb
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj4) {
                        ((eksl) ((eksl) cacf.a.n().g((axkg) obj4)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "setInitialSyncStatusOnServer", 124, "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Linked account removed when update InitialSyncStatus");
                        return cbcw.k();
                    }
                }, this.a.b);
            }
        };
        eosc eoscVar = this.b;
        return eijuVarA.i(eoozVar, eoscVar).e(fbtf.class, new ejvr() { // from class: cacd
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                fbtf fbtfVar = (fbtf) obj3;
                if (cpzi.a(fbtfVar.a)) {
                    return cbcw.m();
                }
                cacf cacfVar = this.a;
                ((eksl) ((eksl) ((eksl) cacf.a.j()).g(fbtfVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetInitialSyncStatusOnServerWorkItemProcessor", "processCmsWorkItemAsync", '[', "CmsSetInitialSyncStatusOnServerWorkItemProcessor.java")).q("Unable to update InitialSyncStatus");
                if (cacfVar.d.a()) {
                    cpri.c("Uncaught exception", fbtfVar);
                } else {
                    auvh.h(cacfVar.c.b(fbtfVar));
                }
                return cbcw.k();
            }
        }, eoscVar).e(Exception.class, new ejvr() { // from class: cace
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                Exception exc = (Exception) obj3;
                cacf cacfVar = this.a;
                if (cacfVar.d.a()) {
                    cpri.b("Uncaught exception", exc);
                } else {
                    auvh.h(cacfVar.c.b(exc));
                }
                return cbcw.m();
            }
        }, eoscVar);
    }
}
