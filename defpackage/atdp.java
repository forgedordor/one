package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atdp extends atdr {
    private final Uri a;

    public atdp(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.atef
    public final int b() {
        return 1;
    }

    @Override // defpackage.atdr, defpackage.atef
    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atef) {
            atef atefVar = (atef) obj;
            if (atefVar.b() == 1 && this.a.equals(atefVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadUri=" + this.a.toString() + "}";
    }
}
