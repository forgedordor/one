package defpackage;

import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwkl extends dwkn {
    private final KeyPair a;

    public dwkl(KeyPair keyPair) {
        this.a = keyPair;
    }

    @Override // defpackage.dwkn, defpackage.dwjt
    public final KeyPair a() {
        return this.a;
    }

    @Override // defpackage.dwjt
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dwjt) {
            dwjt dwjtVar = (dwjt) obj;
            if (dwjtVar.b() == 2 && this.a.equals(dwjtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{ecdsa=" + this.a.toString() + "}";
    }
}
