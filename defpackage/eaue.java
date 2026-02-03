package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaue extends eave {
    private final Uri a;

    public eaue(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.eave
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eave)) {
            return false;
        }
        eave eaveVar = (eave) obj;
        Uri uri = this.a;
        return uri == null ? eaveVar.a() == null : uri.equals(eaveVar.a());
    }

    public final int hashCode() {
        Uri uri = this.a;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "FetchResolvedPhotoUriResponse{uri=" + String.valueOf(this.a) + "}";
    }
}
