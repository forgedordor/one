package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rup implements res {
    private final String b;
    private final long c;

    public rup(String str, long j) {
        this.b = str == null ? "" : str;
        this.c = j;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(0).array());
        messageDigest.update(this.b.getBytes(a));
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rup rupVar = (rup) obj;
        return this.c == rupVar.c && this.b.equals(rupVar.b);
    }

    @Override // defpackage.res
    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
    }
}
