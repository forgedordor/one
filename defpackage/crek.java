package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crek {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner");

    public static void a(cogw cogwVar, Context context) {
        File[] fileArrListFiles;
        long epochMilli = cogwVar.f().toEpochMilli();
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || !cacheDir.exists() || (fileArrListFiles = cacheDir.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if ((file.getName().startsWith("hobbes") || file.getName().startsWith("multi_") || file.getName().startsWith("quantized_model") || file.getName().startsWith("sensitive_classifier") || file.getName().startsWith("smarts_cache_item_")) && epochMilli - file.lastModified() > Duration.ofDays(((Integer) crem.a.e()).intValue()).toMillis()) {
                if (file.delete()) {
                    ekrw ekrwVarE = a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 44, "SmartsCacheCleaner.java")).t("Deleted stale file %s", file.getName());
                } else {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 46, "SmartsCacheCleaner.java")).t("Failed to deleted stale file %s", file.getName());
                }
            }
        }
    }
}
