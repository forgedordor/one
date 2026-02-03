package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfqg extends dftb {
    private final Optional a;
    private final Optional b;

    public dfqg(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.dftb
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.dftb
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dftb) {
            dftb dftbVar = (dftb) obj;
            if (this.a.equals(dftbVar.a()) && this.b.equals(dftbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ReceiveMessageRequest{message=" + String.valueOf(this.a) + ", session=" + String.valueOf(optional) + "}";
    }
}
