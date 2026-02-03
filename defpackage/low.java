package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class low extends lop {
    public low(lol lolVar) {
        super(lolVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        lok.b();
        lol lolVar = this.a;
        lov lovVar = lolVar.b;
        Typeface typeface = lovVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = lolVar.a;
        canvas.drawText(lovVar.b, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
