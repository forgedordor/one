package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egq {
    private static final FillElement a = new FillElement(2, 1.0f);
    private static final FillElement b = new FillElement(1, 1.0f);
    private static final FillElement c = new FillElement(3, 1.0f);
    private static final WrapContentElement d = ehz.c(ibw.k);
    private static final WrapContentElement e = ehz.c(ibw.j);
    private static final WrapContentElement f = ehz.a(ibw.n);
    private static final WrapContentElement g = ehz.a(ibw.m);
    private static final WrapContentElement h = ehz.b(ibw.e);
    private static final WrapContentElement i = ehz.b(ibw.a);

    public static /* synthetic */ ics A(ics icsVar) {
        ibx ibxVar = ibw.k;
        return icsVar.a(fdbq.f(ibxVar, ibxVar) ? d : fdbq.f(ibxVar, ibw.j) ? e : ehz.c(ibxVar));
    }

    public static final ics a(ics icsVar, float f2, float f3) {
        return icsVar.a(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static final ics b(ics icsVar, float f2) {
        return icsVar.a(f2 == 1.0f ? b : new FillElement(1, f2));
    }

    public static final ics c(ics icsVar, float f2) {
        return icsVar.a(f2 == 1.0f ? c : new FillElement(3, f2));
    }

    public static final ics d(ics icsVar, float f2) {
        return icsVar.a(f2 == 1.0f ? a : new FillElement(2, f2));
    }

    public static final ics e(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final ics f(ics icsVar, float f2, float f3) {
        return icsVar.a(new SizeElement(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static final ics g(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final ics h(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(f2, f2, f2, f2, false));
    }

    public static final ics i(ics icsVar, float f2, float f3) {
        return icsVar.a(new SizeElement(f2, f3, f2, f3, false));
    }

    public static final ics j(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static final ics k(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(f2, f2, f2, f2, true));
    }

    public static final ics l(ics icsVar, long j) {
        return m(icsVar, kiw.b(j), kiw.a(j));
    }

    public static final ics m(ics icsVar, float f2, float f3) {
        return icsVar.a(new SizeElement(f2, f3, f2, f3, true));
    }

    public static final ics n(ics icsVar, float f2, float f3, float f4, float f5) {
        return icsVar.a(new SizeElement(f2, f3, f4, f5, true));
    }

    public static final ics o(ics icsVar, float f2) {
        return icsVar.a(new SizeElement(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final ics p(ics icsVar, float f2, float f3) {
        return icsVar.a(new SizeElement(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static /* synthetic */ ics q(ics icsVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return a(icsVar, f2, f3);
    }

    public static /* synthetic */ ics u(ics icsVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return f(icsVar, f2, f3);
    }

    public static /* synthetic */ ics w(ics icsVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return n(icsVar, f2, f3, f4, f5);
    }

    public static /* synthetic */ ics x(ics icsVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return p(icsVar, f2, f3);
    }

    public static /* synthetic */ ics y(ics icsVar) {
        icc iccVar = ibw.n;
        return icsVar.a(fdbq.f(iccVar, iccVar) ? f : fdbq.f(iccVar, ibw.m) ? g : ehz.a(iccVar));
    }

    public static /* synthetic */ ics z(ics icsVar, iby ibyVar, int i2) {
        if ((i2 & 1) != 0) {
            ibyVar = ibw.e;
        }
        return icsVar.a(fdbq.f(ibyVar, ibw.e) ? h : fdbq.f(ibyVar, ibw.a) ? i : ehz.b(ibyVar));
    }
}
