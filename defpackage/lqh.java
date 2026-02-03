package defpackage;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lqh extends ReplacementSpan {
    public final lqq a;
    private final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short b = -1;
    private float d = 1.0f;

    public lqh(lqq lqqVar) {
        lcg.j(lqqVar, "rasterizer cannot be null");
        this.a = lqqVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
        lqq lqqVar = this.a;
        this.d = fAbs / lqqVar.d();
        lqqVar.d();
        this.b = (short) ((lqqVar.f().b(12) != 0 ? r1.b.getShort(r3 + r1.a) : (short) 0) * this.d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return this.b;
    }
}
