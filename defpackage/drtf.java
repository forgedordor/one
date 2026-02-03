package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtf {
    public final Executor c;
    public final rii d;
    public final float e;
    public int g;
    public final Canvas a = new Canvas();
    public final TextPaint b = new TextPaint();
    public final Rect f = new Rect();

    public drtf(rii riiVar, float f) {
        this.d = riiVar;
        this.e = f;
        if (drtk.a == null) {
            drtk.a(null);
        }
        drtk drtkVar = drtk.a;
        drtkVar.getClass();
        this.c = drle.b(drtkVar.b);
    }

    public static int b(int i, float f) {
        if (i != 0) {
            f = Math.min(i, f);
        }
        return (int) f;
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint) throws InterruptedException {
        d();
        int iCeil = (int) Math.ceil(StaticLayout.getDesiredWidth(charSequence, textPaint));
        d();
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, iCeil).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public static void d() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }

    public final float a(float f, float f2) {
        return Math.max(this.e, (float) Math.floor(f * f2));
    }
}
