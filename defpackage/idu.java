package defpackage;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idu {
    public final AutofillManager a;

    public idu(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            this.a.notifyViewVisibilityChanged(view, i, z);
        }
    }
}
