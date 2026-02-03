package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyfb extends dyhk {
    public final Drawable a;
    public final int b;
    public final ejwi c;
    private final boolean d;

    public dyfb(Drawable drawable, int i, boolean z, ejwi ejwiVar) {
        this.a = drawable;
        this.b = i;
        this.d = z;
        this.c = ejwiVar;
    }

    @Override // defpackage.dyhk
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dyhk
    public final Drawable b() {
        return this.a;
    }

    @Override // defpackage.dyhk
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.dyhk
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyhk) {
            dyhk dyhkVar = (dyhk) obj;
            Drawable drawable = this.a;
            if (drawable != null ? drawable.equals(dyhkVar.b()) : dyhkVar.b() == null) {
                if (this.b == dyhkVar.a() && this.d == dyhkVar.d() && this.c.equals(dyhkVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable == null ? 0 : drawable.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "TintAwareIcon{icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", useTint=" + this.d + ", iconContentDescription=" + String.valueOf(ejwiVar) + "}";
    }
}
