package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czey extends czje {
    public final Uri a;
    private final int b;
    private final int c;
    private final long d;
    private final String e;

    public czey(Uri uri, int i, int i2, long j, String str) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
    }

    @Override // defpackage.czje
    public final int a() {
        return this.c;
    }

    @Override // defpackage.czje
    public final int b() {
        return this.b;
    }

    @Override // defpackage.czje
    public final long c() {
        return this.d;
    }

    @Override // defpackage.czje
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.czje
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czje) {
            czje czjeVar = (czje) obj;
            if (this.a.equals(czjeVar.d()) && this.b == czjeVar.b() && this.c == czjeVar.a() && this.d == czjeVar.c() && this.e.equals(czjeVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((((iHashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "MediaResult{uri=" + this.a.toString() + ", width=" + this.b + ", height=" + this.c + ", durationMillis=" + this.d + ", contentType=" + this.e + "}";
    }
}
