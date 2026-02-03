package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acby {
    public static final cqce a = cqce.g("Lighter", "LighterExpressSignInDelegate");

    public final void a(Activity activity, int i, int i2) {
        eeji eejiVar = new eeji(activity);
        eejiVar.u(i);
        eejiVar.k(i2);
        eejiVar.r(R.string.lighter_esi_failure_dialog_common_acknowledge_button, null);
        eejiVar.create().show();
    }
}
