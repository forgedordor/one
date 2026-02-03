package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuk implements dkul {
    public final Uri a;

    public dkuk(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkuk) && fdbq.f(this.a, ((dkuk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RichCardActionIconUri(iconUri=" + this.a + ")";
    }
}
