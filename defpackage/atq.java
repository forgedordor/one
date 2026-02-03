package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atq {
    public final amb a;
    public final Executor b;
    public final atr c;
    public final lvy d;
    final atp e;
    public boolean f = false;
    private final ama g;

    public atq(amb ambVar, auy auyVar, Executor executor) {
        ato atoVar = new ato(this);
        this.g = atoVar;
        this.a = ambVar;
        this.b = executor;
        atp atpVarA = a(auyVar);
        this.e = atpVarA;
        atr atrVar = new atr(atpVarA.a(), atpVarA.b());
        this.c = atrVar;
        atrVar.d(1.0f);
        this.d = new lvy(brd.e(atrVar));
        ambVar.n(atoVar);
    }

    public static atp a(auy auyVar) {
        return (Build.VERSION.SDK_INT < 30 || d(auyVar) == null) ? new aqr(auyVar) : new alf(auyVar);
    }

    private static Range d(auy auyVar) {
        try {
            return (Range) auyVar.c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e) {
            bbs.g("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    public final void b(kog kogVar, bdv bdvVar) {
        bdv bdvVarE;
        if (this.f) {
            this.e.g(((bqu) bdvVar).a, kogVar);
            this.a.d();
            return;
        }
        atr atrVar = this.c;
        synchronized (atrVar) {
            atrVar.d(1.0f);
            bdvVarE = brd.e(atrVar);
        }
        c(bdvVarE);
        kogVar.c(new ayw("Camera is not active."));
    }

    public final void c(bdv bdvVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.d.m(bdvVar);
        } else {
            this.d.j(bdvVar);
        }
    }
}
