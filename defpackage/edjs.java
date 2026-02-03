package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edjs extends edjt {
    private final Uri a;

    public edjs(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.edkw
    public final int b() {
        return 2;
    }

    @Override // defpackage.edjt, defpackage.edkw
    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edkw) {
            edkw edkwVar = (edkw) obj;
            if (edkwVar.b() == 2 && this.a.equals(edkwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageIdOrUri{uri=" + this.a.toString() + "}";
    }
}
