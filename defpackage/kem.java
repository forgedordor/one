package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kem {
    public String a;
    public kdt b;
    public int c = -1;
    public int d = -1;

    public kem(String str) {
        this.a = str;
    }

    public final int a() {
        kdt kdtVar = this.b;
        return kdtVar == null ? this.a.length() : (this.a.length() - (this.d - this.c)) + kdtVar.b();
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            kfq.b(a.s(i2, i, "start index must be less than or equal to end index: ", " > "));
        }
        if (i < 0) {
            kfq.b(a.g(i, "start must be non-negative, but was "));
        }
        kdt kdtVar = this.b;
        if (kdtVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - iMin;
            kdv.a(this.a, cArr, 0, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            kdv.a(this.a, cArr, i4, i2, i5);
            kdu.a(str, cArr, iMin);
            this.b = new kdt(cArr, iMin + str.length(), i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > kdtVar.b()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        if (length > kdtVar.a()) {
            int iA = length - kdtVar.a();
            int i9 = kdtVar.a;
            do {
                i9 += i9;
            } while (i9 - kdtVar.a < iA);
            char[] cArr2 = new char[i9];
            fcur.j(kdtVar.b, cArr2, 0, 0, kdtVar.c);
            int i10 = kdtVar.a;
            int i11 = kdtVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            fcur.j(kdtVar.b, cArr2, i13, i11, i12 + i11);
            kdtVar.b = cArr2;
            kdtVar.a = i9;
            kdtVar.d = i13;
        }
        int i14 = kdtVar.c;
        if (i7 < i14 && i8 <= i14) {
            char[] cArr3 = kdtVar.b;
            int i15 = i14 - i8;
            fcur.j(cArr3, cArr3, kdtVar.d - i15, i8, i14);
            kdtVar.c = i7;
            kdtVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iA2 = i7 + kdtVar.a();
            int iA3 = i8 + kdtVar.a();
            int i16 = kdtVar.d;
            char[] cArr4 = kdtVar.b;
            fcur.j(cArr4, cArr4, i14, i16, iA2);
            i7 = kdtVar.c + (iA2 - i16);
            kdtVar.c = i7;
            kdtVar.d = iA3;
        } else {
            kdtVar.d = i8 + kdtVar.a();
            kdtVar.c = i7;
        }
        kdu.a(str, kdtVar.b, i7);
        kdtVar.c += str.length();
    }

    public final String toString() {
        kdt kdtVar = this.b;
        if (kdtVar == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append(kdtVar.b, 0, kdtVar.c);
        char[] cArr = kdtVar.b;
        int i = kdtVar.d;
        sb.append(cArr, i, kdtVar.a - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
