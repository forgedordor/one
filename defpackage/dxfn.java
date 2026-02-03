package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfn extends dxfy {
    public final Long a;
    public final long b;

    public dxfn(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    @Override // defpackage.dxfy
    public final long a() {
        return this.b;
    }

    @Override // defpackage.dxfy
    public final Long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxfy) {
            dxfy dxfyVar = (dxfy) obj;
            Long l = this.a;
            if (l != null ? l.equals(dxfyVar.b()) : dxfyVar.b() == null) {
                if (this.b == dxfyVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + "}";
    }
}
