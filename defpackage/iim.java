package defpackage;

import android.graphics.PathMeasure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iim {
    private final PathMeasure a;

    public iim(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final float a() {
        return this.a.getLength();
    }

    public final void b(ikd ikdVar, boolean z) {
        this.a.setPath(((iik) ikdVar).a, z);
    }

    public final void c(float f, float f2, ikd ikdVar) {
        if (!(ikdVar instanceof iik)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f2, ((iik) ikdVar).a, true);
    }
}
