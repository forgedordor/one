package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bws extends bxl {
    private final Uri a;

    public bws(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.a = uri;
    }

    @Override // defpackage.bxl
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxl) {
            return this.a.equals(((bxl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
