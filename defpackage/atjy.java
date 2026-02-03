package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjy {
    public final atis a;
    public final Uri b;
    public final aubx c;

    public atjy(atis atisVar, Uri uri, aubx aubxVar) {
        this.a = atisVar;
        this.b = uri;
        this.c = aubxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atjy)) {
            return false;
        }
        atjy atjyVar = (atjy) obj;
        return fdbq.f(this.a, atjyVar.a) && fdbq.f(this.b, atjyVar.b) && fdbq.f(this.c, atjyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        aubx aubxVar = this.c;
        return iHashCode2 + (aubxVar != null ? aubxVar.hashCode() : 0);
    }

    public final String toString() {
        return "UploadResumeInfo(transferHandle=" + this.a + ", fileUri=" + this.b + ", contentType=" + this.c + ")";
    }
}
