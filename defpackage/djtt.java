package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtt {
    public static final Point a(Integer num, Integer num2, Point point) {
        if (num == null || num2 == null || point == null) {
            return point;
        }
        double dIntValue = num2.intValue() / num.intValue();
        if (dIntValue > point.y / point.x) {
            int iG = fddu.g(point.x, num.intValue());
            return new Point(iG, fdcu.a(iG * dIntValue));
        }
        int iG2 = fddu.g(point.y, num2.intValue());
        return new Point(fdcu.a(iG2 / dIntValue), iG2);
    }
}
