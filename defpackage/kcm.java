package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcm {
    public static final Typeface a(Typeface typeface, kca kcaVar, Context context) {
        ThreadLocal threadLocal = kcq.a;
        if (typeface == null) {
            return null;
        }
        List list = kcaVar.a;
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = kcq.a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        kii.a(context);
        paint.setFontVariationSettings(kjw.d(list, null, new fdap() { // from class: kcp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                kbz kbzVar = (kbz) obj;
                ThreadLocal threadLocal3 = kcq.a;
                return "'" + kbzVar.a + "' " + kbzVar.b;
            }
        }, 31));
        return paint.getTypeface();
    }

    public static final kcj b() {
        return Build.VERSION.SDK_INT >= 28 ? new kck() : new kcl();
    }
}
