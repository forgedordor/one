package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnb implements ehwh {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    public final Context b;
    public final Set c;
    public final ehvf d;
    private final eosc e;

    public egnb(Context context, Map map, eosc eoscVar, ehvf ehvfVar) {
        this.b = context;
        this.c = ((ekgp) map).keySet();
        this.e = eoscVar;
        Boolean bool = false;
        bool.getClass();
        this.d = ehvfVar;
    }

    private final ListenableFuture b(final ehvh ehvhVar) {
        return this.e.submit(eiid.k(new Runnable() { // from class: egmz
            @Override // java.lang.Runnable
            public final void run() {
                final egnb egnbVar = this.a;
                File fileB = egnbVar.d.b(ehvhVar);
                String[] list = fileB.list(new FilenameFilter() { // from class: egmy
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        return egmq.a(str, ":Singleton.db", egnbVar.c);
                    }
                });
                if (list != null) {
                    for (String str : list) {
                        if (new File(fileB, str).delete()) {
                            ((ekrd) ((ekrd) egnb.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 100, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", str);
                        } else {
                            ((ekrd) ((ekrd) egnb.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "clean", 102, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                }
            }
        }));
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        Runnable runnableK = eiid.k(new Runnable() { // from class: egna
            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.a.b;
                for (String str : context.databaseList()) {
                    if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(":Singleton") && !str.endsWith("-wal") && !str.endsWith("-shm")) {
                        if (context.deleteDatabase(str)) {
                            ((ekrd) ((ekrd) egnb.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 75, "OrphanCacheSingletonSynclet.java")).t("Removed orphaned cache file: %s", str);
                        } else {
                            ((ekrd) ((ekrd) egnb.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet", "wipeLegacy", 77, "OrphanCacheSingletonSynclet.java")).t("Failed to remove orphaned cache file: %s", str);
                        }
                    }
                }
            }
        });
        eosc eoscVar = this.e;
        return eork.d(eoscVar.submit(runnableK), b(new ehve(1, 2)), b(new ehve(2, 2))).a(new eopa(null), eoscVar);
    }
}
