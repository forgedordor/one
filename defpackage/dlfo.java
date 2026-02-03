package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfo extends dlfp {
    public final Uri a;

    public dlfo(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlfo) && fdbq.f(this.a, ((dlfo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResourceUri(uri=" + this.a + ")";
    }
}
