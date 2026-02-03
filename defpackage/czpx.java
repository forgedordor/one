package defpackage;

import android.app.Activity;
import android.support.constraint.Guideline;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpx {
    private final Activity a;
    private final Guideline b;
    private final Guideline c;
    private final Guideline d;
    private final Guideline e;

    public czpx(Activity activity, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4) {
        this.a = activity;
        this.b = guideline;
        this.c = guideline2;
        this.d = guideline3;
        this.e = guideline4;
    }

    public final void a() {
        int i;
        Activity activity = this.a;
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation() * 90;
        int iB = dakl.b(activity);
        boolean z = activity.getResources().getConfiguration().getLayoutDirection() == 1;
        if (z) {
            if (rotation == 90) {
                rotation = 90;
                i = iB;
            }
            i = 0;
        } else {
            if (rotation == 270) {
                rotation = 270;
                i = iB;
            }
            i = 0;
        }
        if (rotation != (true == z ? 270 : 90)) {
            iB = 0;
        }
        if (z) {
            dajh.b(this.b, i);
        } else {
            dajh.a(this.b, i);
        }
        if (z) {
            dajh.a(this.d, iB);
        } else {
            dajh.b(this.d, iB);
        }
        dajh.a(this.c, dakl.c(activity));
        dajh.b(this.e, activity.isInMultiWindowMode() ? dakl.b(activity) : dakl.a(activity));
    }
}
