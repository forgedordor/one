package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amxk extends amxo {
    private final long a;
    private final long b;
    private final boolean c;

    public amxk(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    @Override // defpackage.amxo, defpackage.amxz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.amxo, defpackage.amxz
    public final long b() {
        return this.b;
    }

    @Override // defpackage.amxo, defpackage.amxz
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amxo) {
            amxo amxoVar = (amxo) obj;
            if (this.a == amxoVar.a() && this.b == amxoVar.b() && this.c == amxoVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.c ? 1237 : 1231;
        long j = this.a;
        long j2 = this.b;
        return i ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "BugleFileTransfer{bytesTransferred=" + this.a + ", totalBytesInFile=" + this.b + ", isFinished=" + this.c + "}";
    }
}
