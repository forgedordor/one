package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlcr {
    public final Uri a;
    private final Uri b = null;

    public dlcr(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlcr)) {
            return false;
        }
        dlcr dlcrVar = (dlcr) obj;
        if (!fdbq.f(this.a, dlcrVar.a)) {
            return false;
        }
        Uri uri = dlcrVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Image(uri=" + this.a + ", fallbackUri=null)";
    }
}
