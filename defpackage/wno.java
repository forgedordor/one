package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wno {
    public final wnq a;
    public final Uri b;

    public wno(wnq wnqVar, Uri uri) {
        this.a = wnqVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wno)) {
            return false;
        }
        wno wnoVar = (wno) obj;
        return fdbq.f(this.a, wnoVar.a) && fdbq.f(this.b, wnoVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.b;
        String strD = uri != null ? cqcy.d(uri) : null;
        return "DraftAttachmentContent(mapiContent=" + this.a + ", originalUri=" + strD + ")";
    }
}
