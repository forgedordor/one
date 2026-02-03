package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecn implements ecj {
    public final float a;
    private final float b;
    private final boolean c;
    private final fdat d;

    public ecn(float f, boolean z, fdat fdatVar) {
        this.b = f;
        this.c = z;
        this.d = fdatVar;
        this.a = f;
    }

    @Override // defpackage.eci
    public final float a() {
        return this.a;
    }

    @Override // defpackage.eci
    public final void b(kio kioVar, int i, int[] iArr, kji kjiVar, int[] iArr2) {
        int i2;
        int i3;
        int i4;
        int length = iArr.length;
        if (length == 0) {
            return;
        }
        int iEp = kioVar.ep(this.b);
        if (this.c && kjiVar == kji.b) {
            int i5 = length - 1;
            i2 = 0;
            i3 = 0;
            while (i5 >= 0) {
                int i6 = iArr[i5];
                int iMin = Math.min(i2, i - i6);
                iArr2[i5] = iMin;
                int iMin2 = Math.min(iEp, (i - iMin) - i6);
                int i7 = iArr2[i5] + i6 + iMin2;
                i5--;
                i3 = iMin2;
                i2 = i7;
            }
        } else {
            i2 = 0;
            i3 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = iArr[i8];
                int iMin3 = Math.min(i2, i - i10);
                iArr2[i9] = iMin3;
                int iMin4 = Math.min(iEp, (i - iMin3) - i10);
                int i11 = iArr2[i9] + i10 + iMin4;
                i8++;
                i3 = iMin4;
                i2 = i11;
                i9++;
            }
        }
        fdat fdatVar = this.d;
        if (fdatVar == null || (i4 = i2 - i3) >= i) {
            return;
        }
        int iIntValue = ((Number) fdatVar.a(Integer.valueOf(i - i4), kjiVar)).intValue();
        int length2 = iArr2.length;
        for (int i12 = 0; i12 < length2; i12++) {
            iArr2[i12] = iArr2[i12] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecn)) {
            return false;
        }
        ecn ecnVar = (ecn) obj;
        return kir.b(this.b, ecnVar.b) && this.c == ecnVar.c && fdbq.f(this.d, ecnVar.d);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.b) * 31;
        fdat fdatVar = this.d;
        return ((iFloatToIntBits + (true != this.c ? 1237 : 1231)) * 31) + (fdatVar == null ? 0 : fdatVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(true != this.c ? "Absolute" : "");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) kir.a(this.b));
        sb.append(", ");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.ecq
    public final void b(kio kioVar, int i, int[] iArr, int[] iArr2) {
        b(kioVar, i, iArr, kji.a, iArr2);
    }
}
