package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chbu {
    public final Uri a;

    public chbu(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chbu) && fdbq.f(this.a, ((chbu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RcsGroupInviteLink(inviteUri=" + this.a + ")";
    }
}
