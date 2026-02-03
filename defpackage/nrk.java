package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrk extends nrg {
    public final String a;
    public final byte[] b;

    public nrk(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nrk nrkVar = (nrk) obj;
            if (Objects.equals(this.a, nrkVar.a) && Arrays.equals(this.b, nrkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // defpackage.nrg
    public final String toString() {
        return this.f + ": owner=" + this.a;
    }
}
