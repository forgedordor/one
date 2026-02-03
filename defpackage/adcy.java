package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class adcy {
    public static float a(adct adctVar) {
        adcp adcpVar = (adcp) adctVar;
        View view = adcpVar.g.a;
        boolean z = true;
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
            view.setOutlineProvider(new adcr());
        }
        float f = adcpVar.h;
        ColorStateList colorStateListValueOf = null;
        if (f != 0.0f && Math.abs(f) != view.getWidth()) {
            colorStateListValueOf = ColorStateList.valueOf(cuiu.c(view.getContext()));
        }
        view.setBackgroundTintList(colorStateListValueOf);
        Canvas canvas = adcpVar.e;
        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), adcpVar.d);
        float f2 = adcpVar.a.getResources().getDisplayMetrics().density;
        float f3 = 48.0f * f2;
        int i = (int) (f2 * 12.0f);
        int i2 = (int) f3;
        canvas.translate(f > 0.0f ? view.getLeft() + i : (view.getRight() - i2) - i, view.getTop() + ((view.getHeight() - i2) / 2));
        addh addhVar = adcpVar.b;
        canvas.scale(addhVar.a(), addhVar.a());
        Drawable drawable = adcpVar.c;
        float fAbs = Math.abs(f) / adcpVar.f.getWidth();
        boolean z2 = adcpVar.j;
        addhVar.d(drawable, fAbs, z2);
        drawable.draw(canvas);
        view.invalidateOutline();
        if (!z2) {
            return 0.0f;
        }
        float width = adcpVar.k * view.getWidth();
        float f4 = -width;
        boolean z3 = f < f4 || f > width;
        float f5 = adcpVar.i;
        if (f5 >= f4 && f5 <= width) {
            z = false;
        }
        if (z3 != z) {
            view.performHapticFeedback(4);
        }
        return f;
    }
}
