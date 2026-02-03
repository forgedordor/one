package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.StyleSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvf extends MetricAffectingSpan {
    public boolean a;
    public final anue b;
    private final StyleSpan c = new StyleSpan(1);

    public wvf(anue anueVar) {
        this.b = anueVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.c.updateDrawState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        this.c.updateMeasureState(textPaint);
    }
}
