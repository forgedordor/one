package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caou extends capj {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final long g;
    private final long h;
    private final emct i;

    public caou(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, emct emctVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = j;
        this.h = j2;
        this.i = emctVar;
    }

    @Override // defpackage.capj
    public final int a() {
        return this.f;
    }

    @Override // defpackage.capj
    public final int b() {
        return this.e;
    }

    @Override // defpackage.capj
    public final int c() {
        return this.d;
    }

    @Override // defpackage.capj
    public final int d() {
        return this.c;
    }

    @Override // defpackage.capj
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof capj) {
            capj capjVar = (capj) obj;
            if (this.a == capjVar.f() && this.b == capjVar.e() && this.c == capjVar.d() && this.d == capjVar.c() && this.e == capjVar.b() && this.f == capjVar.a() && this.g == capjVar.h() && this.h == capjVar.g() && this.i.equals(capjVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.capj
    public final int f() {
        return this.a;
    }

    @Override // defpackage.capj
    public final long g() {
        return this.h;
    }

    @Override // defpackage.capj
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        long j = this.h;
        int i = this.a;
        emct emctVar = this.i;
        long j2 = this.g;
        return ((((int) (j ^ (j >>> 32))) ^ ((((((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003)) * 1000003) ^ emctVar.hashCode();
    }

    @Override // defpackage.capj
    public final emct i() {
        return this.i;
    }

    public final String toString() {
        return "ClearcutLoggingInfo{unknownSenderCount=" + this.a + ", restoreSkippedItemCount=" + this.b + ", numOfParticipantsTotalToRestore=" + this.c + ", numOfParticipantsRestored=" + this.d + ", numOfConvTotalToRestore=" + this.e + ", numOfConvRestored=" + this.f + ", numOfMsgTotalToRestore=" + this.g + ", numOfMsgRestored=" + this.h + ", initialRestoreTimingStats=" + this.i.toString() + "}";
    }
}
