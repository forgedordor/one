package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtx extends qbx {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final eigp c;
    private final Map d;

    public egtx(Map map, eigp eigpVar, Map map2) {
        this.b = map;
        this.c = eigpVar;
        this.d = map2;
    }

    @Override // defpackage.qbx
    public final qaq a(Context context, String str, WorkerParameters workerParameters) {
        fcsu fcsuVar;
        String str2;
        try {
            eigp eigpVar = this.c;
            eifp eifpVarG = eigpVar.g("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 69, "WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    ekhx ekhxVarA = egus.a(workerParameters.c);
                    if (ekhxVarA.size() != 1) {
                        ((ekrd) ((ekrd) a.i()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).t("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new dziq(ekhxVarA.size()));
                        eifpVarG.close();
                        return null;
                    }
                    str2 = (String) ekis.l(ekhxVarA);
                    fcsuVar = (fcsu) this.b.get(str2);
                } else {
                    fcsuVar = (fcsu) this.b.get(str);
                    if (fcsuVar != null) {
                        workerParameters.c.add(egus.b(str));
                    }
                    str2 = str;
                }
                fcsu fcsuVar2 = fcsuVar;
                if (fcsuVar2 != null) {
                    if (str2 != null) {
                        TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, eigpVar, this.d, fcsuVar2, workerParameters, eiey.a);
                        eifpVarG.close();
                        return tikTokListenableWorker;
                    }
                    str2 = null;
                }
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    ((ekrd) ((ekrd) a.i()).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).t("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                }
                eifpVarG.close();
                return null;
            } finally {
            }
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).q("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
    }
}
