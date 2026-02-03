package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ageg implements afzv {
    public final Uri a;
    private final Integer b;
    private final int c = 6;

    public ageg(Uri uri, Integer num) {
        this.a = uri;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ageg)) {
            return false;
        }
        ageg agegVar = (ageg) obj;
        int i = agegVar.c;
        return fdbq.f(this.a, agegVar.a) && fdbq.f(this.b, agegVar.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        return (((uri == null ? 0 : uri.hashCode()) + 186) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PenPalMagicEdit(openingSource=" + ((Object) emyz.b(6)) + ", uri=" + this.a + ", position=" + this.b + ")";
    }
}
