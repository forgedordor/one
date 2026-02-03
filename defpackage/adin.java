package defpackage;

import android.app.Activity;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adin {
    private static final eksp a = eksp.c("BugleInAppUpdate");

    public static void a(Activity activity, adjv adjvVar) {
        eeji eejiVar = new eeji(activity, R.style.InAppUpgradeDialogStyle);
        eejiVar.v(adjvVar.a);
        eejiVar.l(adjvVar.b);
        eejiVar.s(adjvVar.c, adjvVar.f);
        eejiVar.n(adjvVar.d, adjvVar.e);
        eejiVar.i(false);
        iv ivVarA = eejiVar.a();
        b(ivVarA.b(-1));
        b(ivVarA.b(-2));
    }

    private static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        if (layoutParams == null) {
            ((eksl) a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdateDialogLauncher", "centerDialogButton", 45, "InAppUpdateDialogLauncher.java")).q("Unable to center buttons in the in app update warning dialog; layout params are null");
        } else {
            layoutParams.gravity = 17;
            button.setLayoutParams(layoutParams);
        }
    }
}
