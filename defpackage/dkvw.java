package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvw implements dkvz {
    public final fdae a;
    public final fdae b;
    private final Uri c;

    public dkvw(Uri uri, fdae fdaeVar, fdae fdaeVar2) {
        this.c = uri;
        this.a = fdaeVar;
        this.b = fdaeVar2;
        dkvs dkvsVar = dkvs.a;
    }

    @Override // defpackage.dkvz
    public final Uri a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkvw)) {
            return false;
        }
        dkvw dkvwVar = (dkvw) obj;
        return fdbq.f(this.c, dkvwVar.c) && fdbq.f(this.a, dkvwVar.a) && fdbq.f(this.b, dkvwVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadedImage(uri=" + this.c + ", onError=" + this.a + ", onClick=" + this.b + ")";
    }
}
