package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kad implements LineHeightSpan {
    public final float a;
    public final boolean b;
    public final float c;
    public final boolean d;
    public int e;
    public int f;
    private final int g;
    private final boolean h;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    public kad(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.a = f;
        this.g = i;
        this.h = z;
        this.b = z2;
        this.c = f2;
        this.d = z3;
        if ((f2 < 0.0f || f2 > 1.0f) && f2 != -1.0f) {
            kfq.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (kae.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.g;
        if (z && z2 && this.h && this.b) {
            return;
        }
        if (this.i == Integer.MIN_VALUE) {
            int iCeil = (int) Math.ceil(this.a);
            int iA = iCeil - kae.a(fontMetricsInt);
            if (!this.d || iA > 0) {
                float fAbs = this.c;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / kae.a(fontMetricsInt);
                }
                int iCeil2 = fontMetricsInt.descent + ((int) (iA <= 0 ? Math.ceil(iA * fAbs) : Math.ceil(iA * (1.0f - fAbs))));
                this.k = iCeil2;
                int i5 = iCeil2 - iCeil;
                this.j = i5;
                if (this.h) {
                    i5 = fontMetricsInt.ascent;
                }
                this.i = i5;
                this.l = this.b ? fontMetricsInt.descent : this.k;
                this.e = fontMetricsInt.ascent - this.i;
                this.f = this.l - fontMetricsInt.descent;
            } else {
                this.j = fontMetricsInt.ascent;
                int i6 = fontMetricsInt.descent;
                this.k = i6;
                this.i = this.j;
                this.l = i6;
                this.e = 0;
                this.f = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.i : this.j;
        fontMetricsInt.descent = z2 ? this.l : this.k;
    }
}
