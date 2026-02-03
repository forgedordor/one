package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kaf extends ReplacementSpan {
    public final int a;
    private final float b;
    private final int c;
    private final float d;
    private final int e;
    private final float f;
    private Paint.FontMetricsInt g;
    private int h;
    private int i;
    private boolean j;

    public kaf(float f, int i, float f2, int i2, float f3, int i3) {
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = i2;
        this.f = f3;
        this.a = i3;
    }

    public final int a() {
        if (!this.j) {
            kfq.c("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final int b() {
        if (!this.j) {
            kfq.c("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    public final Paint.FontMetricsInt c() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        fdbq.c("fontMetrics");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSize(android.graphics.Paint r2, java.lang.CharSequence r3, int r4, int r5, android.graphics.Paint.FontMetricsInt r6) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaf.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
