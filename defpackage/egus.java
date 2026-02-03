package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egus {
    static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    public static final /* synthetic */ int c = 0;

    static ekhx a(Set set) {
        css cssVar = new css(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                cssVar.add(str.substring(13));
            }
        }
        return ekhx.o(cssVar);
    }

    public static String b(String str) {
        return "TikTokWorker#".concat(str);
    }

    public static String c(WorkerParameters workerParameters) {
        return (String) ekis.l(a(workerParameters.c));
    }

    static void d(egsn egsnVar) {
        ekhx ekhxVar = ((egry) egsnVar).i;
        ekqg ekqgVarListIterator = ekhxVar.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            String str = (String) ekqgVarListIterator.next();
            if (a.matcher(str).matches()) {
                throw new egtd(a.a(str, "Tag ", " is reserved by AccountWorkManager."));
            }
        }
        ekqg ekqgVarListIterator2 = ekhxVar.listIterator();
        while (ekqgVarListIterator2.hasNext()) {
            String str2 = (String) ekqgVarListIterator2.next();
            if (b.matcher(str2).matches()) {
                throw new egtd(a.a(str2, "Tag ", " is reserved by TikTokWorkManager."));
            }
        }
    }
}
