package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lom implements lof {
    public static final ThreadLocal a = new ThreadLocal();
    public final TextPaint b;

    public lom() {
        TextPaint textPaint = new TextPaint();
        this.b = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
