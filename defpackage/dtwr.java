package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtwr {
    public static final ekrg a = ekrg.c("com/google/android/libraries/mdi/download/debug/DebugUtil");

    public static ListenableFuture a(final String str, Context context, Executor executor) {
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 62, "DebugUtil.java")).t("Work Info for tag %s", str);
        qee qeeVar = (qee) qbq.a(context);
        WorkDatabase workDatabase = qeeVar.e;
        qmg qmgVar = qeeVar.m;
        workDatabase.getClass();
        qmgVar.getClass();
        return eika.e(eika.j(qlt.a(workDatabase, qmgVar, new qlq(str)), new ejvr() { // from class: dtwm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    ((ekrd) ((ekrd) dtwr.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 73, "DebugUtil.java")).q("No WorkInfo Found");
                    return null;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ekrd) ((ekrd) dtwr.a.h()).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 70, "DebugUtil.java")).t("Work Info: %s", (qbp) it.next());
                }
                return null;
            }
        }, executor), Exception.class, new ejvr() { // from class: dtwn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) dtwr.a.i()).g((Exception) obj)).h("com/google/android/libraries/mdi/download/debug/DebugUtil", "dumpWorkInfo", 83, "DebugUtil.java")).t("Failed to get work info for tag %s", str);
                return null;
            }
        }, executor);
    }
}
