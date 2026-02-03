package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdk implements afzv {
    public final Spannable a;
    public final ClickableSpan b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    public agdk(Spannable spannable, ClickableSpan clickableSpan, int i, int i2, float f, float f2) {
        clickableSpan.getClass();
        this.a = spannable;
        this.b = clickableSpan;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdk)) {
            return false;
        }
        agdk agdkVar = (agdk) obj;
        return fdbq.f(this.a, agdkVar.a) && fdbq.f(this.b, agdkVar.b) && this.c == agdkVar.c && this.d == agdkVar.d && Float.compare(this.e, agdkVar.e) == 0 && Float.compare(this.f, agdkVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "LinkifySpanViewer{" + cqcv.b(this.b.toString()) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + "}";
    }
}
