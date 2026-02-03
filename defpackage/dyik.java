package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyik extends dyit {
    public final Drawable a;
    public final int b;
    private final int c;
    private final String d;
    private final int e;
    private final View.OnClickListener f;
    private final dyhv g;
    private final lvy h;
    private final ejwi i;

    public dyik(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, dyhv dyhvVar, lvy lvyVar, ejwi ejwiVar) {
        this.c = i;
        this.a = drawable;
        this.b = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = dyhvVar;
        this.h = lvyVar;
        this.i = ejwiVar;
    }

    @Override // defpackage.dyit
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dyit
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dyit
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dyit
    public final Drawable d() {
        return this.a;
    }

    @Override // defpackage.dyit
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        dyhv dyhvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyit) {
            dyit dyitVar = (dyit) obj;
            if (this.c == dyitVar.b() && ((drawable = this.a) != null ? drawable.equals(dyitVar.d()) : dyitVar.d() == null) && this.b == dyitVar.a() && this.d.equals(dyitVar.i()) && this.e == dyitVar.c() && this.f.equals(dyitVar.e()) && ((dyhvVar = this.g) != null ? dyhvVar.equals(dyitVar.g()) : dyitVar.g() == null) && this.h.equals(dyitVar.f())) {
                dyitVar.j();
                if (this.i.equals(dyitVar.h())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dyit
    public final lvy f() {
        return this.h;
    }

    @Override // defpackage.dyit
    public final dyhv g() {
        return this.g;
    }

    @Override // defpackage.dyit
    public final ejwi h() {
        return this.i;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.c ^ 1000003) * 1000003)) * 1000003) ^ this.b) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        dyhv dyhvVar = this.g;
        return (((((iHashCode * 1000003) ^ (dyhvVar != null ? dyhvVar.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * (-721379959)) ^ 2040732332;
    }

    @Override // defpackage.dyit
    public final String i() {
        return this.d;
    }

    public final String toString() {
        return "CustomActionSpec{id=" + this.c + ", icon=" + String.valueOf(this.a) + ", iconResId=" + this.b + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + this.f.toString() + ", visibilityHandler=" + String.valueOf(this.g) + ", trailingTextLiveData=" + this.h.toString() + ", highlightTextRetriever=null, availabilityChecker=Optional.absent()}";
    }

    @Override // defpackage.dyit
    public final void j() {
    }
}
