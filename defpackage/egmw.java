package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmw implements ehwh {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet");
    public final Set b;
    private final egip c;
    private final eosc d;

    public egmw(Map map, egip egipVar, eosc eoscVar) {
        this.b = ((ekgp) map).keySet();
        this.c = egipVar;
        this.d = eoscVar;
        Boolean bool = false;
        bool.getClass();
    }

    private final ListenableFuture b(final ehvh ehvhVar) {
        final egip egipVar = this.c;
        return eooq.f(egipVar.d.submit(eiid.l(new Callable() { // from class: egio
            @Override // java.util.concurrent.Callable
            public final Object call() {
                egip egipVar2 = egipVar;
                File file = new File(egipVar2.b.b(ehvhVar), egip.b(egipVar2.c));
                file.mkdirs();
                return file;
            }
        })), new ejvr() { // from class: egmu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final egmw egmwVar = this.a;
                File[] fileArrListFiles = ((File) obj).listFiles(new FilenameFilter() { // from class: egmv
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file, String str) {
                        return egmq.a(str, ".db", egmwVar.b);
                    }
                });
                if (fileArrListFiles == null) {
                    return null;
                }
                for (File file : fileArrListFiles) {
                    if (file.delete()) {
                        ((ekrd) ((ekrd) egmw.a.h()).h("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 71, "OrphanCacheAccountSynclet.java")).t("Removed orphaned cache file: %s", file);
                    } else {
                        ((ekrd) ((ekrd) egmw.a.i()).h("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet", "clean", 73, "OrphanCacheAccountSynclet.java")).t("Failed to remove orphaned cache file: %s", file);
                    }
                }
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return eork.d(b(new ehve(1, 2)), b(new ehve(2, 2))).a(new eopa(null), this.d);
    }
}
