package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjk {
    final Context a;
    final ActivityManager b;
    float c;
    final rjl d;

    public rjk(Context context) {
        this.c = 1.0f;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new rjl(context.getResources().getDisplayMetrics());
        if (activityManager.isLowRamDevice()) {
            this.c = 0.0f;
        }
    }
}
