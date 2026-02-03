package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drox extends drrl {
    private final float a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final CharSequence g;
    private final boolean h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;

    public drox(float f, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, boolean z, boolean z2, int i6, boolean z3, boolean z4) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = charSequence;
        this.h = z;
        this.i = z2;
        this.j = i6;
        this.k = z3;
        this.l = z4;
    }

    @Override // defpackage.drrl
    public final float a() {
        return this.a;
    }

    @Override // defpackage.drrl
    public final int b() {
        return this.j;
    }

    @Override // defpackage.drrl
    public final int c() {
        return this.e;
    }

    @Override // defpackage.drrl
    public final int d() {
        return this.c;
    }

    @Override // defpackage.drrl
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drrl) {
            drrl drrlVar = (drrl) obj;
            drrlVar.r();
            drrlVar.q();
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(drrlVar.a()) && this.b == drrlVar.g() && this.c == drrlVar.d() && this.d == drrlVar.f() && this.e == drrlVar.c() && this.f == drrlVar.e()) {
                drrlVar.n();
                drrlVar.s();
                CharSequence charSequence = this.g;
                if (charSequence != null ? charSequence.equals(drrlVar.h()) : drrlVar.h() == null) {
                    if (this.h == drrlVar.i()) {
                        drrlVar.p();
                        drrlVar.m();
                        drrlVar.u();
                        if (this.i == drrlVar.k() && this.j == drrlVar.b()) {
                            drrlVar.v();
                            drrlVar.o();
                            if (this.k == drrlVar.l() && this.l == drrlVar.j()) {
                                drrlVar.t();
                                drrlVar.w();
                                drrlVar.x();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.drrl
    public final int f() {
        return this.d;
    }

    @Override // defpackage.drrl
    public final int g() {
        return this.b;
    }

    @Override // defpackage.drrl
    public final CharSequence h() {
        return this.g;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) ^ 1305276242;
        CharSequence charSequence = this.g;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        int i = this.b;
        int i2 = iFloatToIntBits * 1000003;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        return ((((((((((((((((((((((((((((i2 ^ i) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * (-721379959)) ^ 1237) * 1000003) ^ iHashCode) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1525764945) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j) * 583896283) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ 1) * 1000003) ^ 1) * 1000003) ^ 1237;
    }

    @Override // defpackage.drrl
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.drrl
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.drrl
    public final boolean k() {
        return this.i;
    }

    @Override // defpackage.drrl
    public final boolean l() {
        return this.k;
    }

    public final String toString() {
        return "EmojiPickerUiOptions{headerLayoutOrientation=HORIZONTAL, headerIconSelectedOverrideTint=0, rows=" + this.a + ", rowHeight=" + this.b + ", maxRecentCount=" + this.c + ", poolSize=" + this.d + ", columns=" + this.e + ", minRowsPerCategory=" + this.f + ", emojiIconBackground=0, hideCategoryTitle=false, selectedEmoji=" + String.valueOf(this.g) + ", displayEmojiVariants=" + this.h + ", emojiPlaceHolderDrawable=0, customEmojiTypeface=0, popupViewController=null, popupWindowFocusable=" + this.i + ", categoryIconMinWidth=" + this.j + ", popupWindowBackgroundDrawable=null, emojiPickerUiBehavior=null, scrollToHeaderPositionOnCategoryChange=" + this.k + ", enableHorizontalCategoryStartMargin=" + this.l + ", highLightSelectedEmojiStatus=UNKNOWN, scrollToInitialEmojiOption=UNKNOWN, useTitleCaseCategoryNames=false}";
    }

    @Override // defpackage.drrl
    public final void m() {
    }

    @Override // defpackage.drrl
    public final void n() {
    }

    @Override // defpackage.drrl
    public final void o() {
    }

    @Override // defpackage.drrl
    public final void p() {
    }

    @Override // defpackage.drrl
    public final void q() {
    }

    @Override // defpackage.drrl
    public final void r() {
    }

    @Override // defpackage.drrl
    public final void s() {
    }

    @Override // defpackage.drrl
    public final void t() {
    }

    @Override // defpackage.drrl
    public final void u() {
    }

    @Override // defpackage.drrl
    public final void v() {
    }

    @Override // defpackage.drrl
    public final void w() {
    }

    @Override // defpackage.drrl
    public final void x() {
    }
}
