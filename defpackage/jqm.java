package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqm {
    public static final ijp a(Resources resources, int i) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new iif(((BitmapDrawable) drawable).getBitmap());
    }

    public static final ijp b(int i, hml hmlVar) {
        Resources resources = (Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        Object obj = hmk.a;
        if (objS == obj) {
            objS = new TypedValue();
            hmwVar.af(objS);
        }
        TypedValue typedValue = (TypedValue) objS;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean zD = hmlVar.D(charSequence.toString());
        Object objS2 = hmwVar.S();
        if (zD || objS2 == obj) {
            objS2 = a(resources, i);
            hmwVar.af(objS2);
        }
        return (ijp) objS2;
    }
}
