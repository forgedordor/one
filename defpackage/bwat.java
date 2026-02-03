package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwat extends bwgf {
    private final boolean a;
    private final Optional b;

    public bwat(boolean z, Optional optional) {
        this.a = z;
        this.b = optional;
    }

    @Override // defpackage.bwgf
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.bwgf
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwgf) {
            bwgf bwgfVar = (bwgf) obj;
            if (this.a == bwgfVar.b() && this.b.equals(bwgfVar.a())) {
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
