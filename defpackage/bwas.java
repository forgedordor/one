package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwas extends bwgo {
    private final boolean a;
    private final Optional b;

    public bwas(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }

    @Override // defpackage.bwgo
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.bwgo
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwgo) {
            bwgo bwgoVar = (bwgo) obj;
            if (this.a == bwgoVar.b() && this.b.equals(bwgoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FailToDecryptResult{successful=" + this.a + ", newIdentityKey=" + this.b.toString() + "}";
    }
}
