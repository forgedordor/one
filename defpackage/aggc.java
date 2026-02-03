package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggc {
    public final String a;
    public final Uri b;

    public aggc(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aggc)) {
            return false;
        }
        aggc aggcVar = (aggc) obj;
        return fdbq.f(this.a, aggcVar.a) && fdbq.f(this.b, aggcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TypedUri(contentType=" + this.a + ", uri=" + cqcy.d(this.b);
    }
}
