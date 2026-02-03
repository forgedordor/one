package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjh {
    public final Uri a;

    public drjh(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final drjh b(String str) {
        return new drjh(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }
}
