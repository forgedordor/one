package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbo implements afzv {
    public final Uri a;
    public final alqm b;
    public final List c;
    public final int d;

    public agbo(Uri uri, alqm alqmVar, int i, List list) {
        list.getClass();
        this.a = uri;
        this.b = alqmVar;
        this.d = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbo)) {
            return false;
        }
        agbo agboVar = (agbo) obj;
        return fdbq.f(this.a, agboVar.a) && fdbq.f(this.b, agboVar.b) && this.d == agboVar.d && fdbq.f(this.c, agboVar.c);
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        alqm alqmVar = this.b;
        return (((((iHashCode * 31) + (alqmVar != null ? alqmVar.hashCode() : 0)) * 31) + this.d) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactEditor(contactUri=" + this.a + ", identity=" + this.b + ", source=" + ((Object) Integer.toString(this.d - 1)) + ", contentValues=" + this.c + ")";
    }
}
