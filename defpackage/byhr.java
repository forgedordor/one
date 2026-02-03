package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byhr implements cldy {
    private static final eksp a = eksp.c("BugleCms");
    private final cahu b;
    private final cahh c;
    private final aurx d;
    private final cago e;

    public byhr(aurx aurxVar, cahu cahuVar, cahh cahhVar, cago cagoVar) {
        this.d = aurxVar;
        this.b = cahuVar;
        this.c = cahhVar;
        this.e = cagoVar;
    }

    @Override // defpackage.cldy
    public final void c() {
        try {
            aurx aurxVar = this.d;
            aumq aumqVarC = aurxVar.c();
            aurw aurwVar = aurxVar.m;
            if (!aurw.g(aumqVarC)) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 72, "CmsAppUpgradeHandlerImpl.java")).q("Cms features are off at the time of package replaced, no app upgrade task will be scheduled");
                return;
            }
            if (((Boolean) ((cczi) cpyl.w.get()).e()).booleanValue()) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 84, "CmsAppUpgradeHandlerImpl.java")).q("Copy MultiDevice and InitialSync status from Cms Object to Box.");
                cago cagoVar = this.e;
                caxy caxyVar = caxy.a;
                caxr caxrVar = new caxr();
                caxrVar.b = "CmsBoxCopyMultiDeviceAndInitialSyncStatus";
                ((cazj) cagoVar.a.b()).a(cbcu.g("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", caxyVar, caxrVar.a()));
            }
            auml aumlVarB = auml.b(aumqVarC.l);
            if (aumlVarB == null) {
                aumlVarB = auml.UNSPECIFIED_STATUS;
            }
            if (!aurw.f(aumlVarB)) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 93, "CmsAppUpgradeHandlerImpl.java")).q("Cms Multi-Device is off at the time of package replaced, cmsSyncStaleStatus and cmsCheckMissingRestore upgrade task will not be scheduled");
                return;
            }
            cahu cahuVar = this.b;
            cahj cahjVar = cahj.a;
            caxr caxrVar2 = new caxr();
            caxrVar2.b = "CmsSyncStaleStatus";
            ((cazj) cahuVar.a.b()).a(cbcu.g("cms_sync_stale_status_on_app_upgrade", cahjVar, caxrVar2.a()));
            if (((Boolean) ((cczi) cpyl.n.get()).e()).booleanValue()) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 104, "CmsAppUpgradeHandlerImpl.java")).q("Scheduling check for missing restore work.");
                cahh cahhVar = this.c;
                cagq cagqVar = cagq.a;
                caxr caxrVar3 = new caxr();
                caxrVar3.b = "CmsCheckForMissingRestoreWork";
                ((cazj) cahhVar.a.b()).a(cbcu.g("cms_check_missing_restore_work_on_app_upgrade", cagqVar, caxrVar3.a()));
            }
        } catch (evtj e) {
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsAppUpgradeHandlerImpl", "onPackageReplaced", 'N', "CmsAppUpgradeHandlerImpl.java")).q("Can't determine Cms feature status, skipping upgrade tasks");
        }
    }
}
