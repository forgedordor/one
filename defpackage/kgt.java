package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgt extends CharacterStyle implements UpdateAppearance {
    private final ina a;

    public kgt(ina inaVar) {
        this.a = inaVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ina inaVar = this.a;
            if (fdbq.f(inaVar, inc.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(inaVar instanceof ind)) {
                throw new fctg();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ind indVar = (ind) inaVar;
            textPaint.setStrokeWidth(indVar.a);
            textPaint.setStrokeMiter(indVar.b);
            int i = indVar.d;
            textPaint.setStrokeJoin(ikv.a(i, 0) ? Paint.Join.MITER : ikv.a(i, 1) ? Paint.Join.ROUND : ikv.a(i, 2) ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = indVar.c;
            textPaint.setStrokeCap(iku.a(i2, 0) ? Paint.Cap.BUTT : iku.a(i2, 1) ? Paint.Cap.ROUND : iku.a(i2, 2) ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
