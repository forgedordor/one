package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfw {
    public final View a;
    public final dnjn b;

    public dpfw(View view, dnjn dnjnVar) {
        this.a = view;
        this.b = dnjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpfw)) {
            return false;
        }
        dpfw dpfwVar = (dpfw) obj;
        return fdbq.f(this.a, dpfwVar.a) && fdbq.f(this.b, dpfwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TextControl(view=" + this.a + ", controller=" + this.b + ")";
    }
}
