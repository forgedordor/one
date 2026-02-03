package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cahg;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahg extends cayv {
    static final cczi a = cdag.e(cdag.b, "cms_check_missing_restore_work_on_app_upgrade_max_retry_attempts", 10);
    public static final eksp b = eksp.c("BugleCms");
    public final aurx c;
    public final axky d;
    public final Context e;
    public final eosc f;

    /* compiled from: PG */
    public interface a {
        cpuw fD();
    }

    public cahg(aurx aurxVar, axky axkyVar, Context context, eosc eoscVar) {
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
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsCheckMissingRestoreWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cagq.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 96, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work triggered");
        if (!((Boolean) ((cczi) cpyl.n.get()).e()).booleanValue()) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 98, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work flag not enabled.");
            return eijx.e(cbcw.k());
        }
        if (((caxm) cayyVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.q().i(new eooz() { // from class: cahe
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final cahg cahgVar = this.a;
                        return cahgVar.c.l().i(new eooz() { // from class: cahc
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                int iA = ausa.a(((ausb) obj2).d);
                                if (iA != 0 && iA == 2) {
                                    ((eksl) ((eksl) cahg.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 126, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS package upgrade skipped because upgrade was already performed on this device.");
                                    return eijx.e(cbcw.i());
                                }
                                final cahg cahgVar2 = cahgVar;
                                return cahgVar2.c.k().i(new eooz() { // from class: cagr
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        aumq aumqVar = (aumq) obj3;
                                        aumqVar.getClass();
                                        autt auttVarB = autt.b(aumqVar.f);
                                        if (auttVarB == null) {
                                            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
                                        }
                                        final cahg cahgVar3 = cahgVar2;
                                        if (auttVarB == autt.RESTORE_KEYS) {
                                            return cahgVar3.d.a().i(new eooz() { // from class: cagv
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    eksp ekspVar2 = cahg.b;
                                                    ((eksl) ekspVar2.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 172, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS checking for missing restore work");
                                                    cbfd cbfdVarA = cbfi.a();
                                                    cbfdVarA.A("hasExistingBlockOnTelephonySyncWork");
                                                    cbfdVarA.e(new Function() { // from class: caha
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            cbfh cbfhVar = (cbfh) obj5;
                                                            eksp ekspVar3 = cahg.b;
                                                            cbfhVar.i("cms_block_on_telephony_sync");
                                                            return cbfhVar;
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    });
                                                    boolean zU = cbfdVarA.b().U();
                                                    final cahg cahgVar4 = cahgVar3;
                                                    if (zU) {
                                                        return cahgVar4.c.ap(2).h(new ejvr() { // from class: cagu
                                                            @Override // defpackage.ejvr
                                                            public final Object apply(Object obj5) {
                                                                eksp ekspVar3 = cahg.b;
                                                                return cbcw.i();
                                                            }
                                                        }, eoqg.a);
                                                    }
                                                    ((eksl) ekspVar2.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 174, "CmsCheckMissingRestoreWorkHandler.java")).q("Adding missing restore work");
                                                    eiju eijuVarA = cahgVar4.d.a();
                                                    ejvr ejvrVar = new ejvr() { // from class: cagy
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj5) {
                                                            efwo efwoVar = (efwo) obj5;
                                                            return ((cahg.a) ehlh.a(cahgVar4.e, cahg.a.class, efwoVar)).fD().a(efwoVar, cpyb.MULTI_DEVICE);
                                                        }
                                                    };
                                                    eosc eoscVar = cahgVar4.f;
                                                    eiju eijuVarH = eijuVarA.h(ejvrVar, eoscVar);
                                                    ejvr ejvrVar2 = new ejvr() { // from class: cagz
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj5) {
                                                            eksp ekspVar3 = cahg.b;
                                                            return null;
                                                        }
                                                    };
                                                    eoqg eoqgVar = eoqg.a;
                                                    return eijuVarH.h(ejvrVar2, eoqgVar).i(new eooz() { // from class: cags
                                                        @Override // defpackage.eooz
                                                        public final ListenableFuture a(Object obj5) {
                                                            return cahgVar4.c.ap(2);
                                                        }
                                                    }, eoscVar).h(new ejvr() { // from class: cagt
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj5) {
                                                            eksp ekspVar3 = cahg.b;
                                                            return cbcw.i();
                                                        }
                                                    }, eoqgVar);
                                                }
                                            }, cahgVar3.f).f(axlg.class, new eooz() { // from class: cagw
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    ((eksl) ((eksl) cahg.b.n().g((axlg) obj4)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processUpgradeTask", 191, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work failed with exception.");
                                                    return cahgVar3.c.ap(3).h(new ejvr() { // from class: cagx
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj5) {
                                                            eksp ekspVar2 = cahg.b;
                                                            return cbcw.k();
                                                        }
                                                    }, eoqg.a);
                                                }
                                            }, eoqg.a);
                                        }
                                        ((eksl) ((eksl) cahg.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 140, "CmsCheckMissingRestoreWorkHandler.java")).q("Device is not in RESTORE_KEYS, finishing");
                                        return cahgVar3.c.ap(2).h(new ejvr() { // from class: cahb
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                eksp ekspVar2 = cahg.b;
                                                return cbcw.i();
                                            }
                                        }, eoqg.a);
                                    }
                                }, cahgVar2.f);
                            }
                        }, cahgVar.f);
                    }
                    ((eksl) ((eksl) cahg.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 115, "CmsCheckMissingRestoreWorkHandler.java")).q("Check for missing restore work not performed because multi-device is not enabled on this device");
                    return eijx.e(cbcw.i());
                }
            }, this.f).e(Throwable.class, new ejvr() { // from class: cahf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) ((eksl) cahg.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 158, "CmsCheckMissingRestoreWorkHandler.java")).q("Check for missing restore work failed. Will retry.");
                    return cbcw.m();
                }
            }, eoqg.a);
        }
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsCheckMissingRestoreWorkHandler", "processPendingWorkItemAsync", 103, "CmsCheckMissingRestoreWorkHandler.java")).q("CMS check missing restore work failed because max retry is exceeded.");
        return this.c.ap(3).h(new ejvr() { // from class: cahd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar2 = cahg.b;
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
