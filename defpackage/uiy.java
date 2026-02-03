package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uiy {
    public final Activity a;
    public final int b;

    public uiy(Activity activity) {
        this.a = activity;
        this.b = a(activity);
    }

    public static int a(Activity activity) {
        return activity.getWindow().getAttributes().softInputMode;
    }

    public final void b(int i) {
        this.a.getWindow().setSoftInputMode(i);
    }
}
