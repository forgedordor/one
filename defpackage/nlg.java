package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlg {
    public final njv a = new njv();
    public final nle b;
    public final nlf c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    private float p;
    private float q;

    public nlg(Context context) {
        DisplayManager displayManager;
        nle nleVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new nle(this, displayManager);
        this.b = nleVar;
        this.c = nleVar != null ? nlf.a : null;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.f = -1.0f;
        this.g = 1.0f;
        this.h = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE || this.q == 0.0f) {
            return;
        }
        this.q = 0.0f;
        nld.a(surface, 0.0f);
    }

    public final void b() {
        this.k = 0L;
        this.n = -1L;
        this.l = -1L;
    }

    public final void c(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.i = refreshRate;
            this.j = (refreshRate * 80) / 100;
        } else {
            mff.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
        }
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 30 || this.e == null) {
            return;
        }
        njv njvVar = this.a;
        float fB = njvVar.a() ? njvVar.a() ? (float) (1.0E9d / njvVar.a.b()) : -1.0f : this.f;
        float f = this.p;
        if (fB != f) {
            if (fB != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (njvVar.a()) {
                    if ((njvVar.a() ? njvVar.a.b : -9223372036854775807L) >= 5000000000L) {
                        f2 = 0.02f;
                    }
                }
                if (Math.abs(fB - this.p) < f2) {
                    return;
                }
            } else if (fB == -1.0f && njvVar.e < 30) {
                return;
            }
            this.p = fB;
            e(false);
        }
    }

    public final void e(boolean z) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.h == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.p;
            if (f2 != -1.0f) {
                f = this.g * f2;
            }
        }
        if (z || this.q != f) {
            this.q = f;
            nld.a(surface, f);
        }
    }
}
