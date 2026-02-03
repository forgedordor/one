package defpackage;

import java.io.File;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzn implements ahwe {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps");

    @Override // defpackage.ahwe
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.ahwe
    public final Object b(UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "completeRestore", 64, "StubbedRestoreWorkflowSteps.kt")).t("completeRestore called [%s]", uuid);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object c(UUID uuid, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doAttachmentRestore", 72, "StubbedRestoreWorkflowSteps.kt")).t("doAttachmentRestore called [%s]", uuid);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object d(UUID uuid, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doBugleDbRestore", 68, "StubbedRestoreWorkflowSteps.kt")).t("doBugleDbRestore called [%s]", uuid);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object e(UUID uuid, aiaf aiafVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doCompleteRestore", 76, "StubbedRestoreWorkflowSteps.kt")).t("doCompleteRestore called [%s]", uuid);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object f(UUID uuid, aiba aibaVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "initializeRestore", 35, "StubbedRestoreWorkflowSteps.kt")).D("initializeRestore called for feature [%s] [%s]", aibaVar, uuid);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object g(UUID uuid, File file, szf szfVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestAttachmentRestore", 55, "StubbedRestoreWorkflowSteps.kt")).I("restoreAttachment called with metadata [%s]\n%s\n%s", uuid, file, szfVar);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object h(UUID uuid, File file, szu szuVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestBugleDbRestore", 45, "StubbedRestoreWorkflowSteps.kt")).I("restoreBugleDb called with metadata [%s]\n%s\n%s", uuid, file, szuVar);
        return fctx.a;
    }

    @Override // defpackage.ahwe
    public final Object i(List list, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleRestore");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestRestoreAfterAppUpdate", 80, "StubbedRestoreWorkflowSteps.kt")).q("startRestoreAfterAppUpdate called");
        return fctx.a;
    }
}
