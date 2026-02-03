package defpackage;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dma {
    public static final float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
            }
        }
        return 0.0f;
    }

    public static final void b(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public static final float c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT < 31) {
            edgeEffect.onPull(f, f2);
            return f;
        }
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static final void d(EdgeEffect edgeEffect, float f) {
        if (!(edgeEffect instanceof dmp)) {
            edgeEffect.onRelease();
            return;
        }
        dmp dmpVar = (dmp) edgeEffect;
        float f2 = dmpVar.b + f;
        dmpVar.b = f2;
        if (Math.abs(f2) > dmpVar.a) {
            dmpVar.onRelease();
        }
    }

    public static final float e(EdgeEffect edgeEffect, float f, float f2, kio kioVar) {
        float f3 = dmb.a;
        float fEd = kioVar.ed() * 386.0878f;
        double d = dmb.a * fEd * 160.0f * 0.84f;
        if (((float) (d * Math.exp((dmb.b / dmb.c) * Math.log((Math.abs(f) * 0.35f) / d)))) > a(edgeEffect) * f2) {
            return 0.0f;
        }
        b(edgeEffect, fdcu.b(f));
        return f;
    }
}
