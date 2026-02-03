package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxb extends dpxd {
    public final int a;

    public dpxb(int i) {
        this.a = i;
    }

    @Override // defpackage.dpxd
    public final int a(Context context) {
        context.getClass();
        return context.getColor(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpxb) && this.a == ((dpxb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String string = Integer.toString(this.a, 16);
        string.getClass();
        return a.a(string, "Color.Resource(resource=0x", ")");
    }
}
