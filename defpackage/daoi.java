package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daoi {
    public final Uri a;
    public final String b;
    public final String[] c;

    public daoi(Uri uri, String str, String[] strArr) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daoi)) {
            return false;
        }
        daoi daoiVar = (daoi) obj;
        return fdbq.f(this.a, daoiVar.a) && fdbq.f(this.b, daoiVar.b) && fdbq.f(this.c, daoiVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String[] strArr = this.c;
        return iHashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        return "FileInfoQueryParameterList(uri=" + this.a + ", selection=" + this.b + ", selectionArgs=" + Arrays.toString(this.c) + ")";
    }
}
