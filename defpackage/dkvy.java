package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvy implements dkvz {
    public final dkvs a;
    public final Uri b;
    public final Float c;
    public final fdae d;

    public dkvy(dkvs dkvsVar, Uri uri, Float f, fdae fdaeVar) {
        dkvsVar.getClass();
        this.a = dkvsVar;
        this.b = uri;
        this.c = f;
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
        if (!(obj instanceof dkvy)) {
            return false;
        }
        dkvy dkvyVar = (dkvy) obj;
        return this.a == dkvyVar.a && fdbq.f(this.b, dkvyVar.b) && fdbq.f(this.c, dkvyVar.c) && fdbq.f(this.d, dkvyVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Float f = this.c;
        return ((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Loading(type=" + this.a + ", uri=" + this.b + ", progress=" + this.c + ", onClick=" + this.d + ")";
    }
}
