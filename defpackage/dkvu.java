package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvu implements dkvz {
    public final dkvs a;
    public final fdae b;
    private final Uri c;

    public dkvu(dkvs dkvsVar, Uri uri, fdae fdaeVar) {
        dkvsVar.getClass();
        this.a = dkvsVar;
        this.c = uri;
        this.b = fdaeVar;
    }

    @Override // defpackage.dkvz
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkvu)) {
            return false;
        }
        dkvu dkvuVar = (dkvu) obj;
        return this.a == dkvuVar.a && fdbq.f(this.c, dkvuVar.c) && fdbq.f(this.b, dkvuVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.c;
        return ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Error(type=" + this.a + ", uri=" + this.c + ", onClick=" + this.b + ")";
    }
}
