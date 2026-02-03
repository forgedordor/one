package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikh {
    @fcsv
    public static final Rect a(ihu ihuVar) {
        float f = ihuVar.e;
        float f2 = ihuVar.d;
        return new Rect((int) ihuVar.b, (int) ihuVar.c, (int) f2, (int) f);
    }

    public static final Rect b(kjd kjdVar) {
        return new Rect(kjdVar.b, kjdVar.c, kjdVar.d, kjdVar.e);
    }

    public static final RectF c(ihu ihuVar) {
        return new RectF(ihuVar.b, ihuVar.c, ihuVar.d, ihuVar.e);
    }

    public static final ihu d(Rect rect) {
        return new ihu(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final ihu e(RectF rectF) {
        return new ihu(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final kjd f(Rect rect) {
        return new kjd(rect.left, rect.top, rect.right, rect.bottom);
    }
}
