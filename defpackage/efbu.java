package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbu extends efdp {
    private final efdo a;
    private final Optional b;

    public efbu(efdo efdoVar, Optional optional) {
        this.a = efdoVar;
        this.b = optional;
    }

    @Override // defpackage.efdp
    public final efdo a() {
        return this.a;
    }

    @Override // defpackage.efdp
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efdp) {
            efdp efdpVar = (efdp) obj;
            if (this.a.equals(efdpVar.a()) && this.b.equals(efdpVar.b())) {
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
        return "FileTransferInformation{fileInformation=" + this.a.toString() + ", thumbnailInformation=" + optional.toString() + "}";
    }
}
