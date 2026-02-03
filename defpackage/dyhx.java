package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhx extends dyhu {
    public final int a;
    public final Drawable b;
    public final int c;
    public final String d;
    public final int e;
    public final View.OnClickListener f;
    public final dyhv g;
    public final lvv h;
    public final boolean i;
    public final dyhr j;
    public final ejwi k;
    public final ejwi l;

    public dyhx(int i, Drawable drawable, int i2, String str, int i3, View.OnClickListener onClickListener, dyhv dyhvVar, lvv lvvVar, boolean z, dyhr dyhrVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = i;
        this.b = drawable;
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.f = onClickListener;
        this.g = dyhvVar;
        this.h = lvvVar;
        this.i = z;
        this.j = dyhrVar;
        this.k = ejwiVar;
        this.l = ejwiVar2;
    }

    @Override // defpackage.dyhu
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dyhu
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dyhu
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dyhu
    public final Drawable d() {
        return this.b;
    }

    @Override // defpackage.dyhu
    public final View.OnClickListener e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        dyhv dyhvVar;
        lvv lvvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyhu) {
            dyhu dyhuVar = (dyhu) obj;
            if (this.a == dyhuVar.b() && ((drawable = this.b) != null ? drawable.equals(dyhuVar.d()) : dyhuVar.d() == null) && this.c == dyhuVar.a() && this.d.equals(dyhuVar.n()) && this.e == dyhuVar.c() && this.f.equals(dyhuVar.e()) && ((dyhvVar = this.g) != null ? dyhvVar.equals(dyhuVar.k()) : dyhuVar.k() == null) && ((lvvVar = this.h) != null ? lvvVar.equals(dyhuVar.f()) : dyhuVar.f() == null)) {
                dyhuVar.p();
                if (this.i == dyhuVar.o() && this.j.equals(dyhuVar.g()) && this.k.equals(dyhuVar.l()) && this.l.equals(dyhuVar.m())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dyhu
    public final lvv f() {
        return this.h;
    }

    @Override // defpackage.dyhu
    public final dyhr g() {
        return this.j;
    }

    public final int hashCode() {
        Drawable drawable = this.b;
        int iHashCode = (((((((((drawable == null ? 0 : drawable.hashCode()) ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        dyhv dyhvVar = this.g;
        int iHashCode2 = ((iHashCode * 1000003) ^ (dyhvVar == null ? 0 : dyhvVar.hashCode())) * 1000003;
        lvv lvvVar = this.h;
        return ((((((((iHashCode2 ^ (lvvVar != null ? lvvVar.hashCode() : 0)) * (-721379959)) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ 2040732332;
    }

    @Override // defpackage.dyhu
    public final dyhs i() {
        return new dyhw(this);
    }

    @Override // defpackage.dyhu
    public final dyhv k() {
        return this.g;
    }

    @Override // defpackage.dyhu
    public final ejwi l() {
        return this.k;
    }

    @Override // defpackage.dyhu
    public final ejwi m() {
        return this.l;
    }

    @Override // defpackage.dyhu
    public final String n() {
        return this.d;
    }

    @Override // defpackage.dyhu
    public final boolean o() {
        return this.i;
    }

    public final String toString() {
        ejwi ejwiVar = this.l;
        ejwi ejwiVar2 = this.k;
        dyhr dyhrVar = this.j;
        lvv lvvVar = this.h;
        dyhv dyhvVar = this.g;
        View.OnClickListener onClickListener = this.f;
        return "ActionSpec{id=" + this.a + ", icon=" + String.valueOf(this.b) + ", iconResId=" + this.c + ", label=" + this.d + ", veId=" + this.e + ", onClickListener=" + onClickListener.toString() + ", visibilityHandler=" + String.valueOf(dyhvVar) + ", trailingTextContentLiveData=" + String.valueOf(lvvVar) + ", highlightTextRetriever=null, visibleOnIncognito=" + this.i + ", actionType=" + dyhrVar.toString() + ", availabilityChecker=" + String.valueOf(ejwiVar2) + ", customLabelContentDescription=" + String.valueOf(ejwiVar) + "}";
    }

    @Override // defpackage.dyhu
    public final void p() {
    }
}
