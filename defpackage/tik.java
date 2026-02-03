package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tik {
    public final String a;
    public final Uri b;
    public final String c;
    public final fdat d;
    private final fcsu e;

    public tik(String str, Uri uri, fcsu fcsuVar, String str2, fdat fdatVar) {
        this.a = str;
        this.b = uri;
        this.e = fcsuVar;
        this.c = str2;
        this.d = fdatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tik)) {
            return false;
        }
        tik tikVar = (tik) obj;
        return fdbq.f(this.a, tikVar.a) && fdbq.f(this.b, tikVar.b) && fdbq.f(this.e, tikVar.e) && fdbq.f(this.c, tikVar.c) && fdbq.f(this.d, tikVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return (((((((iHashCode * 31) + (uri != null ? uri.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantListItemUiData(normalizedDestination=" + this.a + ", avatarUri=" + this.b + ", imageManagerProvider=" + this.e + ", displayName=" + this.c + ", unblockAction=" + this.d + ")";
    }
}
