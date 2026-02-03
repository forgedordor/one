package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpo implements lpt {
    public static final ThreadLocal a = new ThreadLocal();
    public final TextPaint b;

    public lpo() {
        TextPaint textPaint = new TextPaint();
        this.b = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
