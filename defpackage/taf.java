package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taf {
    public final boolean a;
    public final UUID b;
    public final boolean c;
    public final tab d;
    private final enoq e;

    public /* synthetic */ taf(boolean z, UUID uuid, enoq enoqVar, boolean z2, tab tabVar, int i) {
        this.a = z;
        this.b = (i & 2) != 0 ? null : uuid;
        this.e = (i & 4) != 0 ? null : enoqVar;
        this.c = (!((i & 8) == 0)) | z2;
        this.d = tabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taf)) {
            return false;
        }
        taf tafVar = (taf) obj;
        return this.a == tafVar.a && fdbq.f(this.b, tafVar.b) && this.e == tafVar.e && this.c == tafVar.c && fdbq.f(this.d, tafVar.d);
    }

    public final int hashCode() {
        UUID uuid = this.b;
        int iHashCode = uuid == null ? 0 : uuid.hashCode();
        boolean z = this.a;
        enoq enoqVar = this.e;
        return (((((((tae.a(z) * 31) + iHashCode) * 31) + (enoqVar != null ? enoqVar.hashCode() : 0)) * 31) + tae.a(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GetMetadataResult(isSuccess=" + this.a + ", sessionId=" + this.b + ", failureReason=" + this.e + ", shouldLog=" + this.c + ", result=" + this.d + ")";
    }
}
