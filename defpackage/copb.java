package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class copb extends copy {
    private final Uri a;
    private final Uri b;

    public copb(Uri uri, Uri uri2) {
        if (uri == null) {
            throw new NullPointerException("Null tempFileUri");
        }
        this.a = uri;
        this.b = uri2;
    }

    @Override // defpackage.copy
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.copy
    public final Uri b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof copy) {
            copy copyVar = (copy) obj;
            if (this.a.equals(copyVar.b()) && ((uri = this.b) != null ? uri.equals(copyVar.a()) : copyVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Uri uri = this.b;
        return (iHashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.b;
        return "FileDownloadUris{tempFileUri=" + this.a.toString() + ", telephonyUri=" + String.valueOf(uri) + "}";
    }
}
