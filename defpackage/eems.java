package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eems {
    public final View a;
    public final int b;
    public final int c;
    protected final int d;
    public aao e;
    private final TimeInterpolator f = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public eems(View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = eepx.a(context, R.attr.motionDurationMedium2, 300);
        this.c = eepx.a(context, R.attr.motionDurationShort3, 150);
        this.d = eepx.a(context, R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final aao b() {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        aao aaoVar = this.e;
        this.e = null;
        return aaoVar;
    }

    public final aao c() {
        aao aaoVar = this.e;
        this.e = null;
        return aaoVar;
    }

    protected final aao d(aao aaoVar) {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        aao aaoVar2 = this.e;
        this.e = aaoVar;
        return aaoVar2;
    }
}
