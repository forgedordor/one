package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkex {
    public static final Point a(Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        float fIntValue;
        float f;
        int iIntValue;
        if (i4 == 3) {
            double dIntValue = num2.intValue();
            double dIntValue2 = num.intValue();
            double dA = fddu.a(i / num.intValue(), i3 / dIntValue);
            return new Point(fddu.g((int) (dIntValue2 * dA), i), fddu.g((int) (dA * num2.intValue()), i2));
        }
        if (num.intValue() > i || num2.intValue() > i2) {
            float f2 = i;
            float f3 = i2;
            fIntValue = f2 / f3 < ((float) num.intValue()) / ((float) num2.intValue()) ? f2 / num.intValue() : f3 / num2.intValue();
        } else if (i4 == 2) {
            if (num.intValue() > num2.intValue()) {
                f = i;
                iIntValue = num.intValue();
            } else {
                f = i2;
                iIntValue = num2.intValue();
            }
            fIntValue = f / iIntValue;
        } else {
            fIntValue = (num.intValue() < i3 || num2.intValue() < i3) ? i3 / Math.min(num.intValue(), num2.intValue()) : 1.0f;
        }
        float f4 = i;
        if (num.intValue() * fIntValue > f4) {
            return new Point(i, (int) (num2.intValue() * (f4 / num.intValue())));
        }
        float f5 = i2;
        if (num2.intValue() * fIntValue > f5) {
            return new Point((int) (num.intValue() * (f5 / num2.intValue())), i2);
        }
        if (z) {
            return new Point(fddu.i((int) (num.intValue() * fIntValue), i3, Math.max(i3, i)), fddu.i((int) (num2.intValue() * fIntValue), i3, Math.max(i3, i2)));
        }
        return new Point(fddu.i((int) (num.intValue() * fIntValue), i3, i), fddu.i((int) (num2.intValue() * fIntValue), i3, i2));
    }
}
