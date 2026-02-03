package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atur extends atus {
    public final Uri a;

    public atur(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atur) && fdbq.f(this.a, ((atur) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(uploadedContentUrl=" + this.a + ")";
    }
}
