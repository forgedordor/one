package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dst {
    public final float[] a;
    private final List b;
    private final int c;

    public dst(List list, float[] fArr) {
        this.b = list;
        this.a = fArr;
        if (list.size() != fArr.length) {
            ebs.c("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + fcur.L(fArr));
        }
        this.c = fArr.length;
    }

    public final float a(Object obj) {
        int iIndexOf = this.b.indexOf(obj);
        fdap fdapVar = dro.b;
        if (iIndexOf >= 0) {
            float[] fArr = this.a;
            if (iIndexOf < fArr.length) {
                return fArr[iIndexOf];
            }
        }
        return ((Number) fdapVar.invoke(Integer.valueOf(iIndexOf))).floatValue();
    }

    public final Object b(float f) {
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                return this.b.get(i2);
            }
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                f2 = fAbs;
            }
            if (fAbs <= f2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
    }

    public final Object c(float f, boolean z) {
        int i = 0;
        float f2 = Float.POSITIVE_INFINITY;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[] fArr = this.a;
            if (i >= fArr.length) {
                return this.b.get(i2);
            }
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                f2 = f4;
            }
            if (f4 <= f2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dst)) {
            return false;
        }
        dst dstVar = (dst) obj;
        return fdbq.f(this.b, dstVar.b) && Arrays.equals(this.a, dstVar.a) && this.c == dstVar.c;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + Arrays.hashCode(this.a)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fcva.Q(this.b, i));
            sb2.append('=');
            float[] fArr = this.a;
            sb2.append((i < 0 || i >= fArr.length) ? ((Number) dro.b.invoke(Integer.valueOf(i))).floatValue() : fArr[i]);
            sb.append(sb2.toString());
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
