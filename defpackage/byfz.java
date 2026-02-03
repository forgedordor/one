package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byfz extends byqh {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;

    public byfz(boolean z, int i, int i2, int i3, long j, long j2, long j3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
    }

    @Override // defpackage.byqh
    public final int a() {
        return this.b;
    }

    @Override // defpackage.byqh
    public final int b() {
        return this.d;
    }

    @Override // defpackage.byqh
    public final int c() {
        return this.c;
    }

    @Override // defpackage.byqh
    public final long d() {
        return this.f;
    }

    @Override // defpackage.byqh
    public final long e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byqh) {
            byqh byqhVar = (byqh) obj;
            if (this.a == byqhVar.g() && this.b == byqhVar.a() && this.c == byqhVar.c() && this.d == byqhVar.b() && this.e == byqhVar.f() && this.f == byqhVar.d() && this.g == byqhVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.byqh
    public final long f() {
        return this.e;
    }

    @Override // defpackage.byqh
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        int i = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i2 = this.d;
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        return ((((((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SchedulingResult{isNewWorkScheduled=" + this.a + ", nextMaxBackupKeyIndex=" + this.b + ", nextMaxKeyType=" + this.c + ", nextMaxKeyIndex=" + this.d + ", nextMaxParticipantId=" + this.e + ", nextMaxConversationId=" + this.f + ", nextMaxMessageTimestampMillis=" + this.g + "}";
    }
}
