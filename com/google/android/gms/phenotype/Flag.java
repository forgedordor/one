package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddyn;
import defpackage.ddzo;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Flag extends AbstractSafeParcelable implements Comparable<Flag> {
    public static final Parcelable.Creator<Flag> CREATOR = new ddyn();
    public final String a;
    final long b;
    final boolean c;
    final double d;
    final String e;
    final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public Flag(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    private static int g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        if (this.g != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        String str = this.e;
        dclh.m(str);
        return str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Flag flag) {
        Flag flag2 = flag;
        int iCompareTo = this.a.compareTo(flag2.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.g;
        int iG = g(i, flag2.g);
        if (iG != 0) {
            return iG;
        }
        int i2 = 0;
        if (i == 1) {
            long j = this.b;
            long j2 = flag2.b;
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
        if (i == 2) {
            boolean z = this.c;
            if (z == flag2.c) {
                return 0;
            }
            return z ? 1 : -1;
        }
        if (i == 3) {
            return Double.compare(this.d, flag2.d);
        }
        if (i == 4) {
            String str = this.e;
            String str2 = flag2.e;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (i != 5) {
            throw new AssertionError(a.g(i, "Invalid enum value: "));
        }
        byte[] bArr = this.f;
        byte[] bArr2 = flag2.f;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        while (true) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (i2 >= Math.min(length2, length)) {
                return g(length2, length);
            }
            int i3 = bArr[i2] - bArr2[i2];
            if (i3 != 0) {
                return i3;
            }
            i2++;
        }
    }

    final void d(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.e;
            dclh.m(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                throw new AssertionError(a.B(i, str, "Invalid type: ", ", "));
            }
            sb.append("'");
            byte[] bArr = this.f;
            dclh.m(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(")");
    }

    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof Flag) {
            Flag flag = (Flag) obj;
            if (ddzo.a(this.a, flag.a) && (i = this.g) == flag.g && this.h == flag.h && this.i == flag.i) {
                if (i != 1) {
                    if (i == 2) {
                        return this.c == flag.c;
                    }
                    if (i == 3) {
                        return this.d == flag.d;
                    }
                    if (i == 4) {
                        return ddzo.a(this.e, flag.e);
                    }
                    if (i == 5) {
                        return Arrays.equals(this.f, flag.f);
                    }
                    throw new AssertionError(a.g(i, "Invalid enum value: "));
                }
                if (this.b == flag.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        if (this.g != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        byte[] bArr = this.f;
        dclh.m(bArr);
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        if (!ddyn.b(str)) {
            dclw.m(parcel, 2, str, false);
        }
        long j = this.b;
        if (j != 0) {
            dclw.j(parcel, 3, j);
        }
        if (this.c) {
            dclw.d(parcel, 4, true);
        }
        double d = this.d;
        if (d != 0.0d) {
            dclw.g(parcel, 5, d);
        }
        String str2 = this.e;
        if (!ddyn.b(str2)) {
            dclw.m(parcel, 6, str2, false);
        }
        byte[] bArr = this.f;
        if (!ddyn.b(bArr)) {
            dclw.f(parcel, 7, bArr, false);
        }
        int i2 = this.g;
        if (!ddyn.a(i2)) {
            dclw.i(parcel, 8, i2);
        }
        int i3 = this.h;
        if (!ddyn.a(i3)) {
            dclw.i(parcel, 9, i3);
        }
        int i4 = this.i;
        if (!ddyn.a(i4)) {
            dclw.i(parcel, 10, i4);
        }
        dclw.c(parcel, iA);
    }
}
