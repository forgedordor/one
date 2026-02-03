package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aveh {
    public final Uri a;
    public final String[] b;
    public final ehvv c;
    public final fdap d;

    public aveh(Uri uri, String[] strArr, ehvv ehvvVar, fdap fdapVar) {
        this.a = uri;
        this.b = strArr;
        this.c = ehvvVar;
        this.d = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aveh)) {
            return false;
        }
        aveh avehVar = (aveh) obj;
        return fdbq.f(this.a, avehVar.a) && fdbq.f(this.b, avehVar.b) && fdbq.f(this.c, avehVar.c) && fdbq.f(this.d, avehVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "QueryParameters(uri=" + this.a + ", projection=" + Arrays.toString(this.b) + ", selection=" + this.c + ", parser=" + this.d + ")";
    }
}
