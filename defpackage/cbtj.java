package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtj {
    public final Uri a;
    public final cbtf b;

    public cbtj(Uri uri, cbtf cbtfVar) {
        this.a = uri;
        this.b = cbtfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbtj)) {
            return false;
        }
        cbtj cbtjVar = (cbtj) obj;
        return fdbq.f(this.a, cbtjVar.a) && fdbq.f(this.b, cbtjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EncryptedFile(uri=" + this.a + ", metadata=" + this.b + ")";
    }
}
