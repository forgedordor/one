package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.caht;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caht extends cayv {
    static final cczi a = cdag.e(cdag.b, "cms_sync_stale_status_on_app_upgrade_max_retry_attempts", 5);
    public static final eksp b = eksp.c("BugleCms");
    public final aurx c;
    public final axky d;
    public final Context e;
    public final eosc f;

    /* compiled from: PG */
    public interface a {
        cpmd fu();
    }

    public caht(aurx aurxVar, axky axkyVar, Context context, eosc eoscVar) {
        this.c = aurxVar;
        this.d = axkyVar;
        this.e = context;
        this.f = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsSyncStaleStatusHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cahj.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 90, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade steps triggered");
        if (((caxm) cayyVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.q().i(new eooz() { // from class: cahl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final caht cahtVar = this.a;
                        return cahtVar.c.l().i(new eooz() { // from class: cahp
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                int iA = ausa.a(((ausb) obj2).c);
                                if (iA != 0 && iA == 2) {
                                    ((eksl) ((eksl) caht.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 116, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade skipped because upgrade was already performed on this device.");
                                    return eijx.e(cbcw.i());
                                }
                                final caht cahtVar2 = cahtVar;
                                return cahtVar2.d.a().i(new eooz() { // from class: cahn
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        final caht cahtVar3 = cahtVar2;
                                        caht.a aVar = (caht.a) ehlh.a(cahtVar3.e, caht.a.class, (efwo) obj3);
                                        ((eksl) caht.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processUpgradeTask", 146, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade step starts updating stale status sync");
                                        eiju eijuVarG = aVar.fu().g();
                                        eooz eoozVar = new eooz() { // from class: cahq
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                return cahtVar3.c.aq(2);
                                            }
                                        };
                                        eoqg eoqgVar = eoqg.a;
                                        return eijuVarG.i(eoozVar, eoqgVar).h(new ejvr() { // from class: cahr
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                eksp ekspVar2 = caht.b;
                                                return cbcw.i();
                                            }
                                        }, eoqgVar);
                                    }
                                }, cahtVar2.f).f(axlg.class, new eooz() { // from class: caho
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        ((eksl) ((eksl) caht.b.n().g((axlg) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processUpgradeTask", 161, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade step failed with exception.");
                                        return cahtVar2.c.aq(3).h(new ejvr() { // from class: cahs
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                eksp ekspVar2 = caht.b;
                                                return cbcw.k();
                                            }
                                        }, eoqg.a);
                                    }
                                }, eoqg.a);
                            }
                        }, cahtVar.f);
                    }
                    ((eksl) ((eksl) caht.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 104, "CmsSyncStaleStatusHandler.java")).q("Stale status sync not performed because multi-device is not enabled on the device.");
                    return eijx.e(cbcw.i());
                }
            }, this.f).e(Throwable.class, new ejvr() { // from class: cahm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) ((eksl) caht.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 131, "CmsSyncStaleStatusHandler.java")).q("Cms package upgrade step failed. Will retry.");
                    return cbcw.m();
                }
            }, eoqg.a);
        }
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsSyncStaleStatusHandler", "processPendingWorkItemAsync", 93, "CmsSyncStaleStatusHandler.java")).q("CMS package upgrade steps aborted because max retry is exceeded.");
        return this.c.aq(3).h(new ejvr() { // from class: cahk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar2 = caht.b;
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
