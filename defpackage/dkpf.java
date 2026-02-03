package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpf implements dkpi {
    public final Uri a;
    public final Boolean b;
    public final String c;
    public final Uri d;
    private final int e;

    public /* synthetic */ dkpf(Uri uri, Boolean bool, String str, int i, Uri uri2, int i2) {
        uri.getClass();
        i = (i2 & 8) != 0 ? 1 : i;
        if (i == 0) {
            throw null;
        }
        int i3 = i2 & 16;
        int i4 = i2 & 2;
        int i5 = i2 & 4;
        uri2 = i3 != 0 ? null : uri2;
        bool = i4 != 0 ? null : bool;
        str = i5 != 0 ? null : str;
        this.a = uri;
        this.b = bool;
        this.c = str;
        this.e = i;
        this.d = uri2;
    }

    @Override // defpackage.dkpi
    public final Boolean a() {
        return this.b;
    }

    @Override // defpackage.dkpi
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkpf)) {
            return false;
        }
        dkpf dkpfVar = (dkpf) obj;
        return fdbq.f(this.a, dkpfVar.a) && fdbq.f(this.b, dkpfVar.b) && fdbq.f(this.c, dkpfVar.c) && this.e == dkpfVar.e && fdbq.f(this.d, dkpfVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.e) * 31;
        Uri uri = this.d;
        return iHashCode3 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Glide(uri=");
        sb.append(this.a);
        sb.append(", forceClipToCircle=");
        sb.append(this.b);
        sb.append(", signature=");
        sb.append(this.c);
        sb.append(", monogramBadge=");
        sb.append((Object) (this.e != 1 ? "VERIFIED" : "NONE"));
        sb.append(", fallbackUri=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
