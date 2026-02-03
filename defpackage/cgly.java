package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgly extends cgpg {
    public final Uri a;
    public final String b;

    public cgly(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // defpackage.cgpg
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cgpg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgpg) {
            cgpg cgpgVar = (cgpg) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(cgpgVar.a()) : cgpgVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(cgpgVar.b()) : cgpgVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        String str = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Attachment{uri=" + String.valueOf(this.a) + ", contentType=" + this.b + "}";
    }
}
