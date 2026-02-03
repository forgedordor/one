package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvx implements dkvz {
    public final String a;
    public final fdae b;
    public final fdae c;
    private final Uri d;

    public dkvx(Uri uri, String str, fdae fdaeVar, fdae fdaeVar2) {
        this.d = uri;
        this.a = str;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        dkvs dkvsVar = dkvs.a;
    }

    @Override // defpackage.dkvz
    public final Uri a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkvx)) {
            return false;
        }
        dkvx dkvxVar = (dkvx) obj;
        return fdbq.f(this.d, dkvxVar.d) && fdbq.f(this.a, dkvxVar.a) && fdbq.f(this.b, dkvxVar.b) && fdbq.f(this.c, dkvxVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.a;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadedVideo(uri=" + this.d + ", duration=" + this.a + ", onError=" + this.b + ", onClick=" + this.c + ")";
    }
}
