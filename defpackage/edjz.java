package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edjz extends edht {
    private final String a;
    private final String b;
    private final long c;
    private final long d;

    public edjz(String str, String str2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.edht
    public final long a() {
        return this.c;
    }

    @Override // defpackage.edht
    public final long b() {
        return this.d;
    }

    @Override // defpackage.edht
    public final String c() {
        return this.a;
    }

    @Override // defpackage.edht
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edht) {
            edht edhtVar = (edht) obj;
            if (this.a.equals(edhtVar.c()) && this.b.equals(edhtVar.d()) && this.c == edhtVar.a() && this.d == edhtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.d;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        return (((iHashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "ArtCollection{name=" + this.a + ", url=" + this.b + ", id=" + this.c + ", numImages=" + this.d + "}";
    }
}
