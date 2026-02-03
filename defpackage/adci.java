package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adci {
    public static void a(Activity activity, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        View viewFindViewById = activity.findViewById(R.id.start_chat_fab);
        Snackbar snackbarR = Snackbar.r(activity, activity.getWindow().getDecorView().getRootView(), charSequence, 0);
        if (viewFindViewById != null) {
            snackbarR.m(viewFindViewById);
            snackbarR.l = true;
        }
        if (!TextUtils.isEmpty(charSequence2) && onClickListener != null) {
            snackbarR.s(charSequence2, onClickListener);
        }
        snackbarR.i();
    }

    public static void b(Activity activity, CharSequence charSequence) {
        a(activity, charSequence, null, null);
    }
}
