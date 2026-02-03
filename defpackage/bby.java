package defpackage;

import android.graphics.PointF;
import android.util.Rational;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bby {
    public Rational a = null;

    protected abstract PointF a(float f, float f2);

    public final bbx b(float f, float f2, float f3) {
        PointF pointFA = a(f, f2);
        return new bbx(pointFA.x, pointFA.y, f3, this.a);
    }
}
