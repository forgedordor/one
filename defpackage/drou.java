package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drou extends drpq {
    private final int a;
    private final int b;
    private final boolean c;
    private final CharSequence d;

    public drou(int i, int i2, boolean z, CharSequence charSequence) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = charSequence;
    }

    @Override // defpackage.drpq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.drpq
    public final int b() {
        return this.a;
    }

    @Override // defpackage.drpq
    public final CharSequence c() {
        return this.d;
    }

    @Override // defpackage.drpq
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drpq) {
            drpq drpqVar = (drpq) obj;
            if (this.a == drpqVar.b() && this.b == drpqVar.a()) {
                drpqVar.e();
                drpqVar.f();
                drpqVar.g();
                if (this.c == drpqVar.d()) {
                    drpqVar.h();
                    CharSequence charSequence = this.d;
                    if (charSequence != null ? charSequence.equals(drpqVar.c()) : drpqVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.d;
        int iHashCode = charSequence == null ? 0 : charSequence.hashCode();
        int i = this.a;
        return iHashCode ^ ((((((i ^ 1000003) * 1000003) ^ this.b) * 1525764945) ^ (true != this.c ? 1237 : 1231)) * (-721379959));
    }

    public final String toString() {
        return "EmojiListOptions{rowHeight=" + this.a + ", columns=" + this.b + ", emojiIconBackground=0, emojiPlaceHolderDrawable=0, popupViewController=null, popupWindowFocusable=" + this.c + ", popupWindowBackgroundDrawable=null, selectedEmoji=" + String.valueOf(this.d) + "}";
    }

    @Override // defpackage.drpq
    public final void e() {
    }

    @Override // defpackage.drpq
    public final void f() {
    }

    @Override // defpackage.drpq
    public final void g() {
    }

    @Override // defpackage.drpq
    public final void h() {
    }
}
