package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypr extends dypt {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final ejwi g;

    public dypr(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, ejwi ejwiVar) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = ejwiVar;
    }

    @Override // defpackage.dypt
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dypt
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dypt
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dypt
    public final Drawable d() {
        return this.b;
    }

    @Override // defpackage.dypt
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dypt) {
            dypt dyptVar = (dypt) obj;
            if (this.a == dyptVar.b() && ((drawable = this.b) != null ? drawable.equals(dyptVar.d()) : dyptVar.d() == null) && this.c == dyptVar.a() && this.d.equals(dyptVar.g()) && this.e == dyptVar.c() && this.f.equals(dyptVar.e()) && this.g.equals(dyptVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dypt
    public final ejwi f() {
        return this.g;
    }

    @Override // defpackage.dypt
    public final String g() {
        return this.d;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        return (((((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "SimpleActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + this.f.toString() + ", availabilityChecker=Optional.absent()}";
    }
}
