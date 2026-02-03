package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxa extends dpxd {
    private final int a;

    public dpxa(int i) {
        this.a = i;
    }

    @Override // defpackage.dpxd
    public final int a(Context context) {
        context.getClass();
        return eehg.d(context, this.a, "HugoColor");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpxa) && this.a == ((dpxa) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String string = Integer.toString(this.a, 16);
        string.getClass();
        return a.a(string, "Color.Attribute(0x", ")");
    }
}
