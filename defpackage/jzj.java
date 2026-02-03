package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzj {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final Rect j = new Rect();
    private final jzd k;
    private jzt l;
    private final int m;
    private final boolean n;
    private final Paint.FontMetricsInt o;
    private final int p;
    private final kad[] q;
    private jzb r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a A[PHI: r8
      0x012a: PHI (r8v8 int) = (r8v7 int), (r8v10 int) binds: [B:58:0x0141, B:51:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jzj(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, defpackage.jzd r36) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzj.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, jzd):void");
    }

    public final float a(int i) {
        if (i == this.f - 1) {
            return this.h + this.i;
        }
        return 0.0f;
    }

    public final float b(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i != this.f + (-1) || (fontMetricsInt = this.o) == null) ? this.e.getLineBaseline(i) : e(i) - fontMetricsInt.ascent);
    }

    public final float c(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f - 1;
        if (i == i2 && (fontMetricsInt = this.o) != null) {
            return this.e.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return this.g + this.e.getLineBottom(i) + (i == i2 ? this.m : 0);
    }

    public final float d(int i) {
        return c(i) - e(i);
    }

    public final float e(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float f(int i, boolean z) {
        return p().a(i, true, z) + a(l(i));
    }

    public final float g(int i, boolean z) {
        return p().a(i, false, z) + a(l(i));
    }

    public final int h() {
        return (this.d ? this.e.getLineBottom(this.f - 1) : this.e.getHeight()) + this.g + this.m + this.p;
    }

    public final int i(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int j(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int k(int i) {
        Layout layout = this.e;
        return (jzl.c(layout, i) && this.b == TextUtils.TruncateAt.END) ? layout.getText().length() : layout.getLineEnd(i);
    }

    public final int l(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int m(int i) {
        return this.e.getLineForVertical(i - this.g);
    }

    public final int n(int i) {
        return this.e.getLineStart(i);
    }

    public final int o(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final jzb p() {
        jzb jzbVar = this.r;
        if (jzbVar != null) {
            return jzbVar;
        }
        jzb jzbVar2 = new jzb(this.e);
        this.r = jzbVar2;
        return jzbVar2;
    }

    public final jzt q() {
        jzt jztVar = this.l;
        if (jztVar != null) {
            return jztVar;
        }
        Layout layout = this.e;
        jzt jztVar2 = new jzt(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.l = jztVar2;
        return jztVar2;
    }

    public final CharSequence r() {
        return this.e.getText();
    }

    public final boolean s(int i) {
        return this.e.isRtlCharAt(i);
    }
}
