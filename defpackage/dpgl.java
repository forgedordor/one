package defpackage;

import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgl {
    public final gda a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ColorStateList i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final ColorStateList o;
    public final dpgn p;

    public /* synthetic */ dpgl(gda gdaVar, int i, int i2, int i3, int i4, ColorStateList colorStateList, ColorStateList colorStateList2, int i5, int i6) {
        int iB = (i6 & 2) != 0 ? ijg.b(gdaVar.a) : 0;
        int iB2 = (i6 & 4) != 0 ? ijg.b(gdaVar.s) : 0;
        int iB3 = (i6 & 16) != 0 ? ijg.b(gdaVar.c) : i2;
        int iB4 = (i6 & 32) != 0 ? ijg.b(gdaVar.a) : i3;
        int iB5 = (i6 & 64) != 0 ? ijg.b(gdaVar.h) : 0;
        ColorStateList colorStateListA = (i6 & 256) != 0 ? dpgm.a(iB, iB2) : colorStateList;
        ColorStateList colorStateListA2 = (i6 & 512) != 0 ? dpgm.a(iB, iB2) : colorStateList2;
        int iB6 = ijg.b(gdaVar.a);
        int iB7 = ijg.b(gdaVar.b);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB2);
        ColorStateList colorStateList3 = colorStateListA;
        dpgn dpgnVar = new dpgn(ijg.b(gdaVar.a), ijg.b(gdaVar.H), ijg.b(gdaVar.p));
        colorStateList3.getClass();
        colorStateListA2.getClass();
        colorStateListValueOf.getClass();
        this.a = gdaVar;
        this.b = iB;
        this.c = iB2;
        this.d = i;
        this.e = iB3;
        this.f = iB4;
        this.g = iB5;
        this.h = i4;
        this.i = colorStateList3;
        this.j = colorStateListA2;
        this.k = i5;
        this.l = iB6;
        this.m = iB7;
        this.n = i;
        this.o = colorStateListValueOf;
        this.p = dpgnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgl)) {
            return false;
        }
        dpgl dpglVar = (dpgl) obj;
        return fdbq.f(this.a, dpglVar.a) && this.b == dpglVar.b && this.c == dpglVar.c && this.d == dpglVar.d && this.e == dpglVar.e && this.f == dpglVar.f && this.g == dpglVar.g && this.h == dpglVar.h && fdbq.f(this.i, dpglVar.i) && fdbq.f(this.j, dpglVar.j) && this.k == dpglVar.k && this.l == dpglVar.l && this.m == dpglVar.m && this.n == dpglVar.n && fdbq.f(this.o, dpglVar.o) && fdbq.f(this.p, dpglVar.p);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final String toString() {
        return "HugoColors(colorScheme=" + this.a + ", selected=" + this.b + ", notSelected=" + this.c + ", headerBackground=" + this.d + ", tabBackground=" + this.e + ", selectedTabBackground=" + this.f + ", selectedBottomTabBackground=" + this.g + ", tabForeground=" + this.h + ", categoryTabColorStateList=" + this.i + ", secondaryTabColorStateList=" + this.j + ", searchBarBackground=" + this.k + ", errorButtonBackground=" + this.l + ", errorButtonText=" + this.m + ", backspaceBackground=" + this.n + ", backspaceImageTintList=" + this.o + ", photomojiButtonColors=" + this.p + ")";
    }
}
