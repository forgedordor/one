package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dphh {
    public static final void a(CharSequence charSequence, View view) {
        view.getClass();
        Snackbar.q(view, charSequence, 0).i();
    }

    public static /* synthetic */ void b(Activity activity, int i) {
        View viewFindViewById = activity.findViewById(R.id.content);
        activity.getClass();
        viewFindViewById.getClass();
        String string = activity.getString(i);
        string.getClass();
        a(string, viewFindViewById);
    }
}
