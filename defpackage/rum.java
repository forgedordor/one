package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rum implements res {
    private final int b;
    private final res c;

    public rum(int i, res resVar) {
        this.b = i;
        this.c = resVar;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rum) {
            rum rumVar = (rum) obj;
            if (this.b == rumVar.b && this.c.equals(rumVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return rvk.f(this.c, this.b);
    }
}
