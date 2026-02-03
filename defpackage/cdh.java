package defpackage;

import android.util.Rational;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdh {
    public static final int a(int i, Rational rational) {
        if (!b(rational)) {
            return fdcu.b(i * rational.floatValue());
        }
        Objects.toString(rational);
        bbs.f("CaptureEncodeRates", "Invalid capture-to-encode ratio: ".concat(rational.toString()));
        return i;
    }

    public static final boolean b(Rational rational) {
        return fdbq.f(rational, Rational.NaN) || fdbq.f(rational, Rational.ZERO) || fdbq.f(rational, Rational.NEGATIVE_INFINITY) || fdbq.f(rational, Rational.POSITIVE_INFINITY);
    }
}
