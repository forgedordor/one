package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiy {
    public static final jiy a = new jiy();

    private jiy() {
    }

    public final void a(View view, boolean z) {
        if (z) {
            view.setContentSensitivity(1);
        } else {
            view.setContentSensitivity(0);
        }
    }
}
