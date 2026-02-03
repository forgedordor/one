package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzp extends jzo {
    private final CharSequence a;
    private final TextPaint b;

    public jzp(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.jzo
    public final int a(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.jzo
    public final int d(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
