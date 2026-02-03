package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csz {
    public float[] a;
    public int b;

    public csz(int i) {
        this.a = i == 0 ? ctc.a : new float[i];
    }

    public static /* synthetic */ String c(csz cszVar, CharSequence charSequence, CharSequence charSequence2, int i) {
        String str = 1 != (i & 1) ? null : ", ";
        str.getClass();
        if ((i & 2) != 0) {
            charSequence = "";
        }
        charSequence.getClass();
        if ((i & 4) != 0) {
            charSequence2 = "";
        }
        charSequence2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        float[] fArr = cszVar.a;
        int i2 = cszVar.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append(charSequence2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) str);
            }
            sb.append(f);
            i3++;
        }
        return sb.toString();
    }

    public final float a(int i) {
        if (i < 0 || i >= this.b) {
            cwh.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final float b() {
        if (this.b == 0) {
            cwh.d("FloatList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof csz) {
            csz cszVar = (csz) obj;
            int i = cszVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = cszVar.a;
                fddq fddqVarR = fddu.r(0, i2);
                int i3 = fddqVarR.a;
                int i4 = fddqVarR.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iFloatToIntBits = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i2]) * 31;
        }
        return iFloatToIntBits;
    }

    public final String toString() {
        return c(this, "[", "]", 25);
    }
}
