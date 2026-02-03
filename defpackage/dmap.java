package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmap {
    public final Uri a;
    public final ebsu b;

    public dmap(Uri uri, ebsu ebsuVar) {
        uri.getClass();
        ebsuVar.getClass();
        this.a = uri;
        this.b = ebsuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmap)) {
            return false;
        }
        dmap dmapVar = (dmap) obj;
        return fdbq.f(this.a, dmapVar.a) && fdbq.f(this.b, dmapVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FileAudioSourceConfiguration(audioUri=" + this.a + ", sourcePolicy=" + this.b + ")";
    }
}
