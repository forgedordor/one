package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euma extends eunc {
    private final int a;
    private final int b;
    private final int c;
    private final CharSequence d;
    private final Drawable e;
    private final eunb f;
    private final CharSequence g;
    private final int h;

    public euma(int i, int i2, int i3, CharSequence charSequence, Drawable drawable, eunb eunbVar, CharSequence charSequence2, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = charSequence;
        this.e = drawable;
        this.f = eunbVar;
        this.g = charSequence2;
        this.h = i4;
    }

    @Override // defpackage.eunc
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eunc
    public final int b() {
        return this.a;
    }

    @Override // defpackage.eunc
    public final int c() {
        return this.c;
    }

    @Override // defpackage.eunc
    public final int d() {
        return this.h;
    }

    @Override // defpackage.eunc
    public final Drawable e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eunc) {
            eunc euncVar = (eunc) obj;
            if (this.a == euncVar.b() && this.b == euncVar.a() && this.c == euncVar.c() && this.d.equals(euncVar.h()) && ((drawable = this.e) != null ? drawable.equals(euncVar.e()) : euncVar.e() == null) && this.f.equals(euncVar.f())) {
                euncVar.i();
                CharSequence charSequence = this.g;
                if (charSequence != null ? charSequence.equals(euncVar.g()) : euncVar.g() == null) {
                    if (this.h == euncVar.d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eunc
    public final eunb f() {
        return this.f;
    }

    @Override // defpackage.eunc
    public final CharSequence g() {
        return this.g;
    }

    @Override // defpackage.eunc
    public final CharSequence h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        Drawable drawable = this.e;
        int iHashCode2 = (((iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003) ^ this.f.hashCode();
        CharSequence charSequence = this.g;
        return (((iHashCode2 * (-721379959)) ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003) ^ this.h;
    }

    public final String toString() {
        CharSequence charSequence = this.g;
        eunb eunbVar = this.f;
        Drawable drawable = this.e;
        return "FloatingToolbarMenuItem{itemId=" + this.a + ", groupId=" + this.b + ", order=" + this.c + ", title=" + this.d.toString() + ", icon=" + String.valueOf(drawable) + ", onMenuItemClickListener=" + eunbVar.toString() + ", tooltipText=null, contentDescription=" + String.valueOf(charSequence) + ", showAsAction=" + this.h + "}";
    }

    @Override // defpackage.eunc
    public final void i() {
    }
}
