package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqr extends lqh {
    private TextPaint c;

    public lqr(lqq lqqVar) {
        super(lqqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19, java.lang.CharSequence r20, int r21, int r22, float r23, int r24, int r25, int r26, android.graphics.Paint r27) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r27
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L4b
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r21
            r6 = r22
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L43
            r5 = 0
            r6 = 1
            if (r3 != r6) goto L25
            r3 = r1[r5]
            if (r3 != r0) goto L25
            goto L43
        L25:
            android.text.TextPaint r3 = r0.c
            if (r3 != 0) goto L30
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.c = r3
        L30:
            r4 = r3
            r4.set(r2)
        L34:
            int r3 = r1.length
            if (r5 >= r3) goto L52
            r3 = r1[r5]
            boolean r6 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r6 != 0) goto L40
            r3.updateDrawState(r4)
        L40:
            int r5 = r5 + 1
            goto L34
        L43:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L52
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L52
        L4b:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L52
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
        L52:
            r10 = r4
            if (r10 == 0) goto L83
            int r1 = r10.bgColor
            if (r1 == 0) goto L83
            short r1 = r0.b
            float r1 = (float) r1
            float r8 = r23 + r1
            r1 = r24
            float r7 = (float) r1
            r1 = r26
            float r9 = (float) r1
            int r1 = r10.getColor()
            android.graphics.Paint$Style r3 = r10.getStyle()
            int r4 = r10.bgColor
            r10.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            r5 = r19
            r6 = r23
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r3)
            r10.setColor(r1)
        L83:
            defpackage.lpz.c()
            lqq r1 = r0.a
            r3 = r25
            float r3 = (float) r3
            if (r10 != 0) goto L8e
            r10 = r2
        L8e:
            lqn r2 = r1.b
            android.graphics.Typeface r4 = r2.d
            android.graphics.Typeface r5 = r10.getTypeface()
            r10.setTypeface(r4)
            int r1 = r1.a
            int r13 = r1 + r1
            char[] r12 = r2.b
            r14 = 2
            r11 = r19
            r15 = r23
            r16 = r3
            r17 = r10
            r11.drawText(r12, r13, r14, r15, r16, r17)
            r10.setTypeface(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqr.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
