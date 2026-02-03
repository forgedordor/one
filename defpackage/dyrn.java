package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyrn extends dyrt {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public dyrn(int i, int i2, int i3, float f, int i4, float f2, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = i4;
        this.f = f2;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
    }

    @Override // defpackage.dyrt
    public final float a() {
        return this.d;
    }

    @Override // defpackage.dyrt
    public final float b() {
        return this.f;
    }

    @Override // defpackage.dyrt
    public final int c() {
        return this.b;
    }

    @Override // defpackage.dyrt
    public final int d() {
        return this.c;
    }

    @Override // defpackage.dyrt
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyrt) {
            dyrt dyrtVar = (dyrt) obj;
            if (this.a == dyrtVar.e() && this.b == dyrtVar.c() && this.c == dyrtVar.d() && Float.floatToIntBits(this.d) == Float.floatToIntBits(dyrtVar.a()) && this.e == dyrtVar.g() && Float.floatToIntBits(this.f) == Float.floatToIntBits(dyrtVar.b()) && this.g == dyrtVar.h() && this.h == dyrtVar.f() && this.i == dyrtVar.i() && this.j == dyrtVar.j() && this.k == dyrtVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyrt
    public final int f() {
        return this.h;
    }

    @Override // defpackage.dyrt
    public final int g() {
        return this.e;
    }

    @Override // defpackage.dyrt
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    @Override // defpackage.dyrt
    public final int i() {
        return this.i;
    }

    @Override // defpackage.dyrt
    public final int j() {
        return this.j;
    }

    @Override // defpackage.dyrt
    public final int k() {
        return this.k;
    }

    public final String toString() {
        return "ExpressSignInAttributes{contentContainerPaddingTop=" + this.a + ", containerExternalHorizontalSpacing=" + this.b + ", containerInternalAdditionalHorizontalSpacing=" + this.c + ", dialogCornerRadius=" + this.d + ", importantBoxBackgroundColor=" + this.e + ", importantBoxCornerRadius=" + this.f + ", importantBoxMarginTop=" + this.g + ", dialogMarginBottom=" + this.h + ", legalDisclaimerBottomPadding=" + this.i + ", legalDisclaimerTopPadding=" + this.j + ", selectedAccountViewMarginVertical=" + this.k + "}";
    }
}
