package defpackage;

import android.graphics.Point;
import android.text.TextUtils;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwv {
    static int a(cqwn cqwnVar) {
        return cqwnVar.a(24, 0);
    }

    public static Point b(cqwn cqwnVar) {
        int iA = a(cqwnVar);
        Point point = new Point(cqwnVar.a(18, -1), cqwnVar.a(19, -1));
        if (iA % 180 != 0) {
            point.set(point.y, point.x);
        }
        return point;
    }

    public static Duration c(cqwn cqwnVar) {
        String strExtractMetadata = cqwnVar.a.extractMetadata(9);
        return Duration.ofMillis(TextUtils.isEmpty(strExtractMetadata) ? 0L : Long.parseLong(strExtractMetadata));
    }
}
