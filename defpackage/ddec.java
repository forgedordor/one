package defpackage;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddec {
    public final KeyPair a;
    public final long b;

    public ddec(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final String a() {
        return ddet.b(this.a.getPrivate().getEncoded());
    }

    public final String b() {
        return ddet.b(this.a.getPublic().getEncoded());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ddec)) {
            return false;
        }
        ddec ddecVar = (ddec) obj;
        if (this.b == ddecVar.b) {
            KeyPair keyPair = this.a;
            PublicKey publicKey = keyPair.getPublic();
            KeyPair keyPair2 = ddecVar.a;
            if (publicKey.equals(keyPair2.getPublic()) && keyPair.getPrivate().equals(keyPair2.getPrivate())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        KeyPair keyPair = this.a;
        return Arrays.hashCode(new Object[]{keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.b)});
    }
}
