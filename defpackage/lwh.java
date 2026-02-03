package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwh {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Activity activity, lva lvaVar) {
        lvaVar.getClass();
        if (activity instanceof lvo) {
            ((lvo) activity).a().e(lvaVar);
        } else if (activity instanceof lvj) {
            lvc lvcVarP = ((lvj) activity).P();
            if (lvcVarP instanceof lvn) {
                ((lvn) lvcVarP).e(lvaVar);
            }
        }
    }

    public static final void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            lwi lwiVar = lwj.Companion;
            lwi.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new lwk(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
