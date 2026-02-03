package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvt implements dkvz {
    public final dkvs a;
    public final Uri b;
    public final String c;
    public final fdae d;

    public dkvt(dkvs dkvsVar, Uri uri, String str, fdae fdaeVar) {
        dkvsVar.getClass();
        this.a = dkvsVar;
        this.b = uri;
        this.c = str;
        this.d = fdaeVar;
    }

    @Override // defpackage.dkvz
    public final Uri a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkvt)) {
            return false;
        }
        dkvt dkvtVar = (dkvt) obj;
        return this.a == dkvtVar.a && fdbq.f(this.b, dkvtVar.b) && fdbq.f(this.c, dkvtVar.c) && fdbq.f(this.d, dkvtVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.c;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Downloadable(type=" + this.a + ", uri=" + this.b + ", label=" + this.c + ", onClick=" + this.d + ")";
    }
}
