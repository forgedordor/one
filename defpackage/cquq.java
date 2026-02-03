package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cquq extends cqut {
    private final Uri a;

    public cquq(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.cqut, defpackage.cqum
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cqum
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqum) {
            cqum cqumVar = (cqum) obj;
            if (cqumVar.e() == 1 && this.a.equals(cqumVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{contentUri=" + this.a.toString() + "}";
    }
}
