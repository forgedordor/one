package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciup extends ciuu {
    public final Optional a;
    public final Optional b;

    public ciup(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.ciuu
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.ciuu
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciuu) {
            ciuu ciuuVar = (ciuu) obj;
            if (this.a.equals(ciuuVar.b()) && this.b.equals(ciuuVar.a())) {
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
        return "RcsGroupTelephonyDataParseResult{rcsGroupTelephonyData=" + String.valueOf(this.a) + ", parseError=" + String.valueOf(optional) + "}";
    }
}
