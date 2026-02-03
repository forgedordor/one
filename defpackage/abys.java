package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abys {
    public final String a;
    public final Drawable b;
    private final String c;

    public abys(String str, Drawable drawable) {
        this.c = null;
        this.a = str;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abys)) {
            return false;
        }
        abys abysVar = (abys) obj;
        String str = abysVar.c;
        return fdbq.f(null, null) && fdbq.f(this.a, abysVar.a) && fdbq.f(this.b, abysVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Drawable drawable = this.b;
        return (iHashCode * 31) + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OneGoogleEducationTooltipModel(title=null, subTitle=" + this.a + ", icon=" + this.b + ")";
    }

    public abys() {
        this(null, null);
    }
}
