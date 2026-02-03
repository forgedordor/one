package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehvx extends ehwb {
    public final long a;
    public final long b;
    public final Map c;
    public final boolean d;

    public ehvx(long j, long j2, Map map, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = map;
        this.d = z;
    }

    @Override // defpackage.ehwb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ehwb
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ehwb
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.ehwb
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehwb) {
            ehwb ehwbVar = (ehwb) obj;
            if (this.a == ehwbVar.a() && this.b == ehwbVar.b() && ekmi.m(this.c, ehwbVar.c()) && this.d == ehwbVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + ekmi.g(this.c) + ", allowMultiprocess=" + this.d + "}";
    }
}
