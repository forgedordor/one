package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofr {
    public final String a;
    public final Uri b;

    public aofr() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aofr)) {
            return false;
        }
        aofr aofrVar = (aofr) obj;
        return fdbq.f(this.a, aofrVar.a) && fdbq.f(this.b, aofrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SelfParticipantProperties(fullName=" + this.a + ", profilePhotoUri=" + this.b + ")";
    }

    public aofr(String str, Uri uri) {
        uri.getClass();
        this.a = str;
        this.b = uri;
    }

    public /* synthetic */ aofr(byte[] bArr) {
        this("", Uri.EMPTY);
    }
}
